package vo.bts;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class HQualityNetwork implements Serializable {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_QUALITY_NETWORK.ID
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    private Integer id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_QUALITY_NETWORK.GROUP_NAME
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    @NotEmpty()
    private String groupName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_QUALITY_NETWORK.QUALITY_NAME
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    @NotEmpty()
    private String qualityName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_QUALITY_NETWORK.QUALITY_CONDITION
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    private String qualityCondition;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_QUALITY_NETWORK.QUALITY_VALUE
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    @NotEmpty()
    private String qualityValue;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_QUALITY_NETWORK.QUALITY_UNIT
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    private String qualityUnit;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_QUALITY_NETWORK.CREATE_DATE
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    private Date createDate;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_QUALITY_NETWORK.CREATED_BY
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    private String createdBy;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_QUALITY_NETWORK.MODIFIED_BY
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    private String modifiedBy;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_QUALITY_NETWORK.MODIFY_DATE
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    private Date modifyDate;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_QUALITY_NETWORK.QUALITY_CODE
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    @NotEmpty()
    private String qualityCode;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_QUALITY_NETWORK.ORDERING
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    private Integer ordering;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table H_QUALITY_NETWORK
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_QUALITY_NETWORK.ID
     *
     * @return the value of H_QUALITY_NETWORK.ID
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_QUALITY_NETWORK.ID
     *
     * @param id the value for H_QUALITY_NETWORK.ID
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_QUALITY_NETWORK.GROUP_NAME
     *
     * @return the value of H_QUALITY_NETWORK.GROUP_NAME
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_QUALITY_NETWORK.GROUP_NAME
     *
     * @param groupName the value for H_QUALITY_NETWORK.GROUP_NAME
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_QUALITY_NETWORK.QUALITY_NAME
     *
     * @return the value of H_QUALITY_NETWORK.QUALITY_NAME
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public String getQualityName() {
        return qualityName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_QUALITY_NETWORK.QUALITY_NAME
     *
     * @param qualityName the value for H_QUALITY_NETWORK.QUALITY_NAME
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public void setQualityName(String qualityName) {
        this.qualityName = qualityName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_QUALITY_NETWORK.QUALITY_CONDITION
     *
     * @return the value of H_QUALITY_NETWORK.QUALITY_CONDITION
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public String getQualityCondition() {
        return qualityCondition;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_QUALITY_NETWORK.QUALITY_CONDITION
     *
     * @param qualityCondition the value for H_QUALITY_NETWORK.QUALITY_CONDITION
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public void setQualityCondition(String qualityCondition) {
        this.qualityCondition = qualityCondition;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_QUALITY_NETWORK.QUALITY_VALUE
     *
     * @return the value of H_QUALITY_NETWORK.QUALITY_VALUE
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public String getQualityValue() {
        return qualityValue;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_QUALITY_NETWORK.QUALITY_VALUE
     *
     * @param qualityValue the value for H_QUALITY_NETWORK.QUALITY_VALUE
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public void setQualityValue(String qualityValue) {
        this.qualityValue = qualityValue;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_QUALITY_NETWORK.QUALITY_UNIT
     *
     * @return the value of H_QUALITY_NETWORK.QUALITY_UNIT
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public String getQualityUnit() {
        return qualityUnit;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_QUALITY_NETWORK.QUALITY_UNIT
     *
     * @param qualityUnit the value for H_QUALITY_NETWORK.QUALITY_UNIT
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public void setQualityUnit(String qualityUnit) {
        this.qualityUnit = qualityUnit;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_QUALITY_NETWORK.CREATE_DATE
     *
     * @return the value of H_QUALITY_NETWORK.CREATE_DATE
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_QUALITY_NETWORK.CREATE_DATE
     *
     * @param createDate the value for H_QUALITY_NETWORK.CREATE_DATE
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_QUALITY_NETWORK.CREATED_BY
     *
     * @return the value of H_QUALITY_NETWORK.CREATED_BY
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_QUALITY_NETWORK.CREATED_BY
     *
     * @param createdBy the value for H_QUALITY_NETWORK.CREATED_BY
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_QUALITY_NETWORK.MODIFIED_BY
     *
     * @return the value of H_QUALITY_NETWORK.MODIFIED_BY
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_QUALITY_NETWORK.MODIFIED_BY
     *
     * @param modifiedBy the value for H_QUALITY_NETWORK.MODIFIED_BY
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_QUALITY_NETWORK.MODIFY_DATE
     *
     * @return the value of H_QUALITY_NETWORK.MODIFY_DATE
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_QUALITY_NETWORK.MODIFY_DATE
     *
     * @param modifyDate the value for H_QUALITY_NETWORK.MODIFY_DATE
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_QUALITY_NETWORK.QUALITY_CODE
     *
     * @return the value of H_QUALITY_NETWORK.QUALITY_CODE
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public String getQualityCode() {
        return qualityCode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_QUALITY_NETWORK.QUALITY_CODE
     *
     * @param qualityCode the value for H_QUALITY_NETWORK.QUALITY_CODE
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public void setQualityCode(String qualityCode) {
        this.qualityCode = qualityCode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_QUALITY_NETWORK.ORDERING
     *
     * @return the value of H_QUALITY_NETWORK.ORDERING
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public Integer getOrdering() {
        return ordering;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_QUALITY_NETWORK.ORDERING
     *
     * @param ordering the value for H_QUALITY_NETWORK.ORDERING
     *
     * @ibatorgenerated Tue Feb 05 10:48:31 ICT 2013
     */
    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }
}