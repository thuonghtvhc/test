package dao.bts;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import vo.bts.CountAlarmLog;
import vo.bts.RAlarmLog;
import vo.bts.SYS_PARAMETER;

public class RAlarmLogDAOImpl extends SqlMapClientDaoSupport implements RAlarmLogDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table R_ALARM_LOG
     *
     * @ibatorgenerated Mon Dec 09 08:30:21 ICT 2013
     */
    public RAlarmLogDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table R_ALARM_LOG
     *
     * @ibatorgenerated Mon Dec 09 08:30:21 ICT 2013
     */
    public int deleteByPrimaryKey(String id) {
        RAlarmLog key = new RAlarmLog();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("R_ALARM_LOG1.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table R_ALARM_LOG
     *
     * @ibatorgenerated Mon Dec 09 08:30:21 ICT 2013
     */
    public void insert(RAlarmLog record) {
        getSqlMapClientTemplate().insert("R_ALARM_LOG1.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table R_ALARM_LOG
     *
     * @ibatorgenerated Mon Dec 09 08:30:21 ICT 2013
     */
    public void insertSelective(RAlarmLog record) {
        getSqlMapClientTemplate().insert("R_ALARM_LOG1.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table R_ALARM_LOG
     *
     * @ibatorgenerated Mon Dec 09 08:30:21 ICT 2013
     */
    public RAlarmLog selectByPrimaryKey(String id) {
        RAlarmLog key = new RAlarmLog();
        key.setId(id);
        RAlarmLog record = (RAlarmLog) getSqlMapClientTemplate().queryForObject("R_ALARM_LOG1.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table R_ALARM_LOG
     *
     * @ibatorgenerated Mon Dec 09 08:30:21 ICT 2013
     */
    public int updateByPrimaryKeySelective(RAlarmLog record) {
        int rows = getSqlMapClientTemplate().update("R_ALARM_LOG1.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table R_ALARM_LOG
     *
     * @ibatorgenerated Mon Dec 09 08:30:21 ICT 2013
     */
    public int updateByPrimaryKey(RAlarmLog record) {
        int rows = getSqlMapClientTemplate().update("R_ALARM_LOG1.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }
    
    @SuppressWarnings("unchecked")
   	@Override
   	public List<RAlarmLog> getAlarmLogAtShift(String netWork, String day,
   			String alarmType, String status, String bsc, String cell) {
   		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_NETWORK", netWork);
   		parms.put("P_DAY", day);
   		parms.put("P_ALARM_TYPE", alarmType);
   		parms.put("P_STATUS", status);
   		parms.put("P_BSCID", bsc);
   		parms.put("P_CELLID", cell);
   		parms.put("P_DATA", null);
   		return getSqlMapClientTemplate().queryForList("R_ALARM_LOG1.getAlarmLogAtShift", parms);
   	}

   /*    @SuppressWarnings("unchecked")
   	@Override
   	public List<RAlarmLog> getAlarmLogSameAtShift(String netWork, String operator,
   			String system, String alarmType, String sdate, String edate) {
       	Map<String, Object> parms = new HashMap<String, Object>();
       	parms.put("P_NETWORK", netWork);
       	parms.put("P_BSCID", operator);
   		parms.put("P_CELLID", system);
   		parms.put("P_ALARM_TYPE", alarmType);
   		parms.put("P_SDATE", sdate);
   		parms.put("P_EDATE", edate);
   		parms.put("P_DATA", null);	
   		return getSqlMapClientTemplate().queryForList("R_ALARM_LOG.getAlarmLogSameAtShift", parms);
   	}*/

   	@Override
   	public int updateShiftID(String netWork, String id, String shiftId) {
   		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_NETWORK", netWork);
       	parms.put("P_ID", id);
   		parms.put("P_SHIFT_ID", shiftId);
           int rows = getSqlMapClientTemplate().update("R_ALARM_LOG1.updateShiftID", parms);
           return rows;
   	}

   	
   	@SuppressWarnings("unchecked")
   	@Override
	public List<SYS_PARAMETER> titleForm(String function, String network,
			String typeForm) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("P_TYPE", function);
		map.put("P_NETWORK", network);
		map.put("P_FORM", typeForm);
		map.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("R_ALARM_LOG1.titleForm", map);
	}

	@Override
	public int deleteAlarmLog(int id, String function) {
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_TYPE", function);
       	parms.put("P_ID", id);
       int rows = getSqlMapClientTemplate().delete("R_ALARM_LOG1.deleteAlarmLog", parms);
       return rows;
	}

	@Override
	public RAlarmLog selectByPrimaryKey(int id, String function) {
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_TYPE", function);
       	parms.put("P_ID", id);
        RAlarmLog record = (RAlarmLog) getSqlMapClientTemplate().queryForObject("R_ALARM_LOG1.selectByPrimaryKey", parms);
        return record;
	}

	@Override
	public int insert(RAlarmLog alarmLog, String function) {
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_SDATE", alarmLog.getSdate());
   		parms.put("P_EDATE", alarmLog.getEdate());
   		parms.put("P_NE", alarmLog.getNe());
   		parms.put("P_SITE", alarmLog.getSite());
   		parms.put("P_CELLID", alarmLog.getCellid());
   		parms.put("P_VENDOR", alarmLog.getVendor());
   		parms.put("P_DISTRICT", alarmLog.getDistrict());
   		parms.put("P_ALARM_TYPE", alarmLog.getAlarmType());
   		parms.put("P_NETWORK", alarmLog.getNetwork());
   		parms.put("P_SEVERITY", alarmLog.getSeverity());
   		parms.put("P_ALARM_INFO", alarmLog.getAlarmInfo());
   		parms.put("P_ALARM_MAPPING_ID", alarmLog.getAlarmMappingId());
   		parms.put("P_ALARM_MAPPING_NAME", alarmLog.getAlarmMappingName());
   		parms.put("P_STATUS_VIEW", alarmLog.getStatusView());
   		parms.put("P_ACK_STATUS", alarmLog.getAckStatus());
   		parms.put("P_ACK_USER", alarmLog.getAckUser());
   		parms.put("P_ACK_TIME", alarmLog.getAckTime());
   		parms.put("P_DISTRICT", alarmLog.getDistrict());
   		parms.put("P_DEPT", alarmLog.getDept());
   		parms.put("P_CAUSEBY", alarmLog.getCauseby());
   		parms.put("P_ACTION_PROCESS", alarmLog.getActionProcess());
   		parms.put("P_CAUSEBY_SYS", alarmLog.getCausebySys());
   		parms.put("P_DESCRIPTION", alarmLog.getDescription());
   		parms.put("P_TEAM", alarmLog.getTeam());
   		parms.put("P_TYPE", function);
   		parms.put("P_SHIFT_ID", alarmLog.getShiftId());
   		parms.put("P_CREATED_BY", alarmLog.getCreatedBy());
   		parms.put("P_CREATE_DATE", alarmLog.getCreateDate());
   		parms.put("P_MD_SDATE", alarmLog.getMdSdate());
           int rows = getSqlMapClientTemplate().update("R_ALARM_LOG1.insert", parms);
           return rows;
	}

	@Override
	public int update(RAlarmLog alarmLog, String function) {
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_ID", alarmLog.getId());
   		parms.put("P_SDATE", alarmLog.getSdate());
   		parms.put("P_EDATE", alarmLog.getEdate());
   		parms.put("P_NE", alarmLog.getNe());
   		parms.put("P_SITE", alarmLog.getSite());
   		parms.put("P_CELLID", alarmLog.getCellid());
   		parms.put("P_VENDOR", alarmLog.getVendor());
   		parms.put("P_DISTRICT", alarmLog.getDistrict());
   		parms.put("P_ALARM_TYPE", alarmLog.getAlarmType());
   		parms.put("P_NETWORK", alarmLog.getNetwork());
   		parms.put("P_SEVERITY", alarmLog.getSeverity());
   		parms.put("P_ALARM_INFO", alarmLog.getAlarmInfo());
   		parms.put("P_ALARM_MAPPING_ID", alarmLog.getAlarmMappingId());
   		parms.put("P_ALARM_MAPPING_NAME", alarmLog.getAlarmMappingName());
   		parms.put("P_STATUS_VIEW", alarmLog.getStatusView());
   		parms.put("P_ACK_STATUS", alarmLog.getAckStatus());
   		parms.put("P_ACK_USER", alarmLog.getAckUser());
   		parms.put("P_ACK_TIME", alarmLog.getAckTime());
   		parms.put("P_DISTRICT", alarmLog.getDistrict());
   		parms.put("P_DEPT", alarmLog.getDept());
   		parms.put("P_CAUSEBY", alarmLog.getCauseby());
   		parms.put("P_ACTION_PROCESS", alarmLog.getActionProcess());
   		parms.put("P_CAUSEBY_SYS", alarmLog.getCausebySys());
   		parms.put("P_DESCRIPTION", alarmLog.getDescription());
   		parms.put("P_TEAM", alarmLog.getTeam());
   		parms.put("P_TYPE", function);
   		parms.put("P_SHIFT_ID", alarmLog.getShiftId());
   		parms.put("P_MODIFIED_BY", alarmLog.getModifiedBy());
   		parms.put("P_MODIFY_DATE", alarmLog.getModifyDate());
   		parms.put("P_MD_SDATE", alarmLog.getMdSdate());
           int rows = getSqlMapClientTemplate().update("R_ALARM_LOG1.update", parms);
           return rows;
	}

	@Override
	public int ackAlarmLog(Integer id,Integer shiftID, String function,String userName,String statusEndTime,String etime) {
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_TYPE", function);
       	parms.put("P_ID", id);
   		parms.put("P_SHIFT_ID", shiftID);
   		parms.put("P_MODIFIED_BY", userName);
   		parms.put("P_STATUS_ENDTIME", statusEndTime);
   		parms.put("P_ETIME", etime);
        int rows = getSqlMapClientTemplate().update("R_ALARM_LOG1.ackAlarmLog", parms);
       return rows;
	}


	@Override
	public int unAckAlarmLog(Integer id, String function,String userName,String statusEndTime) {
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_TYPE", function);
       	parms.put("P_ID", id);
   		parms.put("P_MODIFIED_BY", userName);
   		parms.put("P_STATUS_ENDTIME", statusEndTime);
        int rows = getSqlMapClientTemplate().update("R_ALARM_LOG1.unAckAlarmLog", parms);
       return rows;
	}
	
	@SuppressWarnings("unchecked")
   	@Override
	public List<RAlarmLog> getRAlarmLogInfoFilter(String siteid) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("P_SITEID", siteid);
		map.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("R_ALARM_LOG1.getRAlarmLogInfoFilter", map);
	}
	//Lay danh sach alarm thong ke trong cham diem ca nhan. status: trang thai xu ly.
	@SuppressWarnings("unchecked")
	@Override
	public List<RAlarmLog> getAlarmDetailAssess(String dateF, String dateT,
			String catruc, String users, String status, String network,
			String neType, String severity,String columnheader, String strWhere,
			Integer startRecord, Integer endRecord,String sortfield,String sortorder) {
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_SDATE_FROM", dateF);
   		parms.put("P_SDATE_TO", dateT);
   		parms.put("P_SHIFT", catruc);
   		parms.put("P_USERS", users);
   		parms.put("P_STATUS", status);
   		parms.put("P_NETWORK", network);
   		parms.put("P_NETYPE", neType);
   		parms.put("P_SEVERITY", severity);
   		parms.put("P_COLUMNHEADER", columnheader);
   		parms.put("P_WHERE", strWhere);
   		parms.put("P_START_RECORD", startRecord);
   		parms.put("P_END_RECORD", endRecord);
   		parms.put("P_COLUMN", sortfield);
   		parms.put("P_ORDER", sortorder);
   		parms.put("P_DATA", null);
   		return getSqlMapClientTemplate().queryForList("R_ALARM_LOG1.getAlarmDetailAssess", parms);
	}

	@Override
	public int countAlarmDetailAssess(String dateF, String dateT,
			String catruc, String users, String status,String network,
			String neType, String severity,String columnheader,  String strWhere) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_SDATE_FROM", dateF);
   		parms.put("P_SDATE_TO", dateT);
   		parms.put("P_SHIFT", catruc);
   		parms.put("P_USERS", users);
   		parms.put("P_STATUS", status);
   		parms.put("P_NETWORK", network);
   		parms.put("P_NETYPE", neType);
   		parms.put("P_SEVERITY", severity);
   		parms.put("P_COLUMNHEADER", columnheader);
   		parms.put("P_WHERE", strWhere);
   		parms.put("P_DATA", null);
   		getSqlMapClientTemplate().queryForObject("R_ALARM_LOG1.countAlarmDetailAssess", parms);
          	Integer record = (Integer) parms.get("P_DATA");
          	return record;
	}
	//lay danh sach canh bao moi xuat hien can canh bao am thanh
	@SuppressWarnings("unchecked")
	@Override
	public List<RAlarmLog> getAlarmAlert(String sdateF, String sdateT,
			String edateF, String edateT, String bscid, String cellid,
			String vendor, String district, String alarmName, String function,
			String severity, String netWork, String username, String province,
			String team, String alarmType, String alarmMappingName,
			String statusFinish, String statusView,
			String region, String unAlarmMappingName) {
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_SDATE_FROM", sdateF);
   		parms.put("P_SDATE_TO", sdateT);
   		parms.put("P_EDATE_FROM", edateF);
   		parms.put("P_EDATE_TO", edateT);
   		parms.put("P_NE", bscid);
   		parms.put("P_CELLID", cellid);
   		parms.put("P_VENDOR", vendor);
   		parms.put("P_DISTRICT", district);
   		parms.put("P_ALARM_NAME", alarmName);
   		parms.put("P_NETWORK", netWork);
   		parms.put("P_SEVERITY", severity);
   		parms.put("P_TYPE",function );
   		parms.put("P_USERNAME", username);
   		parms.put("P_PROVINCE", province);
   		parms.put("P_TEAM", team);
   		parms.put("P_ALARM_TYPE", alarmType);
   		parms.put("P_ALARM_MAPPING_NAME", alarmMappingName);
   		parms.put("P_STATUS_FINISH", statusFinish);
   		parms.put("P_STATUS_VIEW", statusView);
   		parms.put("P_REGION", region);
   		parms.put("P_UN_ALARM_MAPPING", unAlarmMappingName);
   		parms.put("P_DATA", null);
   		return getSqlMapClientTemplate().queryForList("R_ALARM_LOG1.getAlarmAlert", parms);
	}
	
	//lay id canh bao moi xuat hien
	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> getIdAlarmAlert(String sdateF, String sdateT, String edateF,
			String edateT, String bscid, String cellid, String vendor,
			String district, String alarmName, String function,
			String severity, String netWork, String username, String province,
			String team, String alarmType, String alarmMappingName,
			String statusFinish, String statusView, 
			String region, String unAlarmMappingName) {
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_SDATE_FROM", sdateF);
   		parms.put("P_SDATE_TO", sdateT);
   		parms.put("P_EDATE_FROM", edateF);
   		parms.put("P_EDATE_TO", edateT);
   		parms.put("P_NE", bscid);
   		parms.put("P_CELLID", cellid);
   		parms.put("P_VENDOR", vendor);
   		parms.put("P_DISTRICT", district);
   		parms.put("P_ALARM_NAME", alarmName);
   		parms.put("P_NETWORK", netWork);
   		parms.put("P_SEVERITY", severity);
   		parms.put("P_TYPE",function );
   		parms.put("P_USERNAME", username);
   		parms.put("P_PROVINCE", province);
   		parms.put("P_TEAM", team);
   		parms.put("P_ALARM_TYPE", alarmType);
   		parms.put("P_ALARM_MAPPING_NAME", alarmMappingName);
   		parms.put("P_STATUS_FINISH", statusFinish);
   		parms.put("P_STATUS_VIEW", statusView);
   		parms.put("P_REGION", region);
   		parms.put("P_UN_ALARM_MAPPING", unAlarmMappingName);
   		parms.put("P_DATA", null);
   		return getSqlMapClientTemplate().queryForList("R_ALARM_LOG1.getIdAlarmAlert", parms);
	}

	@Override
	public int updateStatusAlerted(String idList, String type) {
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_ID_ALERTED", idList);
   		parms.put("P_TYPE", type);
   		int rows = getSqlMapClientTemplate().update("R_ALARM_LOG1.updateStatusAlerted", parms);
     return rows;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RAlarmLog> getDataAlarm(String center, String sdateF, String sdateT,  String bscid, String cellid, String vendor, String district, String alarmName, String province, 
			String team, String alarmType, String netWork, String region, String severityF) {
		// TODO Auto-generated method stub
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_CENTER", center);
   		parms.put("P_SDATE_FROM", sdateF);
   		parms.put("P_SDATE_TO", sdateT);
   		parms.put("P_NE", bscid);
   		parms.put("P_CELLID", cellid);
   		parms.put("P_VENDOR", vendor);
   		parms.put("P_DISTRICT", district);
   		parms.put("P_ALARM_NAME", alarmName);
   		parms.put("P_NETWORK", netWork);
   		parms.put("P_SEVERITY", severityF);
   		parms.put("P_PROVINCE", province);
   		parms.put("P_TEAM", team);
   		parms.put("P_ALARM_TYPE", alarmType);
   		parms.put("P_REGION", region);
   		parms.put("P_DATA", null);
   		return getSqlMapClientTemplate().queryForList("R_ALARM_LOG1.getDataAlarm", parms);
	}

	@Override
	public RAlarmLog getCanhBaoById(Integer id) {
		// TODO Auto-generated method stub
		Map<String, Integer> parms = new HashMap<String, Integer>();
		parms.put("P_ID", id);
		RAlarmLog record = (RAlarmLog) getSqlMapClientTemplate().queryForObject("R_ALARM_LOG1.getCanhBaoById", parms);
		return record;
	}

	@Override
	public int updateXLCanhBao(RAlarmLog xuLyCB) {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Map<String, Object> parms = new HashMap<String, Object>();
		String edate = xuLyCB.getEdate() == null ? null : df.format(xuLyCB.getEdate());
		parms.put("P_ID", xuLyCB.getId());
   		parms.put("P_EDATE", edate);
   		parms.put("P_CACH_CHUYEN", xuLyCB.getCachChuyen());
   		parms.put("P_NGUOI_XL", xuLyCB.getNguoiXuLy());
   		parms.put("P_PROCESS_XL", xuLyCB.getProcessXuLy());
   		parms.put("P_REUSLT", xuLyCB.getResult());
   		parms.put("P_OFFER", xuLyCB.getOffer());
   		parms.put("P_CACH_CHUYEN", xuLyCB.getCachChuyen());
   		parms.put("P_NE", xuLyCB.getNe());
   		parms.put("P_SEVERITY", xuLyCB.getSeverity());
   		parms.put("P_ALARM_NAME", xuLyCB.getAlarmName());
   		parms.put("P_ALARM_ID", xuLyCB.getAlarmId());
   		parms.put("P_RATE_BY_SLA", xuLyCB.getRateBySLA());
   		parms.put("p_data", null);
   		getSqlMapClientTemplate().queryForObject("R_ALARM_LOG1.updateXLCanhBao", parms);
      	Integer record = (Integer) parms.get("p_data");
      	return record;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RAlarmLog> getQLCBDashBoardData(Integer catruc, String dept) {
		// TODO Auto-generated method stub
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("p_ca_truc", catruc); 
   		parms.put("p_dept", dept);  
   		parms.put("p_data", null);
   		return getSqlMapClientTemplate().queryForList("R_ALARM_LOG1.getQLCBDashBoardData", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CountAlarmLog> getCountForSeverity(String sdateF,
			String sdateT, String edateF, String edateT, String bscid,
			String cellid, String vendor, String district, String alarmName,
			String function, String netWork, String username, String province,
			String team, String alarmType, String alarmMappingName,
			String statusView, String duaration,String region,String unAlarmMappingName,String severity, 
			String neType, String center) {
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_SDATE_FROM", sdateF);
   		parms.put("P_SDATE_TO", sdateT);
   		parms.put("P_EDATE_FROM", edateF);
   		parms.put("P_EDATE_TO", edateT);
   		parms.put("P_NE", bscid);
   		parms.put("P_CELLID", cellid);
   		parms.put("P_VENDOR", vendor);
   		parms.put("P_DISTRICT", district);
   		parms.put("P_ALARM_NAME", alarmName);
   		parms.put("P_NETWORK", netWork);
   		parms.put("P_TYPE", function);
   		parms.put("P_USERNAME", username);
   		parms.put("P_PROVINCE", province);
   		parms.put("P_TEAM", team);
   		parms.put("P_ALARM_TYPE", alarmType);
   		parms.put("P_ALARM_MAPPING_ID", alarmMappingName);
   		parms.put("P_STATUS_VIEW", statusView);
   		parms.put("P_DUARATION", duaration);
   		parms.put("P_REGION", region);
   		parms.put("P_UN_ALARM_MAPPING", unAlarmMappingName);
   		parms.put("P_SEVERITY", severity);
   		parms.put("P_NE_TYPE", convertArrayToSet(neType));
   		parms.put("P_CENTER", center);
   		parms.put("P_DATA", null);
   		if (center!=null && center.equalsIgnoreCase("TD"))
   			return getSqlMapClientTemplate().queryForList("R_ALARM_LOG1.getCountForSeverityTruyenDan", parms);
   		else
   			return getSqlMapClientTemplate().queryForList("R_ALARM_LOG1.getCountForSeverityRANCORE", parms);
	}
	
	@Override
	public int countRAlarmLog(String sdateF, String sdateT, String edateF,
			String edateT, String bscid, String cellid, String vendor,
			String district, String alarmName, String function,
			String severity, String netWork, String username, String province,
			String team, String alarmType, String alarmMappingName,
			String statusFinish, String strWhere, String statusView,
			String duaration,String region,String unAlarmMappingName, String neType,
			String center) {
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_SDATE_FROM", sdateF);
   		parms.put("P_SDATE_TO", sdateT);
   		parms.put("P_EDATE_FROM", edateF);
   		parms.put("P_EDATE_TO", edateT);
   		parms.put("P_NE", bscid);
   		parms.put("P_CELLID", cellid);
   		parms.put("P_VENDOR", vendor);
   		parms.put("P_DISTRICT", district);
   		parms.put("P_ALARM_NAME", alarmName);
   		parms.put("P_NETWORK", netWork);
   		parms.put("P_SEVERITY", severity);
   		parms.put("P_TYPE", function);
   		parms.put("P_USERNAME", username);
   		parms.put("P_PROVINCE", province);
   		parms.put("P_TEAM", team);
   		parms.put("P_ALARM_TYPE", alarmType);
   		parms.put("P_ALARM_MAPPING_NAME", alarmMappingName);
   		parms.put("P_STATUS_FINISH", statusFinish);
   		parms.put("P_WHERE", strWhere);
   		parms.put("P_STATUS_VIEW", statusView);
   		parms.put("P_DUARATION", duaration);
   		parms.put("P_REGION", region);
   		parms.put("P_UN_ALARM_MAPPING", unAlarmMappingName);
   		parms.put("P_NE_TYPE", convertArrayToSet(neType));
   		parms.put("P_CENTER", center);
   		parms.put("P_DATA", null);
   		if (center!=null && center.equalsIgnoreCase("TD"))
   			getSqlMapClientTemplate().queryForObject("R_ALARM_LOG1.countRAlarmLogTruyenDan", parms);
   		else
   			getSqlMapClientTemplate().queryForObject("R_ALARM_LOG1.countRAlarmLogRANCORE", parms);
	
      	Integer record = (Integer) parms.get("P_DATA");
      	return record;
	}
	
	@SuppressWarnings("unchecked")// o day
	@Override
	public List<RAlarmLog> getRAlarmLog(String sdateF, String sdateT,
			String edateF, String edateT, String bscid, String cellid,
			String vendor, String district, String alarmName, String function,
			String severity, String strWhere, Integer startRecord,
			Integer endRecord, String sortfield, String sortorder,
			String netWork, String username, String province, String team,
			String alarmType, String alarmMappingName, String statusFinish,
			String statusView, String duaration,String region,String unAlarmMappingName, String neType,
			String center) {
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_SDATE_FROM", sdateF);
   		parms.put("P_SDATE_TO", sdateT);
   		parms.put("P_EDATE_FROM", edateF);
   		parms.put("P_EDATE_TO", edateT);
   		parms.put("P_NE", bscid);
   		parms.put("P_CELLID", cellid);
   		parms.put("P_VENDOR", vendor);
   		parms.put("P_DISTRICT", district);
   		parms.put("P_ALARM_NAME", alarmName);
   		parms.put("P_NETWORK", netWork);
   		parms.put("P_SEVERITY", severity);
   		parms.put("P_WHERE", strWhere);
   		parms.put("P_START_RECORD", startRecord);
   		parms.put("P_END_RECORD", endRecord);
   		parms.put("P_COLUMN", sortfield);
   		parms.put("P_ORDER", sortorder);
   		parms.put("P_TYPE",function );
   		parms.put("P_USERNAME", username);
   		parms.put("P_PROVINCE", province);
   		parms.put("P_TEAM", team);
   		parms.put("P_ALARM_TYPE", alarmType);
   		parms.put("P_ALARM_MAPPING_NAME", alarmMappingName);
   		parms.put("P_STATUS_FINISH", statusFinish);
   		parms.put("P_STATUS_VIEW", statusView);
   		parms.put("P_DUARATION", duaration);
   		parms.put("P_REGION", region);
   		parms.put("P_UN_ALARM_MAPPING", unAlarmMappingName);
   		parms.put("P_NE_TYPE", convertArrayToSet(neType));
   		parms.put("P_CENTER", center);
   		parms.put("P_DATA", null);
   		if (center!=null && center.equalsIgnoreCase("TD"))
   			return getSqlMapClientTemplate().queryForList("R_ALARM_LOG1.getRAlarmLogTruyenDan", parms);
   		else
   			return getSqlMapClientTemplate().queryForList("R_ALARM_LOG1.getRAlarmLogRANCORE", parms);
	}

	@Override
	public int sendAlarmToBO(String idList, String username, String tgChuyen) {
		// TODO Auto-generated method stub
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("p_id", idList);
		parms.put("p_nguoi_chuyen", username);
		parms.put("p_tg_chuyen", tgChuyen);
		parms.put("p_data", null);
		getSqlMapClientTemplate().queryForObject("R_ALARM_LOG1.sendAlarmToBO", parms);
      	Integer record = (Integer) parms.get("p_data");
      	return record;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getNeByNetwork(String network) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("network", network);
		return getSqlMapClientTemplate().queryForList("R_ALARM_LOG1.getNeByNetwork", parms);
	}

	@Override
	public void insertToAlarmHandling(RAlarmLog alarm) {
		// TODO Auto-generated method stub
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("p_alarm_name", alarm.getAlarmName());
		parms.put("p_severity", alarm.getSeverity());
		parms.put("p_ne", alarm.getNe());
		parms.put("p_action_process", alarm.getProcessXuLy());
		/*parms.put("p_alarm_log_id", alarm.getId());
		parms.put("p_network", alarm.getNetwork());
		parms.put("p_alarm_id", alarm.getAlarmId());
		parms.put("p_sdate", alarm.getSdate());
		parms.put("p_edate", alarm.getEdate());*/
		parms.put("p_nguoi_xu_ly", alarm.getNguoiXuLy());
		/*parms.put("p_result", alarm.getResult());*/
		getSqlMapClientTemplate().insert("R_ALARM_LOG1.insertToAlarmHandling", parms);
	}
	
	
	
	@Override
	public void updateReasonAndHanding(RAlarmLog alarm) {
		// TODO Auto-generated method stub
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_ID", String.valueOf(alarm.getId()));
		parms.put("P_REASON", alarm.getCauseby());
		parms.put("P_HANDING", alarm.getActionProcess());
		parms.put("P_USERNAME", alarm.getModifiedBy());
		getSqlMapClientTemplate().insert("R_ALARM_LOG1.updateReasonAndHanding", parms);
	}

	@Override
	public void updateCbMll(String id, String acknowledge, String nguyenNhanMll, String partitionName, String nguoiSua) {		
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("p_id", id);
		parms.put("p_acknowledge", acknowledge);
		parms.put("p_nguyen_nhan_mll", nguyenNhanMll);
		parms.put("p_partition_name", partitionName);
		parms.put("p_nguoi_sua", nguoiSua);
		getSqlMapClientTemplate().insert("R_ALARM_LOG1.updateCbMll", parms);
	}
	
	// TRUNGNQ chuyen string tu dang "BSC,BTS" --> "('BSC', 'BTS')";
	private String convertArrayToSet(String data) {
		if (data == null || data.length() == 0) {
			return "";
		}
		
		String result = "(";
		for (String str : data.split(",")) {
			result += "'" + str + "',";
		}
		
		// xoa dau "," o cuoi
		result = result.substring(0, result.length() - 1);
		
		result += ")";
		
		return result;
	}
}