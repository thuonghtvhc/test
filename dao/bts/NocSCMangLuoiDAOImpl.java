package dao.bts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import vo.bts.AlarmSLADailyReport7Day;
import vo.bts.DanhGiaSLASCAndMLL;
import vo.bts.NocBaocaoMatlienlac;
import vo.bts.NocDanhGiaCSHT;
import vo.bts.NocSCMangLuoi;
import vo.bts.QuanlyMatlienlac;
import vo.bts.SYS_PARAMETER;

public class NocSCMangLuoiDAOImpl extends SqlMapClientDaoSupport implements NocSCMangLuoiDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table NOC_SU_CO_MANG_LUOI
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public NocSCMangLuoiDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table NOC_SU_CO_MANG_LUOI
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public int deleteByPrimaryKey(Integer id) {
        NocSCMangLuoi key = new NocSCMangLuoi();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("NOC_SU_CO_MANG_LUOI.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table NOC_SU_CO_MANG_LUOI
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void insert(NocSCMangLuoi record) {
        getSqlMapClientTemplate().insert("NOC_SU_CO_MANG_LUOI.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table NOC_SU_CO_MANG_LUOI
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void insertSelective(NocSCMangLuoi record) {
        getSqlMapClientTemplate().insert("NOC_SU_CO_MANG_LUOI.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table NOC_SU_CO_MANG_LUOI
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public NocSCMangLuoi selectByPrimaryKey(Integer id) {
        NocSCMangLuoi key = new NocSCMangLuoi();
        key.setId(id);
        NocSCMangLuoi record = (NocSCMangLuoi) getSqlMapClientTemplate().queryForObject("NOC_SU_CO_MANG_LUOI.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table NOC_SU_CO_MANG_LUOI
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public int updateByPrimaryKeySelective(NocSCMangLuoi record) {
        int rows = getSqlMapClientTemplate().update("NOC_SU_CO_MANG_LUOI.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table NOC_SU_CO_MANG_LUOI
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public int updateByPrimaryKey(NocSCMangLuoi record) {
        int rows = getSqlMapClientTemplate().update("NOC_SU_CO_MANG_LUOI.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }
    
    
    @SuppressWarnings("unchecked")
   	@Override
   	public List<SYS_PARAMETER> getCaTrucList() {
   		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_DATA", null);
       	return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getCaTrucList", parms);
   	}
   	
   	
	@SuppressWarnings("unchecked")
	@Override
	public List<SYS_PARAMETER> getSCList() {
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_DATA", null);
       	return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getSCList", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NocSCMangLuoi> getNocSCMangLuoiFilterShift(String startDate, String endDate,String region,String shift, String deptCode,String username,
			String loaisc,String type) {
		Map<String, Object> map = new HashMap<String, Object>();
       	map.put("P_START_DATE", startDate);
       	map.put("P_END_DATE", endDate);
       	map.put("P_REGION", region);
       	map.put("P_SHIFT", shift);
       	map.put("P_DEPT_CODE", deptCode);
       	map.put("P_USERNAME", username);
       	map.put("P_LOAISC", loaisc);
       	map.put("P_TYPE", type);
   		map.put("P_DATA", null);
   		
   		return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getNocSCMangLuoiFilterShift", map);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<NocSCMangLuoi> getNocSCMangLuoiFilter(String startDate, String endDate, String shift, String deptCode,String username,
			String loaisc,String statusProcess,String faultID, Integer startRecord, Integer endRecord, String sortfield, String sortorder, String strWhere) {
		Map<String, Object> map = new HashMap<String, Object>();
       	map.put("P_START_DATE", startDate);
       	map.put("P_END_DATE", endDate);
       	map.put("P_SHIFT", shift);
       	map.put("P_DEPT_CODE", deptCode);
       	map.put("P_USERNAME", username);
       	map.put("P_LOAISC", loaisc);
       	map.put("P_STATUS_PROCESS", statusProcess);
       	map.put("P_FAULT_ID", faultID);
       	map.put("P_START_RECORD", startRecord);
       	map.put("P_END_RECORD", endRecord);
       	map.put("P_SOFT_FIELD", sortfield);
       	map.put("P_SOFT_ORDER", sortorder);
       	map.put("P_STR_WHERE", strWhere);
   		map.put("P_DATA", null);
   		
   		return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getNocSCMangLuoiFilter", map);
	}
	
	@Override
	public int countNocSCMangLuoiFilter(String startDate, String endDate, String shift, String deptCode,String username,String loaisc,String statusProcess,String faultID,
			String strWhere) {
		Map<String, Object> map = new HashMap<String, Object>();
       	map.put("P_START_DATE", startDate);
       	map.put("P_END_DATE", endDate);
       	map.put("P_SHIFT", shift);
       	map.put("P_DEPT_CODE", deptCode);
       	map.put("P_USERNAME", username);
    	map.put("P_LOAISC", loaisc);
    	map.put("P_STATUS_PROCESS", statusProcess);
    	map.put("P_FAULT_ID", faultID);
       	map.put("P_STR_WHERE", strWhere);
       	map.put("P_DATA", null);
       	getSqlMapClientTemplate().queryForObject("NOC_SU_CO_MANG_LUOI.countNocSCMangLuoiFilter", map);
       	Integer record = (Integer) map.get("P_DATA");
       	return record;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<NocSCMangLuoi> checkCalendarPrimaryKey(String maPhong, String tenSuCo, String loaisc, String tgBatDau,
			int caTruc, String id) {
		Map<String, Object> map = new HashMap<String, Object>();
    	map.put("P_TEN_SU_CO", tenSuCo);
       	map.put("P_LOAI_SU_CO", loaisc);
       	map.put("P_TG_BAT_DAU", tgBatDau);
       	map.put("P_CA_TRUC", caTruc);
       	map.put("P_MA_PHONG", maPhong);
       	map.put("P_ID", id);
   		map.put("P_DATA", null);
   		
   		return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.checkCalendarPrimaryKey", map);
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<NocSCMangLuoi> getBCSCFilter(String startdate,String enddate,
			  String startweek,String endweek,
			  String startmonth,String endmonth,
			  String startquarter,String endquarter,
			  String syear,String eyear,
			  String type,String region,
			  Integer startRecord, Integer endRecord, String sortfield, String sortorder, String strWhere) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("P_START_DATE", startdate);
       	map.put("P_END_DATE", enddate);
       	map.put("P_START_WEEK", startweek);
       	map.put("P_END_WEEK", endweek);
       	map.put("P_START_MONTH", startmonth);
       	map.put("P_END_MONTH", endmonth);
       	map.put("P_START_QUARTER", startquarter);
       	map.put("P_END_QUARTER", endquarter);
       	map.put("P_START_YEAR", syear);
       	map.put("P_END_YEAR", eyear);
       	map.put("P_TYPE", type);
       	map.put("P_REGION", region);
       	map.put("P_START_RECORD", startRecord);
       	map.put("P_END_RECORD", endRecord);
       	map.put("P_SOFT_FIELD", sortfield);
       	map.put("P_SOFT_ORDER", sortorder);
       	map.put("P_STR_WHERE", strWhere);
   		map.put("P_DATA", null);
   		
   		return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getBCSCFilter", map);
	}

	@Override
	public int countBCSCFilter(String startdate,String enddate,
			String startweek,String endweek,
			String startmonth,String endmonth,
			String startquarter,String endquarter,
			String syear,String eyear,
			String type, String region,String strWhere) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("P_START_DATE", startdate);
       	map.put("P_END_DATE", enddate);
       	map.put("P_START_WEEK", startweek);
       	map.put("P_END_WEEK", endweek);
       	map.put("P_START_MONTH", startmonth);
       	map.put("P_END_MONTH", endmonth);
       	map.put("P_START_QUARTER", startquarter);
       	map.put("P_END_QUARTER", endquarter);
       	map.put("P_START_YEAR", syear);
       	map.put("P_END_YEAR", eyear);
		map.put("P_TYPE", type);
       	map.put("P_REGION", region);
       	map.put("P_STR_WHERE", strWhere);
       	map.put("P_DATA", null);
       	getSqlMapClientTemplate().queryForObject("NOC_SU_CO_MANG_LUOI.countBCSCFilter", map);
       	Integer record = (Integer) map.get("P_DATA");
       	return record;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NocSCMangLuoi> getDBSuCoMangLuoi(String region, String maPhong,String catruc,String ngayTruc,
			Integer shiftID, String note) {
		Map<String, Object> map = new HashMap<String, Object>();
    	map.put("P_REGION", region);
    	map.put("P_MA_PHONG", maPhong);
    	map.put("P_NGAY_TRUC", ngayTruc);
    	map.put("P_CA_TRUC", catruc);
    	map.put("P_SHIFTID", shiftID);
    	map.put("P_NOTE", note);
		map.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getDBSuCoMangLuoi", map);
	}

	@Override
	public int insertTrouble(NocSCMangLuoi trouble) {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date edate = trouble.getTgKetThuc();
		Date systemSdate = trouble.getSystemSdate();
		Map<String, Object> map = new HashMap<String, Object>();
		if (edate != null) {
			map.put("p_edate", df.format(edate));
		}	
		if (systemSdate != null) {
			map.put("p_system_sdate", df.format(systemSdate));
		}	
		map.put("p_id_list", trouble.getIdList());
		map.put("p_canh_bao", trouble.getCanhBao());
		map.put("p_anh_huong", trouble.getAnhHuongSc());
		map.put("p_don_vi", trouble.getMaPhong());
		map.put("p_don_vi_anh_huong", trouble.getDonViAnhHuong());
		map.put("p_sdate", df.format(trouble.getTgBatDau()));
		map.put("p_system", trouble.getHeThong());
		map.put("p_effect_ne", trouble.getThietBi());
		map.put("p_reason", trouble.getNguyenNhan());
		map.put("p_result", trouble.getKetQuaXl());
		map.put("p_method", trouble.getGiaiPhapXl());
		map.put("p_ten_su_co", trouble.getTenSuCo());
		map.put("p_loai_su_co", trouble.getLoaiSuCo());
		map.put("p_ca_truc", trouble.getIdCaTruc());
		map.put("p_tg_phat_hien", df.format(trouble.getTgPhatHien()));
		map.put("p_data", null);
		getSqlMapClientTemplate().queryForObject("NOC_SU_CO_MANG_LUOI.insertTrouble", map);
       	Integer record = (Integer) map.get("P_DATA");
       	return record;
	}
	
	// 11/01/2017 ThanhNV Lay du lieu hien thi dashboard mat lien lac & su co
	// 11/01/2017 ds su co
	@SuppressWarnings("unchecked")
	@Override
	public List<NocSCMangLuoi> getSucoListForDashboard(String date, String deptCode, Integer startRecord,
			Integer endRecord, String sortfield, String sortorder, String strWhere) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("P_DATE", date);
		map.put("P_DEPT_CODE", deptCode);
		map.put("P_START_RECORD", startRecord);
		map.put("P_END_RECORD", endRecord);
		map.put("P_SOFT_FIELD", sortfield);
		map.put("P_SOFT_ORDER", sortorder);
		map.put("P_STR_WHERE", strWhere);
		map.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getSucoListForDashboard", map);
	}

	@Override
	public int countSucoListForDashboard(String date, String deptCode, Integer startRecord, Integer endRecord,
			String sortfield, String sortorder, String strWhere) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("P_DATE", date);
		map.put("P_DEPT_CODE", deptCode);
		map.put("P_START_RECORD", startRecord);
		map.put("P_END_RECORD", endRecord);
		map.put("P_SOFT_FIELD", sortfield);
		map.put("P_SOFT_ORDER", sortorder);
		map.put("P_STR_WHERE", strWhere);
		map.put("P_DATA", null);
		getSqlMapClientTemplate().queryForObject("NOC_SU_CO_MANG_LUOI.countSucoListForDashboard", map);
		int record = (int) map.get("P_DATA");
		return record;
	}

	// 11/01/2017 ds mll
	@SuppressWarnings("unchecked")
	@Override
	public List<NocBaocaoMatlienlac> getMllListForDashboard(String date, String deptCode, Integer startRecord,
			Integer endRecord, String sortfield, String sortorder, String strWhere) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("P_DATE", date);
		map.put("P_DEPT_CODE", deptCode);
		map.put("P_START_RECORD", startRecord);
		map.put("P_END_RECORD", endRecord);
		map.put("P_SOFT_FIELD", sortfield);
		map.put("P_SOFT_ORDER", sortorder);
		map.put("P_STR_WHERE", strWhere);
		map.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getMllListForDashboard", map);
	}

	@Override
	public int countMllListForDashboard(String date, String deptCode, Integer startRecord, Integer endRecord,
			String sortfield, String sortorder, String strWhere) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("P_DATE", date);
		map.put("P_DEPT_CODE", deptCode);
		map.put("P_START_RECORD", startRecord);
		map.put("P_END_RECORD", endRecord);
		map.put("P_SOFT_FIELD", sortfield);
		map.put("P_SOFT_ORDER", sortorder);
		map.put("P_STR_WHERE", strWhere);
		map.put("P_DATA", null);
		getSqlMapClientTemplate().queryForObject("NOC_SU_CO_MANG_LUOI.countMllListForDashboard", map);
		Integer record = (Integer) map.get("P_DATA");
		return record;
	}
	
	// 13/01/2017 ds canh bao
	//<!-- danh sach canh bao mat lien lac Thanhnv -->
	@SuppressWarnings("unchecked")
	@Override
	public List<QuanlyMatlienlac> getCanhbaoMllList(String sdateF, String sdateT, String edateF, String edateT, String bscid,
			String cellid, String vendor, String district, String alarmName, String province, String group, String team,
			String alarmType, String netWork, String region, String severityF, String username,String causeby, 
			boolean isDownSite, Integer startRecord,
			Integer endRecord, String sortfield, String sortorder, String strWhere) {
		// TODO Auto-generated method stub
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
   		parms.put("P_SEVERITY", severityF);
   		parms.put("P_PROVINCE", province);
   		parms.put("P_GROUP", group);
   		parms.put("P_TEAM", team);
   		parms.put("P_ALARM_TYPE", alarmType);
   		parms.put("P_REGION", region);
   		parms.put("P_USERNAME", username);
   		parms.put("P_CAUSEBY", causeby);
   		parms.put("P_IS_DOWNSITE", isDownSite ? "Y" : "N");
   		parms.put("P_START_RECORD", startRecord);
   		parms.put("P_END_RECORD", endRecord);
   		parms.put("P_SOFT_FIELD", sortfield);
   		parms.put("P_SOFT_ORDER", sortorder);
   		parms.put("P_STR_WHERE", strWhere);
   		parms.put("P_DATA", null);
   		return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getCanhbaoMllList", parms);
	}
	
	//<!-- count canh bao mat lien lac Thanhnv -->
	public Integer countCanhbaoMllList(String sdateF, String sdateT, String edateF, String edateT, String bscid,
			String cellid, String vendor, String district, String alarmName, String province, String group, String team,
			String alarmType, String netWork, String region, String severityF, String username,String causeby, 
			boolean isDownSite, Integer startRecord,
			Integer endRecord, String sortfield, String sortorder, String strWhere) {
		// TODO Auto-generated method stub
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
   		parms.put("P_SEVERITY", severityF);
   		parms.put("P_PROVINCE", province);
   		parms.put("P_GROUP", group);
   		parms.put("P_TEAM", team);
   		parms.put("P_ALARM_TYPE", alarmType);
   		parms.put("P_REGION", region);
   		parms.put("P_USERNAME", username);
   		parms.put("P_CAUSEBY", causeby);
   		parms.put("P_IS_DOWNSITE", isDownSite ? "Y" : "N");
   		parms.put("P_START_RECORD", startRecord);
   		parms.put("P_END_RECORD", endRecord);
   		parms.put("P_SOFT_FIELD", sortfield);
   		parms.put("P_SOFT_ORDER", sortorder);
   		parms.put("P_STR_WHERE", strWhere);
   		parms.put("P_DATA", null);
		getSqlMapClientTemplate().queryForObject("NOC_SU_CO_MANG_LUOI.countCanhbaoMllList", parms);
		Integer record = (Integer) parms.get("P_DATA");
		return record;
	}
	
	

//<!-- 	TNV 19/01/2017 bao cao, thong ke, dashboard module su co -->

//<!-- danh sach su co cho dashboard suco -->
	@SuppressWarnings("unchecked")
	@Override
	public List<NocSCMangLuoi> getBaocaoSuco(String tt, String donvi, String loaiThietbi, String tenThietbi, String donvi2,
			String province, String district, String daiVt, String team, String date, String week, String month,
			String quater, String year, String type, String deptCode, Integer startRecord, Integer endRecord, String sortfield,
			String sortorder, String strWhere){
			Map<String, Object> parms = new HashMap<String, Object>();
	   		parms.put("P_TT",tt);
            parms.put("P_DONVI",donvi);
            parms.put("P_LOAI_TB",loaiThietbi);
            parms.put("P_TEN_TB",tenThietbi);
            parms.put("P_DONVI2",donvi2);
            parms.put("P_PROVINCE",province);
            parms.put("P_DISTRICT",district);
            parms.put("P_DAI_VT",daiVt);
            parms.put("P_TEAM",team);
            parms.put("P_DATE",date);
            parms.put("P_WEEK",week);
            parms.put("P_MONTH",month);
            parms.put("P_QUARTER",quater);
            parms.put("P_YEAR",year);
            parms.put("P_TYPE",type);
            parms.put("P_DEPT_CODE",deptCode);
            parms.put("P_START_RECORD",startRecord);
            parms.put("P_END_RECORD",endRecord);
            parms.put("P_SOFT_FIELD",sortfield);
            parms.put("P_SOFT_ORDER",sortorder);
            parms.put("P_STR_WHERE",strWhere);
			parms.put("P_DATA",null);
			return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getBaocaoSuco", parms);
	}
	
	//<!-- dem su co cho dashboard suco -->
	public Integer countBaocaoSuco(String tt, String donvi, String loaiThietbi, String tenThietbi, String donvi2,
			String province, String district, String daiVt, String team, String date, String week, String month,
			String quater, String year, String type, String deptCode, Integer startRecord, Integer endRecord, String sortfield,
			String sortorder, String strWhere){
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_TT",tt);
        parms.put("P_DONVI",donvi);
        parms.put("P_LOAI_TB",loaiThietbi);
        parms.put("P_TEN_TB",tenThietbi);
        parms.put("P_DONVI2",donvi2);
        parms.put("P_PROVINCE",province);
        parms.put("P_DISTRICT",district);
        parms.put("P_DAI_VT",daiVt);
        parms.put("P_TEAM",team);
        parms.put("P_DATE",date);
        parms.put("P_WEEK",week);
        parms.put("P_MONTH",month);
        parms.put("P_QUARTER",quater);
        parms.put("P_YEAR",year);
        parms.put("P_TYPE",type);
        parms.put("P_DEPT_CODE",deptCode);
        parms.put("P_START_RECORD",startRecord);
        parms.put("P_END_RECORD",endRecord);
        parms.put("P_SOFT_FIELD",sortfield);
        parms.put("P_SOFT_ORDER",sortorder);
        parms.put("P_STR_WHERE",strWhere);
		parms.put("P_DATA",null);
		getSqlMapClientTemplate().queryForObject("NOC_SU_CO_MANG_LUOI.countBaocaoSuco", parms);
		Integer record = (Integer) parms.get("P_DATA");
		return record;
	}
	
	//<!-- danh sach bao cao mat lien lac cho dashboard su co -->
	@SuppressWarnings("unchecked")
	@Override
	public List<NocBaocaoMatlienlac> getBaocaoMll(String tt, String donvi, String loaiThietbi, String tenThietbi, String donvi2,
			String province, String district, String daiVt, String team, String date, String week, String month,
			String quater, String year, String type, String deptCode, Integer startRecord, Integer endRecord, String sortfield,
			String sortorder, String strWhere){
			Map<String, Object> parms = new HashMap<String, Object>();
	   		parms.put("P_TT",tt);
            parms.put("P_DONVI",donvi);
            parms.put("P_LOAI_TB",loaiThietbi);
            parms.put("P_TEN_TB",tenThietbi);
            parms.put("P_DONVI2",donvi2);
            parms.put("P_PROVINCE",province);
            parms.put("P_DISTRICT",district);
            parms.put("P_DAI_VT",daiVt);
            parms.put("P_TEAM",team);
            parms.put("P_DATE",date);
            parms.put("P_WEEK",week);
            parms.put("P_MONTH",month);
            parms.put("P_QUARTER",quater);
            parms.put("P_YEAR",year);
            parms.put("P_TYPE",type);
            parms.put("P_DEPT_CODE",deptCode);
            parms.put("P_START_RECORD",startRecord);
            parms.put("P_END_RECORD",endRecord);
            parms.put("P_SOFT_FIELD",sortfield);
            parms.put("P_SOFT_ORDER",sortorder);
            parms.put("P_STR_WHERE",strWhere);
			parms.put("P_DATA",null);
			return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getBaocaoMll", parms);
	}
	
	//<!-- dem bao cao mat lien lac cho dashboard su co -->
	public Integer countBaocaoMll(String tt, String donvi, String loaiThietbi, String tenThietbi, String donvi2,
			String province, String district, String daiVt, String team, String date, String week, String month,
			String quater, String year, String type, String deptCode, Integer startRecord, Integer endRecord, String sortfield,
			String sortorder, String strWhere){
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_TT",tt);
        parms.put("P_DONVI",donvi);
        parms.put("P_LOAI_TB",loaiThietbi);
        parms.put("P_TEN_TB",tenThietbi);
        parms.put("P_DONVI2",donvi2);
        parms.put("P_PROVINCE",province);
        parms.put("P_DISTRICT",district);
        parms.put("P_DAI_VT",daiVt);
        parms.put("P_TEAM",team);
        parms.put("P_DATE",date);
        parms.put("P_WEEK",week);
        parms.put("P_MONTH",month);
        parms.put("P_QUARTER",quater);
        parms.put("P_YEAR",year);
        parms.put("P_TYPE",type);
        parms.put("P_DEPT_CODE",deptCode);
        parms.put("P_START_RECORD",startRecord);
        parms.put("P_END_RECORD",endRecord);
        parms.put("P_SOFT_FIELD",sortfield);
        parms.put("P_SOFT_ORDER",sortorder);
        parms.put("P_STR_WHERE",strWhere);
		parms.put("P_DATA",null);
		getSqlMapClientTemplate().queryForObject("NOC_SU_CO_MANG_LUOI.countBaocaoMll", parms);
		Integer record = (Integer) parms.get("P_DATA");
		return record;
	}
	
	// <!-- danh sach bao cao so luong su co cho dashboard su co -->
	@SuppressWarnings("unchecked")
	@Override
	public List<DanhGiaSLASCAndMLL> getBaocaoSLASuco(String tt, String donvi, String loaiThietbi, String tenThietbi, String donvi2,
			String province, String district, String daiVt, String team, String date, String week, String month,
			String quater, String year, String type, String deptCode, Integer startRecord, Integer endRecord, String sortfield,
			String sortorder, String strWhere){
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_TT",tt);
        parms.put("P_DONVI",donvi);
        parms.put("P_LOAI_TB",loaiThietbi);
        parms.put("P_TEN_TB",tenThietbi);
        parms.put("P_DONVI2",donvi2);
        parms.put("P_PROVINCE",province);
        parms.put("P_DISTRICT",district);
        parms.put("P_DAI_VT",daiVt);
        parms.put("P_TEAM",team);
        parms.put("P_DATE",date);
        parms.put("P_WEEK",week);
        parms.put("P_MONTH",month);
        parms.put("P_QUARTER",quater);
        parms.put("P_YEAR",year);
        parms.put("P_TYPE",type);
        parms.put("P_DEPT_CODE",deptCode);
        parms.put("P_START_RECORD",startRecord);
        parms.put("P_END_RECORD",endRecord);
        parms.put("P_SOFT_FIELD",sortfield);
        parms.put("P_SOFT_ORDER",sortorder);
        parms.put("P_STR_WHERE",strWhere);
		parms.put("P_DATA",null);
		return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getBaocaoSLASuco", parms);
}

	// <!-- dem bao cao so luong su co cho dashboard su co -->
	public Integer countBaocaoSLASuco(String tt, String donvi, String loaiThietbi, String tenThietbi, String donvi2,
			String province, String district, String daiVt, String team, String date, String week, String month,
			String quater, String year, String type, String deptCode, Integer startRecord, Integer endRecord, String sortfield,
			String sortorder, String strWhere){
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_TT",tt);
        parms.put("P_DONVI",donvi);
        parms.put("P_LOAI_TB",loaiThietbi);
        parms.put("P_TEN_TB",tenThietbi);
        parms.put("P_DONVI2",donvi2);
        parms.put("P_PROVINCE",province);
        parms.put("P_DISTRICT",district);
        parms.put("P_DAI_VT",daiVt);
        parms.put("P_TEAM",team);
        parms.put("P_DATE",date);
        parms.put("P_WEEK",week);
        parms.put("P_MONTH",month);
        parms.put("P_QUARTER",quater);
        parms.put("P_YEAR",year);
        parms.put("P_TYPE",type);
        parms.put("P_DEPT_CODE",deptCode);
        parms.put("P_START_RECORD",startRecord);
        parms.put("P_END_RECORD",endRecord);
        parms.put("P_SOFT_FIELD",sortfield);
        parms.put("P_SOFT_ORDER",sortorder);
        parms.put("P_STR_WHERE",strWhere);
		parms.put("P_DATA",null);
		getSqlMapClientTemplate().queryForObject("NOC_SU_CO_MANG_LUOI.countBaocaoSLASuco", parms);
		Integer record = (Integer) parms.get("P_DATA");
		return record;
	}
	
	//<!--   get chart su co 7 day -->
	@SuppressWarnings("unchecked")
	@Override
  	public List<AlarmSLADailyReport7Day> getChartSuco7Day(String type,String startDate){
  		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_TYPE",type);
   		parms.put("P_DATE",startDate);
		parms.put("P_DATA",null);
		return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getChartSuco7Day", parms);
  	}
	/*Thống kê số lượng các trạm MLL*/
	@SuppressWarnings("unchecked")
	@Override
	public List<NocSCMangLuoi> getDBThongKeMLL(String region, String maPhong,
			String catruc, String ngayTruc, Integer shiftID, String note) {
		Map<String, Object> map = new HashMap<String, Object>();
    	map.put("P_REGION", region);
    	map.put("P_MA_PHONG", maPhong);
    	map.put("P_NGAY_TRUC", ngayTruc);
    	map.put("P_CA_TRUC", catruc);
    	map.put("P_SHIFTID", shiftID);
    	map.put("P_NOTE", note);
		map.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getDBThongKeMLL", map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NocSCMangLuoi> getShiftSuCoMangLuoi(String shiftid,
			String ngayTKTo, String ngayTK, String type, String region,
			String maPhong,String username) {
		Map<String, Object> map = new HashMap<String, Object>();
    	map.put("P_REGION", region);
    	map.put("P_MA_PHONG", maPhong);
    	map.put("P_NGAY_TRUC_FROM",ngayTK );
    	map.put("P_NGAY_TRUC_TO", ngayTKTo);
    	map.put("P_SHIFTID", shiftid);
    	map.put("P_TYPE", type);
    	map.put("P_USERNAME", username);
    	map.put("P_DATA", null);
		
		return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getShiftSuCoMangLuoi", map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NocDanhGiaCSHT> getShiftSLAXuLySuCo(String shiftid,
			String ngayTKTo, String ngayTK, String type, String region,
			String maPhong,String username) {
		Map<String, Object> map = new HashMap<String, Object>();
    	map.put("P_REGION", region);
    	map.put("P_MA_PHONG", maPhong);
    	map.put("P_NGAY_TRUC_FROM",ngayTK );
    	map.put("P_NGAY_TRUC_TO", ngayTKTo);
    	map.put("P_SHIFTID", shiftid);
    	map.put("P_TYPE", type);
    	map.put("P_USERNAME", username);
    	map.put("P_DATA", null);
		
		return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getShiftSLAXuLySuCo", map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NocDanhGiaCSHT> getShiftThongKeMLL(String shiftid,
			String ngayTKTo, String ngayTK, String type, String region,
			String maPhong,String username) {
		Map<String, Object> map = new HashMap<String, Object>();
    	map.put("P_REGION", region);
    	map.put("P_MA_PHONG", maPhong);
    	map.put("P_NGAY_TRUC_FROM",ngayTK );
    	map.put("P_NGAY_TRUC_TO", ngayTKTo);
    	map.put("P_SHIFTID", shiftid);
    	map.put("P_TYPE", type);
    	map.put("P_USERNAME", username);
    	
		map.put("P_DATA", null);
		
		return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getShiftThongKeMLL", map);
	}

	@Override
	public int sendSMSToBO(String idList, String username) {
		Map<String, Object> parms = new HashMap<String, Object>();
   		parms.put("P_IDLIST", idList);
       	parms.put("P_USERNAME", username);
        int rows = getSqlMapClientTemplate().update("NOC_SU_CO_MANG_LUOI.sendSMSToBO", parms);
       return rows;
	}
	// lay thong tin chi tiet su co hien thi chuc nang dashboard home. AnhCTV.08/11/2017
	@SuppressWarnings("unchecked")
	@Override
	public List<NocSCMangLuoi> getDBHomeSuCoDetail(String ngayTruc, String username) {
		Map<String, Object> map = new HashMap<String, Object>();
    	map.put("P_NGAY", ngayTruc);
    	map.put("P_USERNAME", username);
		map.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("NOC_SU_CO_MANG_LUOI.getDBHomeSuCoDetail", map);
	}
	
}