package vo.bts;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class SYS_PARAMETER implements Serializable {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYS_PARAMETER.ID
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    private Integer id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYS_PARAMETER.CODE
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    @NotEmpty()
    private String code;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYS_PARAMETER.NAME
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    @NotEmpty()
    private String name;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYS_PARAMETER.VALUE
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    @NotEmpty()
    private String value;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYS_PARAMETER.ORDERING
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    private Integer ordering;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYS_PARAMETER.DATA_TYPE
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    private String dataType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYS_PARAMETER.CREATED_BY
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    private String createdBy;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYS_PARAMETER.CREATE_DATE
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    private Date createDate;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYS_PARAMETER.MODIFIED_BY
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    private String modifiedBy;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYS_PARAMETER.MODIFY_DATE
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    private Date modifyDate;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column SYS_PARAMETER.REMARK
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    private String remark;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table SYS_PARAMETER
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYS_PARAMETER.ID
     *
     * @return the value of SYS_PARAMETER.ID
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYS_PARAMETER.ID
     *
     * @param id the value for SYS_PARAMETER.ID
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYS_PARAMETER.CODE
     *
     * @return the value of SYS_PARAMETER.CODE
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYS_PARAMETER.CODE
     *
     * @param code the value for SYS_PARAMETER.CODE
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYS_PARAMETER.NAME
     *
     * @return the value of SYS_PARAMETER.NAME
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYS_PARAMETER.NAME
     *
     * @param name the value for SYS_PARAMETER.NAME
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYS_PARAMETER.VALUE
     *
     * @return the value of SYS_PARAMETER.VALUE
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYS_PARAMETER.VALUE
     *
     * @param value the value for SYS_PARAMETER.VALUE
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYS_PARAMETER.ORDERING
     *
     * @return the value of SYS_PARAMETER.ORDERING
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public Integer getOrdering() {
        return ordering;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYS_PARAMETER.ORDERING
     *
     * @param ordering the value for SYS_PARAMETER.ORDERING
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYS_PARAMETER.DATA_TYPE
     *
     * @return the value of SYS_PARAMETER.DATA_TYPE
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYS_PARAMETER.DATA_TYPE
     *
     * @param dataType the value for SYS_PARAMETER.DATA_TYPE
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYS_PARAMETER.CREATED_BY
     *
     * @return the value of SYS_PARAMETER.CREATED_BY
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYS_PARAMETER.CREATED_BY
     *
     * @param createdBy the value for SYS_PARAMETER.CREATED_BY
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYS_PARAMETER.CREATE_DATE
     *
     * @return the value of SYS_PARAMETER.CREATE_DATE
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYS_PARAMETER.CREATE_DATE
     *
     * @param createDate the value for SYS_PARAMETER.CREATE_DATE
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYS_PARAMETER.MODIFIED_BY
     *
     * @return the value of SYS_PARAMETER.MODIFIED_BY
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYS_PARAMETER.MODIFIED_BY
     *
     * @param modifiedBy the value for SYS_PARAMETER.MODIFIED_BY
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYS_PARAMETER.MODIFY_DATE
     *
     * @return the value of SYS_PARAMETER.MODIFY_DATE
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYS_PARAMETER.MODIFY_DATE
     *
     * @param modifyDate the value for SYS_PARAMETER.MODIFY_DATE
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column SYS_PARAMETER.REMARK
     *
     * @return the value of SYS_PARAMETER.REMARK
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column SYS_PARAMETER.REMARK
     *
     * @param remark the value for SYS_PARAMETER.REMARK
     *
     * @ibatorgenerated Thu Sep 06 10:56:36 ICT 2012
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    private String countTrangThai;

	public String getCountTrangThai() {
		return countTrangThai;
	}

	public void setCountTrangThai(String countTrangThai) {
		this.countTrangThai = countTrangThai;
	}
	
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	

	private Integer uid;
	
	private String llProvider;
	private String leaseLine;
	
	public String getLlProvider() {
		return llProvider;
	}

	public void setLlProvider(String llProvider) {
		this.llProvider = llProvider;
	}

	public String getLeaseLine() {
		return leaseLine;
	}

	public void setLeaseLine(String leaseLine) {
		this.leaseLine = leaseLine;
	}
}