package vo.bts;

import java.io.Serializable;

public class BtsMetro implements Serializable {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column BTS_METRO_TEST.ID
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    private Integer id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column BTS_METRO_TEST.TEN_TRAM
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    private String tenTram;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column BTS_METRO_TEST.LOAI_TRAM
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    private String loaiTram;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table BTS_METRO_TEST
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column BTS_METRO_TEST.ID
     *
     * @return the value of BTS_METRO_TEST.ID
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column BTS_METRO_TEST.ID
     *
     * @param id the value for BTS_METRO_TEST.ID
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column BTS_METRO_TEST.TEN_TRAM
     *
     * @return the value of BTS_METRO_TEST.TEN_TRAM
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    public String getTenTram() {
        return tenTram;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column BTS_METRO_TEST.TEN_TRAM
     *
     * @param tenTram the value for BTS_METRO_TEST.TEN_TRAM
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    public void setTenTram(String tenTram) {
        this.tenTram = tenTram;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column BTS_METRO_TEST.LOAI_TRAM
     *
     * @return the value of BTS_METRO_TEST.LOAI_TRAM
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    public String getLoaiTram() {
        return loaiTram;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column BTS_METRO_TEST.LOAI_TRAM
     *
     * @param loaiTram the value for BTS_METRO_TEST.LOAI_TRAM
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    public void setLoaiTram(String loaiTram) {
        this.loaiTram = loaiTram;
    }
}