package vo.bts;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class W_WORKING_TYPES implements Serializable {
    /**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column W_WORKING_TYPES.ID
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	private Integer id ;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column W_WORKING_TYPES.NAME
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	@NotEmpty()
	private String name;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column W_WORKING_TYPES.ORDERING
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	private Integer ordering;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column W_WORKING_TYPES.DESCRIPTION
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	private String description;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column W_WORKING_TYPES.CREATED_BY
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	private String createdBy;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column W_WORKING_TYPES.CREATE_DATE
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	private Date createDate;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column W_WORKING_TYPES.MODIFIED_BY
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	private String modifiedBy;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column W_WORKING_TYPES.MODIFY_DATE
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	private Date modifyDate;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column W_WORKING_TYPES.CREATED_BY_TCP_IP
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	private String createdByTcpIp;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column W_WORKING_TYPES.MODIFIED_BY_TCP_IP
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	private String modifiedByTcpIp;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table W_WORKING_TYPES
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column W_WORKING_TYPES.ID
	 * @return  the value of W_WORKING_TYPES.ID
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column W_WORKING_TYPES.ID
	 * @param id  the value for W_WORKING_TYPES.ID
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column W_WORKING_TYPES.NAME
	 * @return  the value of W_WORKING_TYPES.NAME
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column W_WORKING_TYPES.NAME
	 * @param name  the value for W_WORKING_TYPES.NAME
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column W_WORKING_TYPES.ORDERING
	 * @return  the value of W_WORKING_TYPES.ORDERING
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public Integer getOrdering() {
		return ordering;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column W_WORKING_TYPES.ORDERING
	 * @param ordering  the value for W_WORKING_TYPES.ORDERING
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public void setOrdering(Integer ordering) {
		this.ordering = ordering;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column W_WORKING_TYPES.DESCRIPTION
	 * @return  the value of W_WORKING_TYPES.DESCRIPTION
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column W_WORKING_TYPES.DESCRIPTION
	 * @param description  the value for W_WORKING_TYPES.DESCRIPTION
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column W_WORKING_TYPES.CREATED_BY
	 * @return  the value of W_WORKING_TYPES.CREATED_BY
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column W_WORKING_TYPES.CREATED_BY
	 * @param createdBy  the value for W_WORKING_TYPES.CREATED_BY
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column W_WORKING_TYPES.CREATE_DATE
	 * @return  the value of W_WORKING_TYPES.CREATE_DATE
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column W_WORKING_TYPES.CREATE_DATE
	 * @param createDate  the value for W_WORKING_TYPES.CREATE_DATE
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column W_WORKING_TYPES.MODIFIED_BY
	 * @return  the value of W_WORKING_TYPES.MODIFIED_BY
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column W_WORKING_TYPES.MODIFIED_BY
	 * @param modifiedBy  the value for W_WORKING_TYPES.MODIFIED_BY
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column W_WORKING_TYPES.MODIFY_DATE
	 * @return  the value of W_WORKING_TYPES.MODIFY_DATE
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public Date getModifyDate() {
		return modifyDate;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column W_WORKING_TYPES.MODIFY_DATE
	 * @param modifyDate  the value for W_WORKING_TYPES.MODIFY_DATE
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column W_WORKING_TYPES.CREATED_BY_TCP_IP
	 * @return  the value of W_WORKING_TYPES.CREATED_BY_TCP_IP
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public String getCreatedByTcpIp() {
		return createdByTcpIp;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column W_WORKING_TYPES.CREATED_BY_TCP_IP
	 * @param createdByTcpIp  the value for W_WORKING_TYPES.CREATED_BY_TCP_IP
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public void setCreatedByTcpIp(String createdByTcpIp) {
		this.createdByTcpIp = createdByTcpIp;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column W_WORKING_TYPES.MODIFIED_BY_TCP_IP
	 * @return  the value of W_WORKING_TYPES.MODIFIED_BY_TCP_IP
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public String getModifiedByTcpIp() {
		return modifiedByTcpIp;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column W_WORKING_TYPES.MODIFIED_BY_TCP_IP
	 * @param modifiedByTcpIp  the value for W_WORKING_TYPES.MODIFIED_BY_TCP_IP
	 * @ibatorgenerated  Mon Jun 18 11:16:23 ICT 2012
	 */
	public void setModifiedByTcpIp(String modifiedByTcpIp) {
		this.modifiedByTcpIp = modifiedByTcpIp;
	}

	private int startRecord;

	private int endRecord;

	public int getStartRecord() {
		return startRecord;
	}

	public void setStartRecord(int startRecord) {
		this.startRecord = startRecord;
	}

	public int getEndRecord() {
		return endRecord;
	}

	public void setEndRecord(int endRecord) {
		this.endRecord = endRecord;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	private Integer countMana;

	public Integer getCountMana() {
		return countMana;
	}

	public void setCountMana(Integer countMana) {
		this.countMana = countMana;
	}
	
	private String orderingStr;


	public String getOrderingStr() {
		return orderingStr;
	}

	public void setOrderingStr(String orderingStr) {
		this.orderingStr = orderingStr;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	private String code;
	
}