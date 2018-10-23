package vo.bts;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.hibernate.validator.constraints.NotEmpty;

public class W_WORKING_MANAGEMENTS implements Serializable {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.ID
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    private Integer id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.TEN_CONG_VIEC
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    private String maCongViec;
    
    
    public String getMaCongViec() {
		return maCongViec;
	}

	public void setMaCongViec(String maCongViec) {
		this.maCongViec = maCongViec;
	}

	@NotEmpty()
    private String tenCongViec;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.TOM_TAT_NOI_DUNG
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
	@NotEmpty()
    private String tomTatNoiDung;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.NOI_DUNG
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    private String noiDung;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.NGUOI_GIAO_VIEC
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    @NotEmpty()
    private String nguoiGiaoViec;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.NGUOI_CHU_TRI
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    @NotEmpty()
    private String nguoiChuTri;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.NGUOI_NHAN_VIEC
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    @NotEmpty()
    private String nguoiNhanViec;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.ASSIGN_DATE
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    private Date assignDate;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.ESTIMATE_DATE
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    private Date estimateDate;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.ACTUAL_DATE
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    private Date actualDate;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.TINH_TRANG
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    private String tinhTrang;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.CREATED_BY
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    private String createdBy;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.CREATE_DATE
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    private Date createDate;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.MODIFIED_BY
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    private String modifiedBy;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.MODIFY_DATE
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    private Date modifyDate;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.ID_WORK_TYPES
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    private Integer idWorkTypes;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.CREATED_BY_TCP_IP
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    private String createdByTcpIp;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column W_WORKING_MANAGEMENTS.MODIFIED_BY_TCP_IP
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    private String modifiedByTcpIp;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table W_WORKING_MANAGEMENTS
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.ID
     *
     * @return the value of W_WORKING_MANAGEMENTS.ID
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.ID
     *
     * @param id the value for W_WORKING_MANAGEMENTS.ID
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.TEN_CONG_VIEC
     *
     * @return the value of W_WORKING_MANAGEMENTS.TEN_CONG_VIEC
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public String getTenCongViec() {
        return tenCongViec;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.TEN_CONG_VIEC
     *
     * @param tenCongViec the value for W_WORKING_MANAGEMENTS.TEN_CONG_VIEC
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setTenCongViec(String tenCongViec) {
        this.tenCongViec = tenCongViec;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.TOM_TAT_NOI_DUNG
     *
     * @return the value of W_WORKING_MANAGEMENTS.TOM_TAT_NOI_DUNG
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public String getTomTatNoiDung() {
        return tomTatNoiDung;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.TOM_TAT_NOI_DUNG
     *
     * @param tomTatNoiDung the value for W_WORKING_MANAGEMENTS.TOM_TAT_NOI_DUNG
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setTomTatNoiDung(String tomTatNoiDung) {
        this.tomTatNoiDung = tomTatNoiDung;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.NOI_DUNG
     *
     * @return the value of W_WORKING_MANAGEMENTS.NOI_DUNG
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.NOI_DUNG
     *
     * @param noiDung the value for W_WORKING_MANAGEMENTS.NOI_DUNG
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.NGUOI_GIAO_VIEC
     *
     * @return the value of W_WORKING_MANAGEMENTS.NGUOI_GIAO_VIEC
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public String getNguoiGiaoViec() {
        return nguoiGiaoViec;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.NGUOI_GIAO_VIEC
     *
     * @param nguoiGiaoViec the value for W_WORKING_MANAGEMENTS.NGUOI_GIAO_VIEC
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setNguoiGiaoViec(String nguoiGiaoViec) {
        this.nguoiGiaoViec = nguoiGiaoViec;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.NGUOI_CHU_TRI
     *
     * @return the value of W_WORKING_MANAGEMENTS.NGUOI_CHU_TRI
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public String getNguoiChuTri() {
        return nguoiChuTri;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.NGUOI_CHU_TRI
     *
     * @param nguoiChuTri the value for W_WORKING_MANAGEMENTS.NGUOI_CHU_TRI
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setNguoiChuTri(String nguoiChuTri) {
        this.nguoiChuTri = nguoiChuTri;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.NGUOI_NHAN_VIEC
     *
     * @return the value of W_WORKING_MANAGEMENTS.NGUOI_NHAN_VIEC
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public String getNguoiNhanViec() {
        return nguoiNhanViec;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.NGUOI_NHAN_VIEC
     *
     * @param nguoiNhanViec the value for W_WORKING_MANAGEMENTS.NGUOI_NHAN_VIEC
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setNguoiNhanViec(String nguoiNhanViec) {
        this.nguoiNhanViec = nguoiNhanViec;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.ASSIGN_DATE
     *
     * @return the value of W_WORKING_MANAGEMENTS.ASSIGN_DATE
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public Date getAssignDate() {
        return assignDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.ASSIGN_DATE
     *
     * @param assignDate the value for W_WORKING_MANAGEMENTS.ASSIGN_DATE
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.ESTIMATE_DATE
     *
     * @return the value of W_WORKING_MANAGEMENTS.ESTIMATE_DATE
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public Date getEstimateDate() {
        return estimateDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.ESTIMATE_DATE
     *
     * @param estimateDate the value for W_WORKING_MANAGEMENTS.ESTIMATE_DATE
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setEstimateDate(Date estimateDate) {
        this.estimateDate = estimateDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.ACTUAL_DATE
     *
     * @return the value of W_WORKING_MANAGEMENTS.ACTUAL_DATE
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public Date getActualDate() {
        return actualDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.ACTUAL_DATE
     *
     * @param actualDate the value for W_WORKING_MANAGEMENTS.ACTUAL_DATE
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setActualDate(Date actualDate) {
        this.actualDate = actualDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.TINH_TRANG
     *
     * @return the value of W_WORKING_MANAGEMENTS.TINH_TRANG
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public String getTinhTrang() {
        return tinhTrang;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.TINH_TRANG
     *
     * @param tinhTrang the value for W_WORKING_MANAGEMENTS.TINH_TRANG
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.CREATED_BY
     *
     * @return the value of W_WORKING_MANAGEMENTS.CREATED_BY
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.CREATED_BY
     *
     * @param createdBy the value for W_WORKING_MANAGEMENTS.CREATED_BY
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.CREATE_DATE
     *
     * @return the value of W_WORKING_MANAGEMENTS.CREATE_DATE
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.CREATE_DATE
     *
     * @param createDate the value for W_WORKING_MANAGEMENTS.CREATE_DATE
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.MODIFIED_BY
     *
     * @return the value of W_WORKING_MANAGEMENTS.MODIFIED_BY
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.MODIFIED_BY
     *
     * @param modifiedBy the value for W_WORKING_MANAGEMENTS.MODIFIED_BY
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.MODIFY_DATE
     *
     * @return the value of W_WORKING_MANAGEMENTS.MODIFY_DATE
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.MODIFY_DATE
     *
     * @param modifyDate the value for W_WORKING_MANAGEMENTS.MODIFY_DATE
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.ID_WORK_TYPES
     *
     * @return the value of W_WORKING_MANAGEMENTS.ID_WORK_TYPES
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public Integer getIdWorkTypes() {
        return idWorkTypes;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.ID_WORK_TYPES
     *
     * @param idWorkTypes the value for W_WORKING_MANAGEMENTS.ID_WORK_TYPES
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setIdWorkTypes(Integer idWorkTypes) {
        this.idWorkTypes = idWorkTypes;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.CREATED_BY_TCP_IP
     *
     * @return the value of W_WORKING_MANAGEMENTS.CREATED_BY_TCP_IP
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public String getCreatedByTcpIp() {
        return createdByTcpIp;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.CREATED_BY_TCP_IP
     *
     * @param createdByTcpIp the value for W_WORKING_MANAGEMENTS.CREATED_BY_TCP_IP
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setCreatedByTcpIp(String createdByTcpIp) {
        this.createdByTcpIp = createdByTcpIp;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column W_WORKING_MANAGEMENTS.MODIFIED_BY_TCP_IP
     *
     * @return the value of W_WORKING_MANAGEMENTS.MODIFIED_BY_TCP_IP
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public String getModifiedByTcpIp() {
        return modifiedByTcpIp;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column W_WORKING_MANAGEMENTS.MODIFIED_BY_TCP_IP
     *
     * @param modifiedByTcpIp the value for W_WORKING_MANAGEMENTS.MODIFIED_BY_TCP_IP
     *
     * @ibatorgenerated Fri Aug 10 13:57:50 ICT 2012
     */
    public void setModifiedByTcpIp(String modifiedByTcpIp) {
        this.modifiedByTcpIp = modifiedByTcpIp;
    }

    
    
    public String getNgayHoanThanh() {
    	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		if(actualDate != null)
			return df.format(actualDate);
		else
			return null;
	}
    
    public String getNgayThucHienTT() {
    	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		if(actualSDate != null)
			return df.format(actualSDate);
		else
			return null;
	}
	
	public String getNgayGiaoViec() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		if(assignDate != null)
			return df.format(assignDate);
		else
			return null;
	}
	
	public String getNgayGiaoHoanThanh() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		if(estimateDate != null)
			return df.format(estimateDate);
		else
			return null;
	}
	
	private String startDate;
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	private String endDate;
	
	public String getTenNguoiGiaoViec() {
		return tenNguoiGiaoViec;
	}

	public void setTenNguoiGiaoViec(String tenNguoiGiaoViec) {
		this.tenNguoiGiaoViec = tenNguoiGiaoViec;
	}

	public String getTenNguoiChuTri() {
		return tenNguoiChuTri;
	}

	public void setTenNguoiChuTri(String tenNguoiChuTri) {
		this.tenNguoiChuTri = tenNguoiChuTri;
	}

	public String getTenNguoiNhanViec() {
		return tenNguoiNhanViec;
	}

	public void setTenNguoiNhanViec(String tenNguoiNhanViec) {
		this.tenNguoiNhanViec = tenNguoiNhanViec;
	}

	private String tenNguoiGiaoViec;
	private String tenNguoiChuTri;
	private String tenNguoiNhanViec;
	private String tenTinhTrang;
	 private Integer finishRate;
	private String danhGia;
	public String getTenTinhTrang() {
		return tenTinhTrang;
	}

	public void setTenTinhTrang(String tenTinhTrang) {
		this.tenTinhTrang = tenTinhTrang;
	}

	public Integer getFinishRate() {
		return finishRate;
	}

	public void setFinishRate(Integer finishRate) {
		this.finishRate = finishRate;
	}

	public String getDanhGia() {
		return danhGia;
	}

	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}
	

	private String yearShift;
	private String weekShift;
	private String dept;
	private String team;
	private String ccEmail;


	public String getYearShift() {
		return yearShift;
	}

	public void setYearShift(String yearShift) {
		this.yearShift = yearShift;
	}

	public String getWeekShift() {
		return weekShift;
	}

	public void setWeekShift(String weekShift) {
		this.weekShift = weekShift;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getCcEmail() {
		return ccEmail;
	}

	public void setCcEmail(String ccEmail) {
		this.ccEmail = ccEmail;
	}
	
	
	private String shift;
	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public Date getDayShift() {
		return dayShift;
	}

	public void setDayShift(Date dayShift) {
		this.dayShift = dayShift;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Integer getWwmFkId() {
		return wwmFkId;
	}

	public void setWwmFkId(Integer wwmFkId) {
		this.wwmFkId = wwmFkId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getlevel() {
		return level;
	}

	public void setlevel(Integer level) {
		this.level = level;
	}

	public String getCaTruc() {
		return caTruc;
	}

	public void setCaTruc(String caTruc) {
		this.caTruc = caTruc;
	}

	public String getWorkParentName() {
		return workParentName;
	}

	public void setWorkParentName(String workParentName) {
		this.workParentName = workParentName;
	}

	private Date dayShift;
	private String site;
	private String longitude;
	private String latitude;
	private Integer wwmFkId;
	private String comments;
	
	private Integer level;
	
	private String caTruc;
	
	private String workParentName;


	public String getAssignDateStr() {
		if (assignDate!=null)
    		return (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(assignDate));
    	return null;
	}

	public String getEstimateDateStr() {
		if (estimateDate!=null)
    		return (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(estimateDate));
    	return null;
	}

	public String getActualDateStr() {
		if (actualDate!=null)
    		return (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(actualDate));
    	return null;
	}

	
	public String getCreateDateStr() {
		if (createDate!=null)
    		return (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(createDate));
    	return null;
	}

	public String getModifyDateStr() {
		if (modifyDate!=null)
    		return (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(modifyDate));
    	return null;
	}

	public String getDayShiftStr() {
		if (dayShift!=null)
    		return (new SimpleDateFormat("dd/MM/yyyy").format(dayShift));
    	return null;
	}

	public String getAssessResult() {
		return assessResult;
	}

	public void setAssessResult(String assessResult) {
		this.assessResult = assessResult;
	}

	public String getTrangThaiDuyet() {
		return trangThaiDuyet;
	}

	public void setTrangThaiDuyet(String trangThaiDuyet) {
		this.trangThaiDuyet = trangThaiDuyet;
	}

	public String getNguoiPheDuyet() {
		return nguoiPheDuyet;
	}

	public void setNguoiPheDuyet(String nguoiPheDuyet) {
		this.nguoiPheDuyet = nguoiPheDuyet;
	}

	public String getAnhHuongDV() {
		return anhHuongDV;
	}

	public void setAnhHuongDV(String anhHuongDV) {
		this.anhHuongDV = anhHuongDV;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getThoiGianAnhHuongDV() {
		return thoiGianAnhHuongDV;
	}

	public void setThoiGianAnhHuongDV(int thoiGianAnhHuongDV) {
		this.thoiGianAnhHuongDV = thoiGianAnhHuongDV;
	}

	public String getCommandRelated() {
		return commandRelated;
	}

	public void setCommandRelated(String commandRelated) {
		this.commandRelated = commandRelated;
	}

	private String assessResult;
	
	private String nguoiPheDuyet;
	private String trangThaiDuyet;
	
	private String anhHuongDV;
	private String region;
	// 2016/08/03 ThanhNv edit: add a new field thoiGianAnhHuongDV
	private int thoiGianAnhHuongDV;
	
	//AnhCTV 07/01/2017
	// cac lenh/thiet bi lien quan
	private String commandRelated;
	//cac lenh tac dong thuc te
	private String commandReal;
	//thoi gian du kien thuc hien
	private Date estimateSDate;
	//thoi gian thuc hien thuc te
	private Date actualSDate;
	//muc do anh huong
	private String mucDoAnhHuong;


	public String getCommandReal() {
		return commandReal;
	}

	public void setCommandReal(String commandReal) {
		this.commandReal = commandReal;
	}

	public Date getEstimateSDate() {
		return estimateSDate;
	}

	public void setEstimateSDate(Date estimateSDate) {
		this.estimateSDate = estimateSDate;
	}

	public Date getActualSDate() {
		return actualSDate;
	}

	public void setActualSDate(Date actualSDate) {
		this.actualSDate = actualSDate;
	}

	public String getMucDoAnhHuong() {
		return mucDoAnhHuong;
	}

	public void setMucDoAnhHuong(String mucDoAnhHuong) {
		this.mucDoAnhHuong = mucDoAnhHuong;
	} 
	
	public String getAnhHuong() {
		return anhHuong;
	}

	public void setAnhHuong(String anhHuong) {
		this.anhHuong = anhHuong;
	}

	public String getNguoiThucHien() {
		return nguoiThucHien;
	}

	public void setNguoiThucHien(String nguoiThucHien) {
		this.nguoiThucHien = nguoiThucHien;
	}

	public String getIpOMC() {
		return ipOMC;
	}

	public void setIpOMC(String ipOMC) {
		this.ipOMC = ipOMC;
	}

	public String getIsDraft() {
		return isDraft;
	}

	public void setIsDraft(String isDraft) {
		this.isDraft = isDraft;
	}

	public String getNguoiPhoiHop() {
		return nguoiPhoiHop;
	}

	public void setNguoiPhoiHop(String nguoiPhoiHop) {
		this.nguoiPhoiHop = nguoiPhoiHop;
	}

	private String anhHuong;
	private String nguoiThucHien;
	private String ipOMC;
	private String isDraft;
	private String nguoiPhoiHop;
	
}