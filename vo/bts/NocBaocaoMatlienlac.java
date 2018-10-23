package vo.bts;

public class NocBaocaoMatlienlac {
	private String region;//TTML
	private String groups;//Đài VT
	private String tiLe;//Tỷ lệ ƯCTT đúng hạn
	private String tongTgtb;//Thời gian MLL Tb/trạm
	private String tongTgtb4g;//Thời gian MLL Tb/1 trạm 4G
	private String soTram4g;//Số trạm 4G MLL
	private String tongTgtb3g;//Thời gian MLL Tb/1 trạm 3G
	private String soTram3g;//Số trạm 3G MLL
	private String tongTgtb2g;//Thời gian MLL Tb/1 trạm 2G
	private String soTram2g;//Số trạm 2G MLL
	public String getSoTramPower() {
		return soTramPower;
	}
	public void setSoTramPower(String soTramPower) {
		this.soTramPower = soTramPower;
	}
	public String getSoTramTrans() {
		return soTramTrans;
	}
	public void setSoTramTrans(String soTramTrans) {
		this.soTramTrans = soTramTrans;
	}
	public String getSoTramService() {
		return soTramService;
	}
	public void setSoTramService(String soTramService) {
		this.soTramService = soTramService;
	}
	private String province;
	private String soTramPower;
	private String soTramTrans;
	private String soTramService;
	public NocBaocaoMatlienlac() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NocBaocaoMatlienlac(String region, String groups, String tiLe, String tongTgtb, String tongTgtb4g,
			String soTram4g, String tongTgtb3g, String soTram3g, String tongTgtb2g, String soTram2g) {
		super();
		this.region = region;
		this.groups = groups;
		this.tiLe = tiLe;
		this.tongTgtb = tongTgtb;
		this.tongTgtb4g = tongTgtb4g;
		this.soTram4g = soTram4g;
		this.tongTgtb3g = tongTgtb3g;
		this.soTram3g = soTram3g;
		this.tongTgtb2g = tongTgtb2g;
		this.soTram2g = soTram2g;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getGroups() {
		return groups;
	}
	public void setGroups(String groups) {
		this.groups = groups;
	}
	public String getTiLe() {
		return tiLe;
	}
	public void setTiLe(String tiLe) {
		this.tiLe = tiLe;
	}
	public String getTongTgtb() {
		return tongTgtb;
	}
	public void setTongTgtb(String tongTgtb) {
		this.tongTgtb = tongTgtb;
	}
	public String getTongTgtb4g() {
		return tongTgtb4g;
	}
	public void setTongTgtb4g(String tongTgtb4g) {
		this.tongTgtb4g = tongTgtb4g;
	}
	public String getSoTram4g() {
		return soTram4g;
	}
	public void setSoTram4g(String soTram4g) {
		this.soTram4g = soTram4g;
	}
	public String getTongTgtb3g() {
		return tongTgtb3g;
	}
	public void setTongTgtb3g(String tongTgtb3g) {
		this.tongTgtb3g = tongTgtb3g;
	}
	public String getSoTram3g() {
		return soTram3g;
	}
	public void setSoTram3g(String soTram3g) {
		this.soTram3g = soTram3g;
	}
	public String getTongTgtb2g() {
		return tongTgtb2g;
	}
	public void setTongTgtb2g(String tongTgtb2g) {
		this.tongTgtb2g = tongTgtb2g;
	}
	public String getSoTram2g() {
		return soTram2g;
	}
	public void setSoTram2g(String soTram2g) {
		this.soTram2g = soTram2g;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	

}
