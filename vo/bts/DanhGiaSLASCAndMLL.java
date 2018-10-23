package vo.bts;

public class DanhGiaSLASCAndMLL {
	private String donvi;
	private String scNghiemtrong;
	private String scNghiemtrongDunghan;
	private String sovoiHomtruoc;
	private String scLonDunghan;
	private String tyleDunghan;
	private String scLon;
	public String getDonvi() {
		return donvi;
	}
	public void setDonvi(String donvi) {
		this.donvi = donvi;
	}
	public String getScNghiemtrong() {
		return scNghiemtrong;
	}
	public void setScNghiemtrong(String scNghiemtrong) {
		this.scNghiemtrong = scNghiemtrong;
	}
	public String getScNghiemtrongDunghan() {
		return scNghiemtrongDunghan;
	}
	public void setScNghiemtrongDunghan(String scNghiemtrongDunghan) {
		this.scNghiemtrongDunghan = scNghiemtrongDunghan;
	}
	public String getSovoiHomtruoc() {
		return sovoiHomtruoc;
	}
	public void setSovoiHomtruoc(String sovoiHomtruoc) {
		this.sovoiHomtruoc = sovoiHomtruoc;
	}
	public String getScLonDunghan() {
		return scLonDunghan;
	}
	public void setScLonDunghan(String scLonDunghan) {
		this.scLonDunghan = scLonDunghan;
	}
	public String getTyleDunghan() {
		return tyleDunghan;
	}
	public void setTyleDunghan(String tyleDunghan) {
		this.tyleDunghan = tyleDunghan;
	}
	public String getScLon() {
		return scLon;
	}
	public void setScLon(String scLon) {
		this.scLon = scLon;
	}
	
	public DanhGiaSLASCAndMLL() {
		
	}
	
	public DanhGiaSLASCAndMLL(String donvi, String scNghiemtrong, String scNghiemtrongDunghan, String sovoiHomtruoc,
			String scLonDunghan, String tyleDunghan, String scLon) {
		super();
		this.donvi = donvi;
		this.scNghiemtrong = scNghiemtrong;
		this.scNghiemtrongDunghan = scNghiemtrongDunghan;
		this.sovoiHomtruoc = sovoiHomtruoc;
		this.scLonDunghan = scLonDunghan;
		this.tyleDunghan = tyleDunghan;
		this.scLon = scLon;
	}
	
	
}
