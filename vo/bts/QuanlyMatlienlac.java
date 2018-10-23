package vo.bts;

import java.util.Date;

//class model quan ly mat lien lac - ThanhNv
public class QuanlyMatlienlac {
	private Integer id;
	private String ne;
	private String site;
	private String cellid;
	private Date sdate;
	private Date edate;
	private String alarmType;
	private String severity;
	private String alarmName;
	private String alarmInfo;
	private String alarmId;
	private Integer shiftId;
	private String district;
	private String dept;
	private String causeby;
	private String causebySys;
	private String actionProcess;
	private String description;
	private String network;
	private String vendor;
	private String team;
	private String groups;
	private String note;
	private String createdBy;
	private Date createDate;
	private String modifiedBy;
	private Date modifyDate;
	private String neType;
	private String fmAlarmid;
	private String province;
	private String region;
	private String duaration;
	private String timeSend;
	private String receivedBy;
	private String email;
	private String uctt;
	private String acknowledge;
	private String nguyenNhanMllUctt;
	public QuanlyMatlienlac() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuanlyMatlienlac(Integer id, String ne, String site, String cellid, Date sdate, Date edate, String alarmType,
			String severity, String alarmName, String alarmInfo, String alarmId, Integer shiftId, String district,
			String dept, String causeby, String causebySys, String actionProcess, String description, String network,
			String vendor, String team, String groups, String note, String createdBy, Date createDate,
			String modifiedBy, Date modifyDate, String neType, String fmAlarmid, String province, String region,
			String duaration, String timeSend, String receivedBy, String email, String uctt, String acknowledge,
			String nguyenNhanMllUctt) {
		super();
		this.id = id;
		this.ne = ne;
		this.site = site;
		this.cellid = cellid;
		this.sdate = sdate;
		this.edate = edate;
		this.alarmType = alarmType;
		this.severity = severity;
		this.alarmName = alarmName;
		this.alarmInfo = alarmInfo;
		this.alarmId = alarmId;
		this.shiftId = shiftId;
		this.district = district;
		this.dept = dept;
		this.causeby = causeby;
		this.causebySys = causebySys;
		this.actionProcess = actionProcess;
		this.description = description;
		this.network = network;
		this.vendor = vendor;
		this.team = team;
		this.groups = groups;
		this.note = note;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifyDate = modifyDate;
		this.neType = neType;
		this.fmAlarmid = fmAlarmid;
		this.province = province;
		this.region = region;
		this.duaration = duaration;
		this.timeSend = timeSend;
		this.receivedBy = receivedBy;
		this.email = email;
		this.uctt = uctt;
		this.acknowledge = acknowledge;
		this.nguyenNhanMllUctt = nguyenNhanMllUctt;
	}
	public String getAcknowledge() {
		return acknowledge;
	}
	public void setAcknowledge(String acknowledge) {
		this.acknowledge = acknowledge;
	}
	public String getNguyenNhanMllUctt() {
		return nguyenNhanMllUctt;
	}
	public void setNguyenNhanMllUctt(String nguyenNhanMllUctt) {
		this.nguyenNhanMllUctt = nguyenNhanMllUctt;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNe() {
		return ne;
	}
	public void setNe(String ne) {
		this.ne = ne;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getCellid() {
		return cellid;
	}
	public void setCellid(String cellid) {
		this.cellid = cellid;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	public String getAlarmType() {
		return alarmType;
	}
	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getAlarmName() {
		return alarmName;
	}
	public void setAlarmName(String alarmName) {
		this.alarmName = alarmName;
	}
	public String getAlarmInfo() {
		return alarmInfo;
	}
	public void setAlarmInfo(String alarmInfo) {
		this.alarmInfo = alarmInfo;
	}
	public String getAlarmId() {
		return alarmId;
	}
	public void setAlarmId(String alarmId) {
		this.alarmId = alarmId;
	}
	public Integer getShiftId() {
		return shiftId;
	}
	public void setShiftId(Integer shiftId) {
		this.shiftId = shiftId;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCauseby() {
		return causeby;
	}
	public void setCauseby(String causeby) {
		this.causeby = causeby;
	}
	public String getCausebySys() {
		return causebySys;
	}
	public void setCausebySys(String causebySys) {
		this.causebySys = causebySys;
	}
	public String getActionProcess() {
		return actionProcess;
	}
	public void setActionProcess(String actionProcess) {
		this.actionProcess = actionProcess;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getGroups() {
		return groups;
	}
	public void setGroups(String groups) {
		this.groups = groups;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getNeType() {
		return neType;
	}
	public void setNeType(String neType) {
		this.neType = neType;
	}
	public String getFmAlarmid() {
		return fmAlarmid;
	}
	public void setFmAlarmid(String fmAlarmid) {
		this.fmAlarmid = fmAlarmid;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDuaration() {
		return duaration;
	}
	public void setDuaration(String duaration) {
		this.duaration = duaration;
	}
	public String getTimeSend() {
		return timeSend;
	}
	public void setTimeSend(String timeSend) {
		this.timeSend = timeSend;
	}
	public String getReceivedBy() {
		return receivedBy;
	}
	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUctt() {
		return uctt;
	}
	public void setUctt(String uctt) {
		this.uctt = uctt;
	}
	
	

}
