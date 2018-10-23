package dao.bts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import vo.bts.AlAlarmWorks;
import vo.bts.SYS_PARAMETER;
public class AlAlarmWorksDAOImpl extends SqlMapClientDaoSupport implements AlAlarmWorksDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table AL_ALARM_WORKS
     *
     * @ibatorgenerated Sun Dec 30 22:37:47 ICT 2012
     */
    public AlAlarmWorksDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table AL_ALARM_WORKS
     *
     * @ibatorgenerated Sun Dec 30 22:37:47 ICT 2012
     */
    public int deleteByPrimaryKey(Integer id) {
        AlAlarmWorks key = new AlAlarmWorks();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("AL_ALARM_WORKS1.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table AL_ALARM_WORKS
     *
     * @ibatorgenerated Sun Dec 30 22:37:47 ICT 2012
     */
    public void insert(AlAlarmWorks record) {
        getSqlMapClientTemplate().insert("AL_ALARM_WORKS1.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table AL_ALARM_WORKS
     *
     * @ibatorgenerated Sun Dec 30 22:37:47 ICT 2012
     */
    public void insertSelective(AlAlarmWorks record) {
        getSqlMapClientTemplate().insert("AL_ALARM_WORKS1.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table AL_ALARM_WORKS
     *
     * @ibatorgenerated Sun Dec 30 22:37:47 ICT 2012
     */
    public AlAlarmWorks selectByPrimaryKey(Integer id) {
        AlAlarmWorks key = new AlAlarmWorks();
        key.setId(id);
        AlAlarmWorks record = (AlAlarmWorks) getSqlMapClientTemplate().queryForObject("AL_ALARM_WORKS1.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table AL_ALARM_WORKS
     *
     * @ibatorgenerated Sun Dec 30 22:37:47 ICT 2012
     */
    public int updateByPrimaryKeySelective(AlAlarmWorks record) {
        int rows = getSqlMapClientTemplate().update("AL_ALARM_WORKS1.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table AL_ALARM_WORKS
     *
     * @ibatorgenerated Sun Dec 30 22:37:47 ICT 2012
     */
    public int updateByPrimaryKey(AlAlarmWorks record) {
        int rows = getSqlMapClientTemplate().update("AL_ALARM_WORKS1.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }
    
   	@SuppressWarnings("unchecked")
   	@Override
   	public List<AlAlarmWorks> getWarningList(String warningType, String system,
   			String alarm, String actionProcess, String teamProcess,
   			String stime, String etime,String area,String userProcess ,String column, int order,String region) {
   		Map<String, Object> map = new HashMap<String, Object>();
   		map.put("P_WARNING_TYPE", warningType);
   		map.put("P_SYSTEM", system);
   		map.put("P_ALARM", alarm);
   		map.put("P_ACTION_PROCESS", actionProcess);
   		map.put("P_TEAM_PROCESS", teamProcess);
   		map.put("P_STIME", stime);
   		map.put("P_ETIME", etime);
   		map.put("P_AREA", area);
   		map.put("P_USER_PROCESS", userProcess);
		map.put("P_column", column);
   		map.put("P_order", order);
   		map.put("P_REGION", region);
   		map.put("P_DATA", null);
   		return getSqlMapClientTemplate().queryForList("AL_ALARM_WORKS1.getWarningList", map);
   	}

   	@Override
	public AlAlarmWorks getAlarmByContentArea(String content, String area,String warningType,String region) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("P_ALARM", content);
			map.put("P_AREA", area);
			map.put("P_WARNING_TYPE", warningType);
			map.put("P_REGION", region);
			map.put("P_DATA", null);
			AlAlarmWorks record = (AlAlarmWorks) getSqlMapClientTemplate().queryForObject("AL_ALARM_WORKS1.getAlarmByContentArea", map);
	        return record;
	}

	@Override
	public AlAlarmWorks getWarningByAlarm(String alarm, String system,
			String warningType) {
		AlAlarmWorks key = new AlAlarmWorks();
	        key.setAlarm(alarm);
	        key.setWarningType(warningType);
	        key.setSystem(system);
	        AlAlarmWorks record = (AlAlarmWorks) getSqlMapClientTemplate().queryForObject("AL_ALARM_WORKS1.getWarningByAlarm", key);
	        return record;
	}

	@Override
	public int update(AlAlarmWorks record) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_ID", record.getId());
		parms.put("P_ALARM", record.getAlarm());
		parms.put("P_OPERATOR", record.getOperator());
		parms.put("P_SYSTEM", record.getSystem());
		parms.put("P_COUNT_SITE", record.getCountSite());
		parms.put("P_STIME", record.getStime());
		parms.put("P_ETIME", record.getEtime());
		parms.put("P_TEAM_PROCESS", record.getTeamProcess());
		parms.put("P_USER_PROCESS", record.getUserProcess());
		parms.put("P_CAUSEBY", record.getCauseby());
		parms.put("P_CAUSEBY_SYSTEM", record.getCausebySystem());
		parms.put("P_ACTION_PROCESS", record.getActionProcess());
		parms.put("P_RESULTS_PROCESS", record.getResultsProcess());
		parms.put("P_REPORT_PROCESS", record.getReportProcess());
		parms.put("P_ALARM_INFO", record.getAlarmInfo());
		parms.put("P_SHIFT_ID", record.getShiftId());
		parms.put("P_WARNING_TYPE", record.getWarningType());
		parms.put("P_DEPT", record.getDept());
		parms.put("P_AREA", record.getArea());
		parms.put("P_SITE_LIST", record.getSiteList());
		parms.put("P_SITE_QUANTITY", record.getSiteQuantity());
		parms.put("P_MD_SDATE", record.getMdSdate());
        int rows = getSqlMapClientTemplate().update("AL_ALARM_WORKS1.update23G", parms);
        return rows;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SYS_PARAMETER> titleForm (String warningTp, String typeForm) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("P_TYPE", warningTp);
		map.put("P_FORM", typeForm);
		map.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("AL_ALARM_WORKS1.titleAlarmWork", map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AlAlarmWorks> filterSuCoLon(String day, String column, int order) {
		Map<String, Object> map = new HashMap<String, Object>();
   		map.put("P_DAY", day);
   		map.put("P_column", column);
   		map.put("P_order", order);
   		map.put("P_DATA", null);
   		return getSqlMapClientTemplate().queryForList("AL_ALARM_WORKS1.filterSuCoLon", map);
	}

	/*@SuppressWarnings("unchecked")
	@Override
	public List<AlAlarmWorks> filterDanhGiaMangLuoi(String day, String column,
			int order) {
		Map<String, Object> map = new HashMap<String, Object>();
   		map.put("P_DAY", day);
   		map.put("P_column", column);
   		map.put("P_order", order);
   		map.put("P_DATA", null);
   		return getSqlMapClientTemplate().queryForList("AL_ALARM_WORKS.filterDanhGiaMangLuoi", map);
	}*/

	

	@SuppressWarnings("unchecked")
	@Override
	public List<AlAlarmWorks> filerOfHomePage(String tableName, String day) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_TABLE_NAME", 		tableName);
    	parms.put("P_DAY", 				day);
    	parms.put("P_DATA", 			null);
   		return getSqlMapClientTemplate().queryForList("AL_ALARM_WORKS1.filerOfHomePage", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AlAlarmWorks> getWarningListAtShif(String warningtype,
			String shiftid, String ngayTKTo, String ngayTK, String type,String region, String maPhong) {
		Map<String, Object> map = new HashMap<String, Object>();
   		map.put("P_WARNING_TYPE", warningtype);
   		map.put("P_SHIFT_ID", shiftid);
   		map.put("P_DAY_TO", ngayTKTo);
   		map.put("P_DAY", ngayTK);
   		map.put("P_TYPE_FORM", type);
   		map.put("P_REGION", region);
   		map.put("P_MA_PHONG", maPhong);
   		map.put("P_DATA", null);
   		return getSqlMapClientTemplate().queryForList("AL_ALARM_WORKS1.getWarningListAtShif", map);
	}

	@Override
	public int upateEndTimeAlarm(String warningTp, String ca, String ngayTruc,String username) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_NGAY_TRUC",ngayTruc);
		parms.put("P_CA_TRUC", ca);
		parms.put("P_MODIFYBY", username);
		parms.put("P_WARNING_TYPE", warningTp);
        int rows = getSqlMapClientTemplate().update("AL_ALARM_WORKS1.upateEndTimeAlarm", parms);
        return rows;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SYS_PARAMETER> titleBCVanHanhKyThuat(String function) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("P_TYPE", function);
		map.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("AL_ALARM_WORKS1.titleBCVanHanhKyThuat", map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AlAlarmWorks> getBCVanHanhKyThuat(String dateF, String dateT,
			String caTK, String bscid, String cellid, String alarmName,
			String groups, String team, String function) {
		Map<String, Object> map = new HashMap<String, Object>();
   		map.put("P_DATE_FROM", dateF);
   		map.put("P_DATE_TO", dateT);
   		map.put("P_SHIFT", caTK);
   		map.put("P_BSC", bscid);
   		map.put("P_CELL", cellid);
   		map.put("P_ALARM_NAME", alarmName);
   		map.put("P_GROUPS", groups);
   		map.put("P_TEAM", team);
   		map.put("P_FUNTION", function);
   		map.put("P_DATA", null);
   		return getSqlMapClientTemplate().queryForList("AL_ALARM_WORKS1.getBCVanHanhKyThuat", map);
	}

	@Override
	public int insertAlarmWork(AlAlarmWorks alarmWork) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("P_ID", alarmWork.getId());
   		map.put("P_SYSTEM", alarmWork.getSystem());
   		map.put("P_SITEID", alarmWork.getSiteid());
   		map.put("P_CELLID", alarmWork.getCellid());
   		map.put("P_STIME", alarmWork.getStime());
   		map.put("P_ETIME", alarmWork.getEtime());
   		map.put("P_ALARM", alarmWork.getAlarm());
   		map.put("P_ALARM_INFO", alarmWork.getAlarmInfo());
   		map.put("P_CAUSEBY", alarmWork.getCauseby());
   		map.put("P_ACTION_PROCESS", alarmWork.getActionProcess());
   		map.put("P_RESULTS_PROCESS", alarmWork.getResultsProcess());
   		map.put("P_REPORT_PROCESS", alarmWork.getReportProcess());
   		map.put("P_TEAM_PROCESS", alarmWork.getTeamProcess());
   		map.put("P_WARNING_TYPE", alarmWork.getWarningType());
   		map.put("P_SHIFT_ID", alarmWork.getShiftId());
   		map.put("P_CREATED_BY_TCP_IP", alarmWork.getCreatedByTcpIp());
   		map.put("P_MODIFIED_BY_TCP_IP", alarmWork.getModifiedByTcpIp());
   		map.put("P_USER_PROCESS", alarmWork.getUserProcess());
   		map.put("P_COUNT_SITE", alarmWork.getCountSite());
   		map.put("P_OPERATOR", alarmWork.getOperator());
   		map.put("P_CAUSEBY_SYSTEM", alarmWork.getCausebySystem());
   		map.put("P_DESCRIPTION", alarmWork.getDescription());
   		map.put("P_AREA", alarmWork.getArea());
   		map.put("P_ALARM_TYPE", alarmWork.getAlarmType());
   		map.put("P_DEPT", alarmWork.getDept());
   		map.put("P_SITE_LIST", alarmWork.getSiteList());
   		map.put("P_SITE_QUANTITY", alarmWork.getSiteQuantity());
   		map.put("P_MD_SDATE", alarmWork.getMdSdate());
   		map.put("P_GROUPS", alarmWork.getGroups());
   		map.put("P_MODIFIED_BY", alarmWork.getModifiedBy());
   		map.put("P_MODIFY_DATE", alarmWork.getModifyDate());
   		map.put("P_CREATED_BY", alarmWork.getCreatedBy());
   		map.put("P_CREATE_DATE", alarmWork.getCreateDate());
   		map.put("P_IS_SPECIAL", alarmWork.getIsSpecial());
   		map.put("P_CONTACT_TIME", alarmWork.getContactTime());
   		map.put("P_LEASE_LINE", alarmWork.getLeaseLine());
   		map.put("P_IS_SENDLEASELINE", alarmWork.getIsSendLeaseLine());
   		map.put("P_STANDARD_NAME", alarmWork.getStandardName());
   		map.put("P_STATUS_UCTT", alarmWork.getStatusUCTT());
  		map.put("P_TIME_UCTT", alarmWork.getTimeUCTT());
   		map.put("P_REGION", alarmWork.getRegion());
   		map.put("P_POWER_SITE", alarmWork.getPowerSite());
   		map.put("P_ACCU_LEAST", alarmWork.getAccuLeast());
   		map.put("P_BATERRY_DUARATION", alarmWork.getBaterryDuar());
   		int rows = getSqlMapClientTemplate().update("AL_ALARM_WORKS1.insertAlarmWork", map);
   		return rows;
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<AlAlarmWorks> getWarningListShif(String warningtype,
			String shiftid, String ngayTKTo, String ngayTK, String type,
			String strWhere, Integer startRecord, Integer endRecord, String sortfield,
			String sortorder,String region, String maPhong) {
		Map<String, Object> map = new HashMap<String, Object>();
   		map.put("P_WARNING_TYPE", warningtype);
   		map.put("P_SHIFT_ID", shiftid);
   		map.put("P_DAY_TO", ngayTKTo);
   		map.put("P_DAY", ngayTK);
   		map.put("P_TYPE_FORM", type);
   		map.put("P_WHERE", strWhere);
   		map.put("P_START_RECORD", startRecord);
   		map.put("P_END_RECORD", endRecord);
   		map.put("P_COLUMN", sortfield);
   		map.put("P_ORDER", sortorder);
   		map.put("P_REGION", region);
   		map.put("P_MA_PHONG", maPhong);
   		map.put("P_DATA", null);
   		return getSqlMapClientTemplate().queryForList("AL_ALARM_WORKS1.getWarningListShif", map);
	}

	@Override
	public int countWarningListShif(String warningtype, String shiftid,
			String ngayTKTo, String ngayTK, String type, String strWhere,String region, String maPhong) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("P_WARNING_TYPE", warningtype);
   		map.put("P_SHIFT_ID", shiftid);
   		map.put("P_DAY_TO", ngayTKTo);
   		map.put("P_DAY", ngayTK);
   		map.put("P_TYPE_FORM", type);
   		map.put("P_WHERE", strWhere);
   		map.put("P_REGION", region);
   		map.put("P_MA_PHONG", maPhong);
   		map.put("P_DATA", null);
   		getSqlMapClientTemplate().queryForObject("AL_ALARM_WORKS1.countWarningListShif", map);
      	Integer record = (Integer) map.get("P_DATA");
      	return record;
	}

	@Override
	public int SP_PUSH_SCL_LL(int id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("P_ID_SHIFT", id);
		int rows = getSqlMapClientTemplate().update("AL_ALARM_WORKS1.PR_SP_PUSH_SUCO_LL", map);
   		return rows;
	}

	
}