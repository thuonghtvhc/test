package controller.bts;

import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import controller.bts.BaseController;
import dao.bts.RAlarmLogDAO;
import dao.bts.RalarmRogActiveCiscoDAO;
import vo.bts.RAlarmLog;
import vo.bts.RalarmRogActiveCisco;
import vo.alarm.utils.DateTools;  // class nay cua 2 du an la giong nhau

@Controller
@RequestMapping("/exportExcel-new/*")
public class ExportExcelControllerNew extends BaseController {

	@Autowired
	private RAlarmLogDAO rAlarmLogDAO;
	@Autowired
	private RalarmRogActiveCiscoDAO ralarmRogActive;
	private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	@RequestMapping("alarmLog")
	public String alarmLog(@RequestParam(required = false) String sdateF, @RequestParam(required = false) String sdateT,
			@RequestParam(required = false) String edateF, @RequestParam(required = false) String edateT,
			@RequestParam(required = false) String bscid, @RequestParam(required = false) String cellid,
			@RequestParam(required = false) String vendor, @RequestParam(required = false) String district,
			@RequestParam(required = false) String alarmName, @RequestParam(required = false) String province,
			@RequestParam(required = false) String team, @RequestParam(required = false) String alarmType,
			@RequestParam(required = false) String alarmMappingName,
			@RequestParam(required = false) String statusFinish, @RequestParam(required = false) String severity,
			@RequestParam(required = false) String network, @RequestParam(required = true) String function,
			@RequestParam(required = true) String statusView, @RequestParam(required = false) String duaration,
			@RequestParam(required = true) String typeExport, @RequestParam(required = false) String region,
			@RequestParam(required = false) String unAlarmMappingName, @RequestParam(required = false) String severityF,
			@RequestParam(required = false) String statusProcess, @RequestParam(required = false) String center,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();

		// Kiem tra dieu kien tim kiem
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());

		if (sdateF == null || sdateF.equals("")
				|| (sdateF != null && !sdateF.equals("") && DateTools.isValid("dd/MM/yyyy HH:mm", sdateF) == false)) {
			sdateF = df.format(cal.getTime()) + " " + "00:00";
		}

		if (sdateT == null || sdateT.equals("")
				|| (sdateT != null && !sdateT.equals("") && DateTools.isValid("dd/MM/yyyy HH:mm", sdateT) == false)) {
			sdateT = df.format(cal.getTime()) + " " + "23:59";
		}
		sdateF = sdateF + ":00";
		sdateT = sdateT + ":00";
		if (bscid != null) {
			bscid = bscid.trim();
		} else {
			bscid = "";
		}
		if (cellid != null) {
			cellid = cellid.trim();
		} else {
			cellid = "";
		}
		if (district != null) {
			district = district.trim();
		} else {
			district = "";
		}
		if (vendor != null) {
			vendor = vendor.trim();
		} else {
			vendor = "";
		}
		if (alarmName != null) {
			alarmName = alarmName.trim();
		} else {
			alarmName = "";
		}
		if (province != null) {
			province = province.trim();
		} else {
			province = "";
		}
		if (team != null) {
			team = team.trim();
		} else {
			team = "";
		}
		if (alarmType != null) {
			alarmType = alarmType.trim();
		} else {
			alarmType = "";
		}
		if (alarmMappingName != null) {
			alarmMappingName = alarmMappingName.trim();
		} else {
			alarmMappingName = "";
		}
		if (severity != null && severity.length() > 0) {
			severity = severity.trim();
			severityF = severity;
		} else {
			severity = "";
		}

		String nameTable = "R_ALARM_LOG";
		if (network != null && !network.equals("2G") && !network.equals("3G")) {
			nameTable = nameTable + network;
		}
		try {

			if (typeExport == null || typeExport.equals("")) {
				typeExport = "xlsx";
			}
			String ext = typeExport;
			String dataDir = "/u02";
			String uploadPath = dataDir.concat("/export/" + typeExport);
			// Tạo ra các thư mục nếu nó không tồn tại
			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists()) {
				uploadDir.mkdirs();
			}

			Calendar currentDate = Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
			String dateNow = formatter.format(currentDate.getTime());
			
			String fileName = "AlarmLog" + function + center + network;
		
