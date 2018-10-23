package vo.bts;

import java.util.Date;

public class NocReportLenhTacDong {
	
	private Date day;
	private Integer month;
	private Integer week;
	private Integer year;
	
	private String maPhong;
	private String heThong;
	private String neType;
	
	private Integer slDuyet;
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getHeThong() {
		return heThong;
	}
	public void setHeThong(String heThong) {
		this.heThong = heThong;
	}
	public Integer getSlDuyet() {
		return slDuyet;
	}
	public void setSlDuyet(Integer slDuyet) {
		this.slDuyet = slDuyet;
	}
	public Integer getSlKhongDuyet() {
		return slKhongDuyet;
	}
	public void setSlKhongDuyet(Integer slKhongDuyet) {
		this.slKhongDuyet = slKhongDuyet;
	}
	public Integer getWeek() {
		return week;
	}
	public void setWeek(Integer week) {
		this.week = week;
	}
	public String getNeType() {
		return neType;
	}
	public void setNeType(String neType) {
		this.neType = neType;
	}
	private Integer slKhongDuyet;

}
