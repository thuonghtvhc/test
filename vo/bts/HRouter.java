package vo.bts;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class HRouter implements Serializable {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_ROUTER.ID
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    private Integer id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_ROUTER.ROUTER_ID
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    @NotEmpty
    @NotNull
    private String routerId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_ROUTER.ROUTER_NAME
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    @NotEmpty
    @NotNull
    private String routerName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_ROUTER.DEVICE_TYPE
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    private String deviceType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_ROUTER.FUNCTION
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    private String function;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column H_ROUTER.OAM
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    private String oam;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table H_ROUTER
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_ROUTER.ID
     *
     * @return the value of H_ROUTER.ID
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_ROUTER.ID
     *
     * @param id the value for H_ROUTER.ID
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_ROUTER.ROUTER_ID
     *
     * @return the value of H_ROUTER.ROUTER_ID
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    public String getRouterId() {
        return routerId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_ROUTER.ROUTER_ID
     *
     * @param routerId the value for H_ROUTER.ROUTER_ID
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_ROUTER.ROUTER_NAME
     *
     * @return the value of H_ROUTER.ROUTER_NAME
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    public String getRouterName() {
        return routerName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_ROUTER.ROUTER_NAME
     *
     * @param routerName the value for H_ROUTER.ROUTER_NAME
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    public void setRouterName(String routerName) {
        this.routerName = routerName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_ROUTER.DEVICE_TYPE
     *
     * @return the value of H_ROUTER.DEVICE_TYPE
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_ROUTER.DEVICE_TYPE
     *
     * @param deviceType the value for H_ROUTER.DEVICE_TYPE
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_ROUTER.FUNCTION
     *
     * @return the value of H_ROUTER.FUNCTION
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    public String getFunction() {
        return function;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_ROUTER.FUNCTION
     *
     * @param function the value for H_ROUTER.FUNCTION
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    public void setFunction(String function) {
        this.function = function;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column H_ROUTER.OAM
     *
     * @return the value of H_ROUTER.OAM
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    public String getOam() {
        return oam;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column H_ROUTER.OAM
     *
     * @param oam the value for H_ROUTER.OAM
     *
     * @ibatorgenerated Mon Feb 04 09:35:03 ICT 2013
     */
    public void setOam(String oam) {
        this.oam = oam;
    }
}