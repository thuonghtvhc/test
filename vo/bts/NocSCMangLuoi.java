package vo.bts;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class NocSCMangLuoi implements Serializable {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.ID
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private Integer id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.ID_CA_TRUC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private Integer idCaTruc;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.MA_PHONG
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String maPhong;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.TEN_SU_CO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String tenSuCo;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.LOAI_SU_CO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String loaiSuCo;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.THIET_BI
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    @NotEmpty()
    private String thietBi;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.ANH_HUONG_SC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String anhHuongSc;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.TG_BAT_DAU
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private Date tgBatDau;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.TG_KET_THUC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private Date tgKetThuc;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_FO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String nguoiXuLyFo;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.TG_PHAT_HIEN
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private Date tgPhatHien;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.TG_BACKOFFICE
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private Date tgBackoffice;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.TG_BC_LANH_DAO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private Date tgBcLanhDao;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.NGUOI_CHI_DAO_XL
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String nguoiChiDaoXl;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_BO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String nguoiXuLyBo;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_HT
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String nguoiXuLyHt;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_SSC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String nguoiXuLySsc;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.LOAI_NGUYEN_NHAN
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String loaiNguyenNhan;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.NGUYEN_NHAN
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String nguyenNhan;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.GIAI_PHAP_XL
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String giaiPhapXl;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.KET_QUA_XL
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String ketQuaXl;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.TON_TAI
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String tonTai;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.GUI_CNOC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String guiCnoc;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.KEY_SHARING
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String keySharing;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.NGUOI_TAO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String nguoiTao;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.NGAY_TAO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private Date ngayTao;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.NGUOI_SUA
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private String nguoiSua;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.NGAY_SUA
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private Date ngaySua;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column NOC_SU_CO_MANG_LUOI.KHU_VUC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */

    private String nhanCaTruc;
    private String khuVuc;
    private Integer soLuong;
    private Integer soLuongXuLy;
    private Float tiLeXuLy;
    private Float tgXuLyTB;
    private Float tiLeXuLyTGQD;
    private String tenPhong;
    private Date ngayTruc;
    private String ngay;
    

	public Integer getSoLuong() {
		return soLuong;
	}

	public String getSoLuongStr()
	{
		return String.valueOf(soLuong);
	}
	
	public String getSoLuongXuLyStr()
	{
		return String.valueOf(soLuongXuLy);
	}
	
	
	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public Integer getSoLuongXuLy() {
		return soLuongXuLy;
	}

	public void setSoLuongXuLy(Integer soLuongXuLy) {
		this.soLuongXuLy = soLuongXuLy;
	}

	public String getNgay() {
		return ngay;
	}

	public void setNgay(String ngay) {
		this.ngay = ngay;
	}

	public Float getTiLeXuLyTGQD() {
		return tiLeXuLyTGQD;
	}

	public void setTiLeXuLyTGQD(Float tiLeXuLyTGQD) {
		this.tiLeXuLyTGQD = tiLeXuLyTGQD;
	}


	public Float getTiLeXuLy() {
		return tiLeXuLy;
	}

	public void setTiLeXuLy(Float tiLeXuLy) {
		this.tiLeXuLy = tiLeXuLy;
	}

	public Float getTgXuLyTB() {
		return tgXuLyTB;
	}

	public String getTgXuLyTBStr() {
		return String.valueOf(tgXuLyTB);
	}
	
	public void setTgXuLyTB(Float tgXuLyTB) {
		this.tgXuLyTB = tgXuLyTB;
	}


	
    
    
    public String getNhanCaTruc() {
		return nhanCaTruc;
	}

	public void setNhanCaTruc(String nhanCaTruc) {
		this.nhanCaTruc = nhanCaTruc;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public Date getNgayTruc() {
		return ngayTruc;
	}

	public void setNgayTruc(Date ngayTruc) {
		this.ngayTruc = ngayTruc;
	}
	
	public String getNgayTrucStr() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		if (ngayTruc != null)
			return df.format(ngayTruc);
		else
			return null;
	}

    
    public String getTgBatDauStr() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		if(tgBatDau != null)
			return df.format(tgBatDau);
		else
			return null;
	}
    
    public String getTiLeXuLyStr() {
		return String.valueOf(tiLeXuLy);
	}

    public String getTiLeXuLyTGQDStr() {
		return String.valueOf(tiLeXuLyTGQD);
	}
    
    
    public String getTgKetThucStr() {
    	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		if (tgKetThuc != null)
			return df.format(tgKetThuc);
		else
		return null;
    }

    public String getTgPhatHienStr() {
    	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		if (tgPhatHien != null)
			return df.format(tgPhatHien);
		else
		return null;
    }
    
    public String getTgBCLDStr() {
    	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		if (tgBcLanhDao != null)
			return df.format(tgBcLanhDao);
		else
		return null;
    }
    
    public String getTgBackofficeStr() {
    	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		if (tgBackoffice != null)
			return df.format(tgBackoffice);
		else
		return null;
    }
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table NOC_SU_CO_MANG_LUOI
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.ID
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.ID
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.ID
     *
     * @param id the value for NOC_SU_CO_MANG_LUOI.ID
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.ID_CA_TRUC
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.ID_CA_TRUC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public Integer getIdCaTruc() {
        return idCaTruc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.ID_CA_TRUC
     *
     * @param idCaTruc the value for NOC_SU_CO_MANG_LUOI.ID_CA_TRUC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setIdCaTruc(Integer idCaTruc) {
        this.idCaTruc = idCaTruc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.MA_PHONG
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.MA_PHONG
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getMaPhong() {
        return maPhong;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.MA_PHONG
     *
     * @param maPhong the value for NOC_SU_CO_MANG_LUOI.MA_PHONG
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.TEN_SU_CO
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.TEN_SU_CO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getTenSuCo() {
        return tenSuCo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.TEN_SU_CO
     *
     * @param tenSuCo the value for NOC_SU_CO_MANG_LUOI.TEN_SU_CO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setTenSuCo(String tenSuCo) {
        this.tenSuCo = tenSuCo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.LOAI_SU_CO
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.LOAI_SU_CO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getLoaiSuCo() {
        return loaiSuCo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.LOAI_SU_CO
     *
     * @param loaiSuCo the value for NOC_SU_CO_MANG_LUOI.LOAI_SU_CO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setLoaiSuCo(String loaiSuCo) {
        this.loaiSuCo = loaiSuCo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.THIET_BI
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.THIET_BI
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getThietBi() {
        return thietBi;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.THIET_BI
     *
     * @param thietBi the value for NOC_SU_CO_MANG_LUOI.THIET_BI
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setThietBi(String thietBi) {
        this.thietBi = thietBi;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.ANH_HUONG_SC
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.ANH_HUONG_SC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getAnhHuongSc() {
        return anhHuongSc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.ANH_HUONG_SC
     *
     * @param anhHuongSc the value for NOC_SU_CO_MANG_LUOI.ANH_HUONG_SC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setAnhHuongSc(String anhHuongSc) {
        this.anhHuongSc = anhHuongSc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.TG_BAT_DAU
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.TG_BAT_DAU
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public Date getTgBatDau() {
        return tgBatDau;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.TG_BAT_DAU
     *
     * @param tgBatDau the value for NOC_SU_CO_MANG_LUOI.TG_BAT_DAU
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setTgBatDau(Date tgBatDau) {
        this.tgBatDau = tgBatDau;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.TG_KET_THUC
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.TG_KET_THUC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public Date getTgKetThuc() {
        return tgKetThuc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.TG_KET_THUC
     *
     * @param tgKetThuc the value for NOC_SU_CO_MANG_LUOI.TG_KET_THUC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setTgKetThuc(Date tgKetThuc) {
        this.tgKetThuc = tgKetThuc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_FO
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_FO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getNguoiXuLyFo() {
        return nguoiXuLyFo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_FO
     *
     * @param nguoiXuLyFo the value for NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_FO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setNguoiXuLyFo(String nguoiXuLyFo) {
        this.nguoiXuLyFo = nguoiXuLyFo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.TG_PHAT_HIEN
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.TG_PHAT_HIEN
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public Date getTgPhatHien() {
        return tgPhatHien;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.TG_PHAT_HIEN
     *
     * @param tgPhatHien the value for NOC_SU_CO_MANG_LUOI.TG_PHAT_HIEN
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setTgPhatHien(Date tgPhatHien) {
        this.tgPhatHien = tgPhatHien;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.TG_BACKOFFICE
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.TG_BACKOFFICE
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public Date getTgBackoffice() {
        return tgBackoffice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.TG_BACKOFFICE
     *
     * @param tgBackoffice the value for NOC_SU_CO_MANG_LUOI.TG_BACKOFFICE
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setTgBackoffice(Date tgBackoffice) {
        this.tgBackoffice = tgBackoffice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.TG_BC_LANH_DAO
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.TG_BC_LANH_DAO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public Date getTgBcLanhDao() {
        return tgBcLanhDao;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.TG_BC_LANH_DAO
     *
     * @param tgBcLanhDao the value for NOC_SU_CO_MANG_LUOI.TG_BC_LANH_DAO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setTgBcLanhDao(Date tgBcLanhDao) {
        this.tgBcLanhDao = tgBcLanhDao;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.NGUOI_CHI_DAO_XL
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.NGUOI_CHI_DAO_XL
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getNguoiChiDaoXl() {
        return nguoiChiDaoXl;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.NGUOI_CHI_DAO_XL
     *
     * @param nguoiChiDaoXl the value for NOC_SU_CO_MANG_LUOI.NGUOI_CHI_DAO_XL
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setNguoiChiDaoXl(String nguoiChiDaoXl) {
        this.nguoiChiDaoXl = nguoiChiDaoXl;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_BO
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_BO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getNguoiXuLyBo() {
        return nguoiXuLyBo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_BO
     *
     * @param nguoiXuLyBo the value for NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_BO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setNguoiXuLyBo(String nguoiXuLyBo) {
        this.nguoiXuLyBo = nguoiXuLyBo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_HT
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_HT
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getNguoiXuLyHt() {
        return nguoiXuLyHt;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_HT
     *
     * @param nguoiXuLyHt the value for NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_HT
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setNguoiXuLyHt(String nguoiXuLyHt) {
        this.nguoiXuLyHt = nguoiXuLyHt;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_SSC
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_SSC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getNguoiXuLySsc() {
        return nguoiXuLySsc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_SSC
     *
     * @param nguoiXuLySsc the value for NOC_SU_CO_MANG_LUOI.NGUOI_XU_LY_SSC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setNguoiXuLySsc(String nguoiXuLySsc) {
        this.nguoiXuLySsc = nguoiXuLySsc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.LOAI_NGUYEN_NHAN
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.LOAI_NGUYEN_NHAN
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getLoaiNguyenNhan() {
        return loaiNguyenNhan;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.LOAI_NGUYEN_NHAN
     *
     * @param loaiNguyenNhan the value for NOC_SU_CO_MANG_LUOI.LOAI_NGUYEN_NHAN
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setLoaiNguyenNhan(String loaiNguyenNhan) {
        this.loaiNguyenNhan = loaiNguyenNhan;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.NGUYEN_NHAN
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.NGUYEN_NHAN
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getNguyenNhan() {
        return nguyenNhan;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.NGUYEN_NHAN
     *
     * @param nguyenNhan the value for NOC_SU_CO_MANG_LUOI.NGUYEN_NHAN
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setNguyenNhan(String nguyenNhan) {
        this.nguyenNhan = nguyenNhan;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.GIAI_PHAP_XL
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.GIAI_PHAP_XL
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getGiaiPhapXl() {
        return giaiPhapXl;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.GIAI_PHAP_XL
     *
     * @param giaiPhapXl the value for NOC_SU_CO_MANG_LUOI.GIAI_PHAP_XL
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setGiaiPhapXl(String giaiPhapXl) {
        this.giaiPhapXl = giaiPhapXl;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.KET_QUA_XL
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.KET_QUA_XL
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getKetQuaXl() {
        return ketQuaXl;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.KET_QUA_XL
     *
     * @param ketQuaXl the value for NOC_SU_CO_MANG_LUOI.KET_QUA_XL
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setKetQuaXl(String ketQuaXl) {
        this.ketQuaXl = ketQuaXl;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.TON_TAI
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.TON_TAI
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getTonTai() {
        return tonTai;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.TON_TAI
     *
     * @param tonTai the value for NOC_SU_CO_MANG_LUOI.TON_TAI
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setTonTai(String tonTai) {
        this.tonTai = tonTai;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.GUI_CNOC
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.GUI_CNOC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getGuiCnoc() {
        return guiCnoc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.GUI_CNOC
     *
     * @param guiCnoc the value for NOC_SU_CO_MANG_LUOI.GUI_CNOC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setGuiCnoc(String guiCnoc) {
        this.guiCnoc = guiCnoc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.KEY_SHARING
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.KEY_SHARING
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getKeySharing() {
        return keySharing;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.KEY_SHARING
     *
     * @param keySharing the value for NOC_SU_CO_MANG_LUOI.KEY_SHARING
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setKeySharing(String keySharing) {
        this.keySharing = keySharing;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.NGUOI_TAO
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.NGUOI_TAO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getNguoiTao() {
        return nguoiTao;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.NGUOI_TAO
     *
     * @param nguoiTao the value for NOC_SU_CO_MANG_LUOI.NGUOI_TAO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.NGAY_TAO
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.NGAY_TAO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public Date getNgayTao() {
        return ngayTao;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.NGAY_TAO
     *
     * @param ngayTao the value for NOC_SU_CO_MANG_LUOI.NGAY_TAO
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.NGUOI_SUA
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.NGUOI_SUA
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getNguoiSua() {
        return nguoiSua;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.NGUOI_SUA
     *
     * @param nguoiSua the value for NOC_SU_CO_MANG_LUOI.NGUOI_SUA
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setNguoiSua(String nguoiSua) {
        this.nguoiSua = nguoiSua;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.NGAY_SUA
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.NGAY_SUA
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public Date getNgaySua() {
        return ngaySua;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.NGAY_SUA
     *
     * @param ngaySua the value for NOC_SU_CO_MANG_LUOI.NGAY_SUA
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column NOC_SU_CO_MANG_LUOI.KHU_VUC
     *
     * @return the value of NOC_SU_CO_MANG_LUOI.KHU_VUC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public String getKhuVuc() {
        return khuVuc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column NOC_SU_CO_MANG_LUOI.KHU_VUC
     *
     * @param khuVuc the value for NOC_SU_CO_MANG_LUOI.KHU_VUC
     *
     * @ibatorgenerated Thu Dec 24 08:51:47 ICT 2015
     */
    public void setKhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }
    
    public String getHeThong() {
		return heThong;
	}

	public void setHeThong(String heThong) {
		this.heThong = heThong;
	}
	public String getTgAnhHuong() {
		return tgAnhHuong;
	}

	public void setTgAnhHuong(String tgAnhHuong) {
		this.tgAnhHuong = tgAnhHuong;
	}

	public String getDvAnhHuong() {
		return dvAnhHuong;
	}

	public void setDvAnhHuong(String dvAnhHuong) {
		this.dvAnhHuong = dvAnhHuong;
	}
	public String getSlaSuCo() {
		return slaSuCo;
	}

	public void setSlaSuCo(String slaSuCo) {
		this.slaSuCo = slaSuCo;
	}
	private String heThong;
	
	private String tgAnhHuong;
	
	private String dvAnhHuong;
	
	private String slaSuCo;
	
	private String donVi;
	private String canhBao;
    private String effectNe;
    private String donViAnhHuong;
    private Date systemSdate;
    private Date systemEdate;
    private String idList;

	public Date getSystemSdate() {
		return systemSdate;
	}

	public void setSystemSdate(Date systemSdate) {
		this.systemSdate = systemSdate;
	}

	public Date getSystemEdate() {
		return systemEdate;
	}

	public void setSystemEdate(Date systemEdate) {
		this.systemEdate = systemEdate;
	}

	public String getDonVi() {
		return donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	public String getCanhBao() {
		return canhBao;
	}

	public void setCanhBao(String canhBao) {
		this.canhBao = canhBao;
	}

	public String getEffectNe() {
		return effectNe;
	}

	public void setEffectNe(String effectNe) {
		this.effectNe = effectNe;
	}

	public String getDonViAnhHuong() {
		return donViAnhHuong;
	}

	public void setDonViAnhHuong(String donViAnhHuong) {
		this.donViAnhHuong = donViAnhHuong;
	}

	public String getIdList() {
		return idList;
	}

	public String getConfirmUser() {
		return confirmUser;
	}

	public void setConfirmUser(String confirmUser) {
		this.confirmUser = confirmUser;
	}

	public String getStatusProcess() {
		return statusProcess;
	}

	public void setStatusProcess(String statusProcess) {
		this.statusProcess = statusProcess;
	}

	public Date getConfirmTime() {
		return confirmTime;
	}

	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}

	public void setIdList(String idList) {
		this.idList = idList;
	}

	private String confirmUser;
	private String statusProcess;
	private Date confirmTime;
    
	// CAP NHAT NGAY 31/07/2017
	private String capTapTrung;
	private String capTCT;
	private Date ngayCapTapTrung;
	private Date ngayCapTCT;
	private String faultID;
	
	
	public String getCapTapTrung() {
		return capTapTrung;
	}

	public void setCapTapTrung(String capTapTrung) {
		this.capTapTrung = capTapTrung;
	}

	public String getCapTCT() {
		return capTCT;
	}

	public void setCapTCT(String capTCT) {
		this.capTCT = capTCT;
	}

	public Date getNgayCapTapTrung() {
		return ngayCapTapTrung;
	}

	public void setNgayCapTapTrung(Date ngayCapTapTrung) {
		this.ngayCapTapTrung = ngayCapTapTrung;
	}

	public Date getNgayCapTCT() {
		return ngayCapTCT;
	}

	public void setNgayCapTCT(Date ngayCapTCT) {
		this.ngayCapTCT = ngayCapTCT;
	}

	public String getNgayCapTapTrungStr() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		if (ngayCapTapTrung != null)
			return df.format(ngayCapTapTrung);
		else
			return null;
	}

	public String getNgayCapTCTStr() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		if (ngayCapTCT != null)
			return df.format(ngayCapTCT);
		else
			return null;
	}

	public String getFaultID() {
		return faultID;
	}

	public void setFaultID(String faultID) {
		this.faultID = faultID;
	}

	
	
}