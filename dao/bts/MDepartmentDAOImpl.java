package dao.bts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import vo.bts.MDepartment;
import vo.bts.SYS_PARAMETER;

public class MDepartmentDAOImpl extends SqlMapClientDaoSupport implements MDepartmentDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table M_DEPARTMENT
	 *
	 * @ibatorgenerated Thu Oct 25 11:19:35 ICT 2012
	 */
	public MDepartmentDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table M_DEPARTMENT
	 *
	 * @ibatorgenerated Thu Oct 25 11:19:35 ICT 2012
	 */
	public int deleteByPrimaryKey(Integer id) {
		MDepartment key = new MDepartment();
		key.setId(id);
		int rows = getSqlMapClientTemplate().delete("M_DEPARTMENT1.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table M_DEPARTMENT
	 *
	 * @ibatorgenerated Thu Oct 25 11:19:35 ICT 2012
	 */
	public void insert(MDepartment record) {
		getSqlMapClientTemplate().insert("M_DEPARTMENT1.ibatorgenerated_insert", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table M_DEPARTMENT
	 *
	 * @ibatorgenerated Thu Oct 25 11:19:35 ICT 2012
	 */
	public void insertSelective(MDepartment record) {
		getSqlMapClientTemplate().insert("M_DEPARTMENT1.ibatorgenerated_insertSelective", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table M_DEPARTMENT
	 *
	 * @ibatorgenerated Thu Oct 25 11:19:35 ICT 2012
	 */
	public MDepartment selectByPrimaryKey(String deptCode) {
		MDepartment key = new MDepartment();
		key.setDeptCode(deptCode);
		MDepartment record = (MDepartment) getSqlMapClientTemplate()
				.queryForObject("M_DEPARTMENT1.ibatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table M_DEPARTMENT
	 *
	 * @ibatorgenerated Thu Oct 25 11:19:35 ICT 2012
	 */
	public int updateByPrimaryKeySelective(MDepartment record) {
		int rows = getSqlMapClientTemplate().update("M_DEPARTMENT1.ibatorgenerated_updateByPrimaryKeySelective", record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method
	 * corresponds to the database table M_DEPARTMENT
	 *
	 * @ibatorgenerated Thu Oct 25 11:19:35 ICT 2012
	 */
	public int updateByPrimaryKey(MDepartment record) {
		int rows = getSqlMapClientTemplate().update("M_DEPARTMENT1.ibatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> getUserList(String system) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("system", system);

		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getUserList", map);
	}

	@SuppressWarnings("unchecked")
	public List<MDepartment> getPhongBanFilter(String maPhong, String tenVietTat, String tenPhong, String isEnable,
			String column, String order) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_DEPT_CODE", maPhong);
		parms.put("P_ABBREVIATED", tenVietTat);
		parms.put("P_DEPT_NAME", tenPhong);
		parms.put("P_IS_ENABLE", isEnable);
		parms.put("P_COLUMN", column);
		parms.put("P_ORDER", order);
		parms.put("P_DATA", null);
		List<MDepartment> phongBan = (List<MDepartment>) getSqlMapClientTemplate()
				.queryForList("M_DEPARTMENT1.getPhongBanFilter", parms);

		return phongBan;
	}

	public MDepartment selectByID(String id) {

		MDepartment key = new MDepartment();
		key.setId(Integer.parseInt(id));
		MDepartment record = (MDepartment) getSqlMapClientTemplate().queryForObject("M_DEPARTMENT1.selectByID", key);
		return record;
	}

	@SuppressWarnings("unchecked")
	public List<MDepartment> getPhongBanCha() {
		List<MDepartment> record = getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getPhongBanCha");
		return record;
	}

	@SuppressWarnings("unchecked")
	public List<MDepartment> getDepartmentList() {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_DATA", null);
		List<MDepartment> record = (List<MDepartment>) getSqlMapClientTemplate()
				.queryForList("M_DEPARTMENT1.getDepartmentList", parms);

		return record;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> getDepartmentDontId(String id) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_ID", id);
		parms.put("P_DATA", null);

		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getDepartmentDontId", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> getDepartementBySystem() {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_DATA", null);

		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getDepartmentBySys", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> checkUserExcuteExits(String alarm, String user) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("system", alarm);
		parms.put("username", user);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.checkUserExcuteExits", parms);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> distinctNhomPhongBan() {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_DATA", null);
		List<MDepartment> record = getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.distinctNhomPhongBan", parms);

		return record;
	}

	@Override
	public int countPhongBanCha(Integer id) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_ID", id);
		parms.put("P_DATA", null);
		getSqlMapClientTemplate().queryForObject("M_DEPARTMENT1.countPhongBanCha", parms);
		Integer record = (Integer) parms.get("P_DATA");

		return record;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SYS_PARAMETER> getSystemListBySp() {

		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getSystemListBySp", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SYS_PARAMETER> titleDepartment() {

		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.titleDepartment", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SYS_PARAMETER> getTrangThai() {

		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getTrangThai", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> checkUserAlarmExits(String user) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_DEPARMENT", user);
		parms.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.checkUserAlarmExits", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> getDepartmentByEquipment() {

		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getDepartmentByEquipment", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> getDepartmentForShiftList(String stt) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_STT", stt);
		parms.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getDepartmentForShiftList", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> loadTeamByDepartment(String department) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_DEPARTMENT", department);
		parms.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.loadTeamByDepartment", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> getVMDepartmentBacklog(String deptCode) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_DEPT_CODE", deptCode);
		parms.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getVMDepartmentBacklog", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> getDepartmentOfUser(String userLogin) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_USERNAME", userLogin);
		parms.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getDepartmentOfUser", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> getGroupByDeptTeam(String dept, String team) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_DEPARTMENT", dept);
		parms.put("P_TEAM", team);
		parms.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getGroupByDeptTeam", parms);
	}

	@Override
	public MDepartment selectMaByTenPhong(String tenPhong) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("P_TENPHONG", tenPhong);
		map.put("P_DATA", null);
		MDepartment record = (MDepartment) getSqlMapClientTemplate().queryForObject("M_DEPARTMENT1.getMaByTenPhong",
				map);
		return record;
	}

	// 07.01.2016: Lay danh sach the loai phong: CNOC, RNOC, Tổ UCTT
	@SuppressWarnings("unchecked")
	@Override
	public List<SYS_PARAMETER> getLevelDept() {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getLevelDept", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> getDepartmentByRegion(String region, String stt, String isShift) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_REGION", region);
		parms.put("P_STT", stt);
		parms.put("P_IS_SHIFT", isShift);
		parms.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getDepartmentByRegion", parms);
	}

	// 28.06.2016 lay danh sach region by THANHNV
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getDistinctRegion() {
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getDistinctRegion");
	}

	// 28.06.2016 lay danh sach department by region
	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> getDepartmentByOnlyRegion(String region) {
		MDepartment key = new MDepartment();
		key.setRegion(region);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getListDepartmentByOnlyRegion", key);
	}
	
	// lay danh sach phong ban theo phong ban cha va level dept
	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> getDepartmentByDeptCode_level(String dept, String level){
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_DEPT", dept);
		parms.put("P_LEVEL_DEPT", level);
		parms.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getDepartmentByDeptCode_level", parms);
	}

	//lay danh sach don vi anh huong: phong ban/quan huyen/thiet bi. phuc vu muc dich goi y tim kiem. AnhCTV:06/02/2017
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getDSDVAnhHuong() {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("P_DATA", null);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getDSDVAnhHuong", parms);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MDepartment> getToVtAndDvt(String username) {
		Map<String, Object> parms = new HashMap<String, Object>();
		parms.put("p_user_name", username);
		parms.put("p_data", null);
		return getSqlMapClientTemplate().queryForList("M_DEPARTMENT1.getToVtAndDvt", parms);
	}

}