			ServletOutputStream sos = response.getOutputStream();
			response.setContentType("application/zip");
			response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + dateNow + ".zip\"");

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ZipOutputStream zos = new ZipOutputStream(baos);
			byte bytes[] = new byte[1024];

			String fileNameA = fileName + dateNow;
	
			String outfile = fileNameA + "." + ext;
			File tempFile = new File(uploadPath + "/" + outfile);

			//List<RAlarmLog> alarmList = new ArrayList<RAlarmLog>();
			List<RalarmRogActiveCisco> alarmList = new ArrayList<RalarmRogActiveCisco>();
			// Laays du lieu vaof list
			/*alarmList = rAlarmLogDAO.getRAlarmLog(sdateF, sdateT, edateF, edateT, bscid, cellid, vendor, district,
					alarmName, function, severityF, null, null, null, null, null, network, username, province, team,
					alarmType, alarmMappingName, statusFinish, statusView, duaration, region, unAlarmMappingName,
					statusProcess, center);*/
			alarmList = ralarmRogActive.ralarmList(
					network,	severity,	region,		null,
					sdateF, 	sdateT , 	edateF, 	edateT,
					province, 	district,	bscid, 		team,
					alarmType,	vendor,		cellid, 	duaration);
			if (ext.equals("xlsx")) {
				exportAlarmLog(tempFile, alarmList);
			} else {
				//exportAlarmLogCSV(tempFile, alarmList);
			}

			FileInputStream fis = new FileInputStream(tempFile);
			BufferedInputStream bis = new BufferedInputStream(fis);

			zos.putNextEntry(new ZipEntry(tempFile.getName()));

			int bytesRead;
			while ((bytesRead = bis.read(bytes)) != -1) {
				zos.write(bytes, 0, bytesRead);
			}
			zos.closeEntry();
			bis.close();
			fis.close();
			tempFile.delete();
	
			zos.flush();
			baos.flush();
			zos.close();
			baos.close();

			byte[] zip = baos.toByteArray();
			sos.write(zip);
			sos.flush();
		} catch (Exception exp) {
			exp.printStackTrace();
		}

		return null;
	}


	// TRUNGNQ dung SXSSFWorkbook de export so luong lon record
	private void exportAlarmLog(File file, List<RalarmRogActiveCisco> alarmList) throws IOException {
		/*String[] headers = new String[] {"NE", "SITE", "CELLID", "SDATE", "EDATE", "DUARATION", "ALARM TYPE", "SEVERITY",
				"ALARM NAME", "ALARM INFO", "ALARM ID", "ALARM MAPPING ID", "ALARM MAPPING NAME",
				"STATUS VIEW", "ACK STATUS", "ACK TIME", "ACK USER", "SHIFTID", "DISTRICT" ,"DEPT",
				"CAUSE BY", "ACTION PROCESS", "CAUSEBY SYS", "DESCRIPTION", "NETWORK",
				"VENDOR", "BSCPORT", "BTSPORT", "TEAM", "SUB TEAM", "NOTE", "CREATED BY", "CREATE DATE",
				"MODIFIED BY", "MODIFY DATE", "NE TYPE", "REP COUNT", "CH TYPE", "OBJECT REFERENCE",
				"SLOT", "FM ALARMID", "OBJ TYPE", "CLR STATUS", "PROVINCE", "EVTTYPE", "STATUS", "DANH_GIA_SLA"
		};*/
		String[] headers = new String[] 
				{
						"ACK_STATUS", "ACK_TIME", "ACK_USER", "ACTION_PROCESS", "ALARM_ID", 
						"ALARM_INFO", "ALARM_KEY_ERICSSON", "ALARM_MAPPING_ID",	"ALARM_MAPPING_NAME", "ALARM_NAME", 
						"ALARM_TYPE", "ALARM_TYPE_SUB", "ALERTED_SOUND","BSCPORT", "ACK STATUS", "BTSPORT", 
						"CAUSEBY", "CAUSEBY_SYS", "CAUSED_FINISH" ,"CELLID","CH_TYPE", 
						"CLR_STATUS", "CCREATED_BY", "CREATED_DATE_CHECK", "CREATE_DATE","DANH_GIA_SLA", 
						"DEPT", "DESCRIPTION", "DE_XUAT", "DIP", "DISTRICT", 
						"EDATE", "EVTTYPE","FM_ALARMID", "GROUPS", "HE_THONG_CHUYEN", 
						"ID", "IS_MLL", "IS_SMS","KET_QUA", "MD_EDATE", 
						"MD_SDATE", "MO", "MODIFIED_BY", "MODIFY_DATE", "NE"
		};
		
		
		
		SXSSFWorkbook workbook = new SXSSFWorkbook();
		SXSSFSheet sheet = workbook.createSheet();
		XSSFCellStyle style =  (XSSFCellStyle) workbook.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);
		//style.setFillForegroundColor(new XSSFColor());  
		//new Color(146, 208, 80);
		
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		//sheet.setRandomAccessWindowSize(100);
		int rowNum = 0;
		
		Row row = sheet.createRow(rowNum++);
		for (int i = 0; i < headers.length; i++) {
			Cell cell = row.createCell(i);
			cell.setCellValue(headers[i]);
			cell.setCellStyle(style);
		}
		
		int colNum;
		for (RalarmRogActiveCisco alarm : alarmList) {
			row = sheet.createRow(rowNum++);
			colNum = 0;
			
			Cell cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getAckStatus());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getAckTimeStr());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getAckUser());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getActionProcess());
			
			
			String shiftId = "";
			if (alarm.getAlarmId() != null) {
				shiftId = String.valueOf(alarm.getAlarmId());
			}
			cell = row.createCell(colNum++);
			cell.setCellValue(shiftId);
			// 1
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getAlarmInfo());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getAlarmKeyEricsson());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getAlarmMappingId());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getAlarmMappingName());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getAlarmName());
			// 2
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getAlarmType());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getAlarmTypeSub());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getAlertedSound());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getBscport());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getBtsport());
			//3
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getCauseby());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getCausebySys());
			
			/*String shiftId = "";
			if (alarm.getShiftId() != null) {
				shiftId = String.valueOf(alarm.getShiftId());
			}*/
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getCausedFinish());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getCellid());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getChType());
			// 4
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getClrStatus());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getCreatedBy());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getCreatedDateCheckStr());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getCreateDateStr());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getDanhGiaSla());
			// 5
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getDept());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getDescription());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getDeXuat());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getDip());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getDistrict());
			// 6
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getEdateStr());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getEvttype());
			
			String fm = "";
			if (alarm.getFmAlarmid() != null) {
				fm=String.valueOf(alarm.getFmAlarmid());
			}
			cell = row.createCell(colNum++);
			cell.setCellValue(fm);
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getGroups());
					
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getHeThongChuyen());
			// 7
			
			String idtr = "";
			if (alarm.getId() != null) {
				idtr = String.valueOf(alarm.getId());
			}
			cell = row.createCell(colNum++);
			cell.setCellValue(idtr);
			
			//String repCount = alarm.getRepCount() == null ? "" : String.valueOf(alarm.getRepCount());
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getIsMll());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getIsSms());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getKetQua());
			
			//String slot = alarm.getSlot() == null ? "" : String.valueOf(alarm.getSlot()); 
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getMdEdateStr());
			// 8
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getMdSdateStr());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getMo());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getModifiedBy());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getModifyDateStr());
			
			cell = row.createCell(colNum++);
			cell.setCellValue(alarm.getNe());
			//9
				
			
		}
		FileOutputStream outputStream = new FileOutputStream(file);
		workbook.write(outputStream);
		workbook.close();
		workbook.dispose();
		
	}





	private void exportAlarmLogCSV(File tempFile, List<RAlarmLog> alarmList) {
		String CSV_SEPARATOR = ";";
		Writer writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tempFile.getPath()), "UTF-8"));
			String lineHeader = "";
			lineHeader = lineHeader + "NE" + CSV_SEPARATOR + "SITE" + CSV_SEPARATOR + "CELLID" + CSV_SEPARATOR + "SDATE"
					+ CSV_SEPARATOR + "EDATE" + CSV_SEPARATOR + "DUARATION" + CSV_SEPARATOR + "ALARM TYPE"
					+ CSV_SEPARATOR + "SEVERITY" + CSV_SEPARATOR + "ALARM NAME" + CSV_SEPARATOR + "ALARM INFO"
					+ CSV_SEPARATOR + "ALARM ID" + CSV_SEPARATOR + "ALARM MAPPING ID" + CSV_SEPARATOR
					+ "ALARM MAPPING NAME" + CSV_SEPARATOR + "STATUS VIEW" + CSV_SEPARATOR + "ACK STATUS"
					+ CSV_SEPARATOR + "ACK TIME" + CSV_SEPARATOR + "ACK USER" + CSV_SEPARATOR + "SHIFTID"
					+ CSV_SEPARATOR + "DISTRICT" + CSV_SEPARATOR + "DEPT" + CSV_SEPARATOR + "CAUSE BY" + CSV_SEPARATOR
					+ "ACTION PROCESS" + CSV_SEPARATOR + "CAUSEBY SYS" + CSV_SEPARATOR + "DESCRIPTION" + CSV_SEPARATOR
					+ "NETWORK" + CSV_SEPARATOR + "VENDOR" + CSV_SEPARATOR + "BSCPORT" + CSV_SEPARATOR + "BTSPORT"
					+ CSV_SEPARATOR + "TEAM" + CSV_SEPARATOR + "SUB TEAM" + CSV_SEPARATOR + "NOTE" + CSV_SEPARATOR
					+ "CREATED BY" + CSV_SEPARATOR + "CREATE DATE" + CSV_SEPARATOR + "MODIFIED BY" + CSV_SEPARATOR
					+ "MODIFY DATE" + CSV_SEPARATOR + "NE TYPE" + CSV_SEPARATOR + "REP COUNT" + CSV_SEPARATOR
					+ "CH TYPE" + CSV_SEPARATOR + "OBJECT REFERENCE" + CSV_SEPARATOR + "SLOT" + CSV_SEPARATOR
					+ "FM ALARMID" + CSV_SEPARATOR + "OBJ TYPE" + CSV_SEPARATOR + "CLR STATUS" + CSV_SEPARATOR
					+ "PROVINCE" + CSV_SEPARATOR + "EVTTYPE" + CSV_SEPARATOR + "STATUS" + CSV_SEPARATOR;

			lineHeader += System.getProperty("line.separator");
			writer.write(lineHeader);
			for (RAlarmLog alarmlog : alarmList) {
				String line = "";
				line = line + alarmlog.getNe() + CSV_SEPARATOR + alarmlog.getSite() + CSV_SEPARATOR
						+ alarmlog.getCellid() + CSV_SEPARATOR + alarmlog.getSdateStr() + CSV_SEPARATOR
						+ alarmlog.getEdateStr() + CSV_SEPARATOR
						+ (alarmlog.getDuaration() == null ? 0 : alarmlog.getDuaration()) + CSV_SEPARATOR
						+ alarmlog.getAlarmType() + CSV_SEPARATOR + alarmlog.getSeverity() + CSV_SEPARATOR
						+ alarmlog.getAlarmName() + CSV_SEPARATOR + alarmlog.getAlarmInfo() + CSV_SEPARATOR
						+ (alarmlog.getAlarmId() == null ? 0 : alarmlog.getAlarmId()) + CSV_SEPARATOR
						+ alarmlog.getAlarmMappingId() + CSV_SEPARATOR + alarmlog.getAlarmMappingName() + CSV_SEPARATOR
						+ alarmlog.getStatusView() + CSV_SEPARATOR + alarmlog.getAckStatus() + CSV_SEPARATOR
						+ alarmlog.getAckTimeStr() + CSV_SEPARATOR + alarmlog.getAckUser() + CSV_SEPARATOR
						+ (alarmlog.getShiftId() == null ? 0 : alarmlog.getShiftId()) + CSV_SEPARATOR
						+ alarmlog.getDistrict() + CSV_SEPARATOR + alarmlog.getDept() + CSV_SEPARATOR
						+ alarmlog.getCauseby() + CSV_SEPARATOR + alarmlog.getActionProcess() + CSV_SEPARATOR
						+ alarmlog.getCausebySys() + CSV_SEPARATOR + alarmlog.getDescription() + CSV_SEPARATOR
						+ alarmlog.getNetwork() + CSV_SEPARATOR + alarmlog.getVendor() + CSV_SEPARATOR
						+ alarmlog.getBscport() + CSV_SEPARATOR + alarmlog.getBtsport() + CSV_SEPARATOR
						+ alarmlog.getTeam() + CSV_SEPARATOR + alarmlog.getGroups() + CSV_SEPARATOR + alarmlog.getNote()
						+ CSV_SEPARATOR + alarmlog.getCreatedBy() + CSV_SEPARATOR + alarmlog.getCreateDateStr()
						+ CSV_SEPARATOR + alarmlog.getModifiedBy() + CSV_SEPARATOR + alarmlog.getModifyDateStr()
						+ CSV_SEPARATOR + alarmlog.getNeType() + CSV_SEPARATOR
						+ (alarmlog.getRepCount() == null ? 0 : alarmlog.getRepCount()) + CSV_SEPARATOR
						+ alarmlog.getChType() + CSV_SEPARATOR + alarmlog.getObjectReference() + CSV_SEPARATOR
						+ (alarmlog.getSlot() == null ? 0 : alarmlog.getSlot()) + CSV_SEPARATOR
						+ (alarmlog.getFmAlarmid() == null ? 0 : alarmlog.getFmAlarmid()) + CSV_SEPARATOR
						+ alarmlog.getObjType() + CSV_SEPARATOR + alarmlog.getClrStatus() + CSV_SEPARATOR
						+ alarmlog.getProvince() + CSV_SEPARATOR + alarmlog.getEvttype() + CSV_SEPARATOR
						+ alarmlog.getStatus() + CSV_SEPARATOR;
				line += System.getProperty("line.separator");
				line = line.replaceAll("null;", ";");
				writer.write(line);
			}
		}

		catch (IOException e) {
			System.out.println("export file :" + e);
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (Exception e) {
					System.out.println("OUT file :" + e);
				}
			}
		}
	}

}
