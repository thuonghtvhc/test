package dao.bts;

import java.util.List;

import vo.bts.BtsMetro;

public interface BtsMetroDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table BTS_METRO_TEST
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table BTS_METRO_TEST
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    void insert(BtsMetro record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table BTS_METRO_TEST
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    void insertSelective(BtsMetro record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table BTS_METRO_TEST
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    BtsMetro selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table BTS_METRO_TEST
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    int updateByPrimaryKeySelective(BtsMetro record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table BTS_METRO_TEST
     *
     * @ibatorgenerated Thu Sep 20 16:38:49 ICT 2018
     */
    int updateByPrimaryKey(BtsMetro record);
    
    List <BtsMetro> getALL();
}