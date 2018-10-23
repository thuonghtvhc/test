package vo.bts;

public class AlarmSLADailyReport7Day {
	private String region;
	private Float d1;
	private Float d2;
	private Float d3;
	private Float d4;
	private Float d5;
	private Float d6;
	private Float d7;
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Float getD1() {
		return d1==null?0:d1;
	}
	public void setD1(Float d1) {
		this.d1 = d1;
	}
	public Float getD2() {
		return d2==null?0:d2;
	}
	public void setD2(Float d2) {
		this.d2 = d2;
	}
	public Float getD3() {
		return d3==null?0:d3;
	}
	public void setD3(Float d3) {
		this.d3 = d3;
	}
	public Float getD4() {
		return d4==null?0:d4;
	}
	public void setD4(Float d4) {
		this.d4 = d4;
	}
	public AlarmSLADailyReport7Day(String region, Float d1, Float d2, Float d3, Float d4, Float d5, Float d6, Float d7) {
		super();
		this.region = region;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
		this.d4 = d4;
		this.d5 = d5;
		this.d6 = d6;
		this.d7 = d7;
	}
	public Float getD5() {
		return d5==null?0:d5;
	}
	public void setD5(Float d5) {
		this.d5 = d5;
	}
	public Float getD6() {
		return d6==null?0:d6;
	}
	public void setD6(Float d6) {
		this.d6 = d6;
	}
	public Float getD7() {
		return d7==null?0:d7;
	}
	public void setD7(Float d7) {
		this.d7 = d7;
	}
	public AlarmSLADailyReport7Day() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
