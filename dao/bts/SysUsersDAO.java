package dao.bts;

import java.util.List;

import vo.bts.SYS_PARAMETER;
import vo.bts.SysUsers;

public interface SysUsersDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SYS_USERS
     *
     * @ibatorgenerated Wed Oct 24 16:22:23 ICT 2012
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SYS_USERS
     *
     * @ibatorgenerated Wed Oct 24 16:22:23 ICT 2012
     */
    void insert(SysUsers record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SYS_USERS
     *
     * @ibatorgenerated Wed Oct 24 16:22:23 ICT 2012
     */
    void insertSelective(SysUsers record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SYS_USERS
     *
     * @ibatorgenerated Wed Oct 24 16:22:23 ICT 2012
     */
    SysUsers selectByPrimaryKey(String username);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SYS_USERS
     *
     * @ibatorgenerated Wed Oct 24 16:22:23 ICT 2012
     */
    int updateByPrimaryKeySelective(SysUsers record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table SYS_USERS
     *
     * @ibatorgenerated Wed Oct 24 16:22:23 ICT 2012
     */
    int updateByPrimaryKey(SysUsers record);
    List<SysUsers> getUsersFilter(String maPhong, String username, String email, String phone, String isEnable, 
			String rolesAddUsers, String fullName, String column, String order);
    List<SysUsers> selectSysUsers();
    int updateIsEnable(SysUsers record);
    SysUsers selectByID(String id);
    List<SysUsers> getUserByMaPhong(String maPhong);
    List<SysUsers> getUsersByMaPhongDontId(String maPhong, Integer id);
    int selectByUsernamePassword(String username, String password);
    int updatePasswordForUsername(String username, String password);

	List<SysUsers> selectAllSysUsers();

	SysUsers selectSysUsersByUsername(String username);

	SysUsers selectSysUsersByfullName(String user);

	List<SYS_PARAMETER> titleSysUsers();

	List<SYS_PARAMETER> getQuyenTaoNDList();

	List<SYS_PARAMETER> getTrangThaiList();

	List<SYS_PARAMETER> titleDoiMatKhau();

	List<SysUsers> selectUsersOfAlarm();

	List<SysUsers> checkUser(String userN);

	List<SysUsers> getUserByUsername(String username);

	boolean getCountUserOfModule(String username, String system);

	List<SysUsers> getUserByGroupSMS(String group);

	/*int updateRolesForUsername(String username, String receivingSms,
			String receivingEmail, String rolesAddUsers, String modifiedBy);*/

	int updateSysUserArea(String id, String isEnable, String alarmKpi);

	int smsAddIsdn(String phone, String username);

	int copyRoleToUsernameNew(String username, String createdBy, String usernameNew,
			String passwordNew, String emailNew);

	int deleteRoleByUsername(String username);

	List<SysUsers> getCheckSysUsersByEmail(String email, String id);
	// lay danh sach lien he ten/sdt
	List<String> getContactUser(String depCode);

	List<SysUsers> checkEmailOfShift(String email);

	SysUsers getUserByPhone(String phoneNumber);

/*	List<SysUsers> getUserAllByMaPhong(String maPhong);*/

	int updateRolesForUsername(SysUsers record);

	List<SysUsers> getUserAllByMaPhong(String dept, String team);
	List<SysUsers> checkRole(String userN);
	//lay user co chuc vu ngang bang hoac be hon nguoi giao viec
	List<SysUsers> getUserForWork(String deptCode, String diliver);
	
	SysUsers selectByUsename(String username);
	  
	// kiem tra quyen cua user dang nhap. neu quyen bang 0: user chi co quyen xem, >1: user co quyen chinh sua
	Integer checkRoleInShift (String userN,String region,String department);

	// lay danh sach user co quyen phe duyet cong viec. 12/04/2016
	List<SysUsers> getUserApprove();

	
	// lay chuoi email theo danh sach user
	String getMailList(String maPhong, String user);
	
	// TRUNGNQ lay ma phong theo ten user vi method selectByUsename(String username)
	// lay ma phong = nvl(team, ma phong) 
	List<String> getMaPhongByUser(String user);
}