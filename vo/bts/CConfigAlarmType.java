package vo.bts;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class CConfigAlarmType implements Serializable {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.ID
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private Integer id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.VENDOR
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    @NotEmpty()
    private String vendor;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.NODE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    @NotEmpty()
    private String node;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.RAW_TABLE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    @NotEmpty()
    private String rawTable;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.BLOCK_COLUMN_NAME
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    @NotEmpty()
    private String blockColumnName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.BLOCK_VALUE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    @NotEmpty()
    private String blockValue;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.ALARM_INFO_COLUMN_NAME
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private String alarmInfoColumnName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.ALARM_INFO_VALUE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private String alarmInfoValue;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.ALARM_TYPE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    @NotEmpty()
    private String alarmType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.ALARM_MAPPING_NAME
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    @NotEmpty()
    private String alarmMappingName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.ALARM_MAPPING_ID
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    @NotEmpty()
    private String alarmMappingId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.ORDERING
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private Integer ordering;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.IS_ENABLE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private String isEnable;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.SUMMARY_TYPE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private String summaryType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.SEARCH
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private String search;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.DESCRIPTION
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private String description;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.CREATED_BY
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private String createdBy;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.CREATE_DATE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private Date createDate;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.MODIFIED_BY
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private String modifiedBy;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.MODIFY_DATE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private Date modifyDate;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.IS_MONITOR
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private String isMonitor;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.NE_TYPE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private String neType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column C_CONFIG_ALARM_TYPE.IS_SEND_SMS
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private String isSendSms;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table C_CONFIG_ALARM_TYPE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.ID
     *
     * @return the value of C_CONFIG_ALARM_TYPE.ID
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.ID
     *
     * @param id the value for C_CONFIG_ALARM_TYPE.ID
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.VENDOR
     *
     * @return the value of C_CONFIG_ALARM_TYPE.VENDOR
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.VENDOR
     *
     * @param vendor the value for C_CONFIG_ALARM_TYPE.VENDOR
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.NODE
     *
     * @return the value of C_CONFIG_ALARM_TYPE.NODE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getNode() {
        return node;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.NODE
     *
     * @param node the value for C_CONFIG_ALARM_TYPE.NODE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setNode(String node) {
        this.node = node;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.RAW_TABLE
     *
     * @return the value of C_CONFIG_ALARM_TYPE.RAW_TABLE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getRawTable() {
        return rawTable;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.RAW_TABLE
     *
     * @param rawTable the value for C_CONFIG_ALARM_TYPE.RAW_TABLE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setRawTable(String rawTable) {
        this.rawTable = rawTable;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.BLOCK_COLUMN_NAME
     *
     * @return the value of C_CONFIG_ALARM_TYPE.BLOCK_COLUMN_NAME
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getBlockColumnName() {
        return blockColumnName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.BLOCK_COLUMN_NAME
     *
     * @param blockColumnName the value for C_CONFIG_ALARM_TYPE.BLOCK_COLUMN_NAME
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setBlockColumnName(String blockColumnName) {
        this.blockColumnName = blockColumnName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.BLOCK_VALUE
     *
     * @return the value of C_CONFIG_ALARM_TYPE.BLOCK_VALUE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getBlockValue() {
        return blockValue;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.BLOCK_VALUE
     *
     * @param blockValue the value for C_CONFIG_ALARM_TYPE.BLOCK_VALUE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setBlockValue(String blockValue) {
        this.blockValue = blockValue;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.ALARM_INFO_COLUMN_NAME
     *
     * @return the value of C_CONFIG_ALARM_TYPE.ALARM_INFO_COLUMN_NAME
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getAlarmInfoColumnName() {
        return alarmInfoColumnName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.ALARM_INFO_COLUMN_NAME
     *
     * @param alarmInfoColumnName the value for C_CONFIG_ALARM_TYPE.ALARM_INFO_COLUMN_NAME
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setAlarmInfoColumnName(String alarmInfoColumnName) {
        this.alarmInfoColumnName = alarmInfoColumnName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.ALARM_INFO_VALUE
     *
     * @return the value of C_CONFIG_ALARM_TYPE.ALARM_INFO_VALUE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getAlarmInfoValue() {
        return alarmInfoValue;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.ALARM_INFO_VALUE
     *
     * @param alarmInfoValue the value for C_CONFIG_ALARM_TYPE.ALARM_INFO_VALUE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setAlarmInfoValue(String alarmInfoValue) {
        this.alarmInfoValue = alarmInfoValue;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.ALARM_TYPE
     *
     * @return the value of C_CONFIG_ALARM_TYPE.ALARM_TYPE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getAlarmType() {
        return alarmType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.ALARM_TYPE
     *
     * @param alarmType the value for C_CONFIG_ALARM_TYPE.ALARM_TYPE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.ALARM_MAPPING_NAME
     *
     * @return the value of C_CONFIG_ALARM_TYPE.ALARM_MAPPING_NAME
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getAlarmMappingName() {
        return alarmMappingName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.ALARM_MAPPING_NAME
     *
     * @param alarmMappingName the value for C_CONFIG_ALARM_TYPE.ALARM_MAPPING_NAME
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setAlarmMappingName(String alarmMappingName) {
        this.alarmMappingName = alarmMappingName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.ALARM_MAPPING_ID
     *
     * @return the value of C_CONFIG_ALARM_TYPE.ALARM_MAPPING_ID
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getAlarmMappingId() {
        return alarmMappingId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.ALARM_MAPPING_ID
     *
     * @param alarmMappingId the value for C_CONFIG_ALARM_TYPE.ALARM_MAPPING_ID
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setAlarmMappingId(String alarmMappingId) {
        this.alarmMappingId = alarmMappingId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.ORDERING
     *
     * @return the value of C_CONFIG_ALARM_TYPE.ORDERING
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public Integer getOrdering() {
        return ordering;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.ORDERING
     *
     * @param ordering the value for C_CONFIG_ALARM_TYPE.ORDERING
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.IS_ENABLE
     *
     * @return the value of C_CONFIG_ALARM_TYPE.IS_ENABLE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getIsEnable() {
        return isEnable;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.IS_ENABLE
     *
     * @param isEnable the value for C_CONFIG_ALARM_TYPE.IS_ENABLE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.SUMMARY_TYPE
     *
     * @return the value of C_CONFIG_ALARM_TYPE.SUMMARY_TYPE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getSummaryType() {
        return summaryType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.SUMMARY_TYPE
     *
     * @param summaryType the value for C_CONFIG_ALARM_TYPE.SUMMARY_TYPE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setSummaryType(String summaryType) {
        this.summaryType = summaryType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.SEARCH
     *
     * @return the value of C_CONFIG_ALARM_TYPE.SEARCH
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getSearch() {
        return search;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.SEARCH
     *
     * @param search the value for C_CONFIG_ALARM_TYPE.SEARCH
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setSearch(String search) {
        this.search = search;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.DESCRIPTION
     *
     * @return the value of C_CONFIG_ALARM_TYPE.DESCRIPTION
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.DESCRIPTION
     *
     * @param description the value for C_CONFIG_ALARM_TYPE.DESCRIPTION
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.CREATED_BY
     *
     * @return the value of C_CONFIG_ALARM_TYPE.CREATED_BY
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.CREATED_BY
     *
     * @param createdBy the value for C_CONFIG_ALARM_TYPE.CREATED_BY
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.CREATE_DATE
     *
     * @return the value of C_CONFIG_ALARM_TYPE.CREATE_DATE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.CREATE_DATE
     *
     * @param createDate the value for C_CONFIG_ALARM_TYPE.CREATE_DATE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.MODIFIED_BY
     *
     * @return the value of C_CONFIG_ALARM_TYPE.MODIFIED_BY
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.MODIFIED_BY
     *
     * @param modifiedBy the value for C_CONFIG_ALARM_TYPE.MODIFIED_BY
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.MODIFY_DATE
     *
     * @return the value of C_CONFIG_ALARM_TYPE.MODIFY_DATE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.MODIFY_DATE
     *
     * @param modifyDate the value for C_CONFIG_ALARM_TYPE.MODIFY_DATE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.IS_MONITOR
     *
     * @return the value of C_CONFIG_ALARM_TYPE.IS_MONITOR
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getIsMonitor() {
        return isMonitor;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.IS_MONITOR
     *
     * @param isMonitor the value for C_CONFIG_ALARM_TYPE.IS_MONITOR
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setIsMonitor(String isMonitor) {
        this.isMonitor = isMonitor;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.NE_TYPE
     *
     * @return the value of C_CONFIG_ALARM_TYPE.NE_TYPE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getNeType() {
        return neType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.NE_TYPE
     *
     * @param neType the value for C_CONFIG_ALARM_TYPE.NE_TYPE
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setNeType(String neType) {
        this.neType = neType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column C_CONFIG_ALARM_TYPE.IS_SEND_SMS
     *
     * @return the value of C_CONFIG_ALARM_TYPE.IS_SEND_SMS
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public String getIsSendSms() {
        return isSendSms;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column C_CONFIG_ALARM_TYPE.IS_SEND_SMS
     *
     * @param isSendSms the value for C_CONFIG_ALARM_TYPE.IS_SEND_SMS
     *
     * @ibatorgenerated Thu Oct 24 15:33:35 PDT 2013
     */
    public void setIsSendSms(String isSendSms) {
        this.isSendSms = isSendSms;
    }
    
    private String isMonitorName;
    private String isEnableName;
    private String isSendSmsName;

	public String getIsMonitorName() {
		return isMonitorName;
	}

	public void setIsMonitorName(String isMonitorName) {
		this.isMonitorName = isMonitorName;
	}

	public String getIsEnableName() {
		return isEnableName;
	}

	public void setIsEnableName(String isEnableName) {
		this.isEnableName = isEnableName;
	}

	public String getIsSendSmsName() {
		return isSendSmsName;
	}

	public void setIsSendSmsName(String isSendSmsName) {
		this.isSendSmsName = isSendSmsName;
	}
    
	public String getOrderingStr() {
		if(ordering != null)
			return ordering.toString();
		else
			return null;
	}
	
	private String brandname;

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	
	public String getIsSoundAlarm() {
		return isSoundAlarm;
	}

	public void setIsSoundAlarm(String isSoundAlarm) {
		this.isSoundAlarm = isSoundAlarm;
	}

	private String isSoundAlarm;
	
}