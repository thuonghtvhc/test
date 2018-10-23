package dao.bts;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

//import vo.bts.BTS_TEST_SqlMap;
import vo.bts.Bts_test;

public class Bts_testDAOImpl extends SqlMapClientDaoSupport implements Bts_testDAO {
	
	@Autowired
	//BTS_TEST_SqlMap bts_test_sqlmap;
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table BTS_TEST
     *
     * @ibatorgenerated Fri Sep 14 15:10:23 ICT 2018
     */
    public Bts_testDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table BTS_TEST
     *
     * @ibatorgenerated Fri Sep 14 15:10:23 ICT 2018
     */
    public void insert(Bts_test record) {
        getSqlMapClientTemplate().insert("BTS_TEST.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table BTS_TEST
     *
     * @ibatorgenerated Fri Sep 14 15:10:23 ICT 2018
     */
    public void insertSelective(Bts_test record) {
        getSqlMapClientTemplate().insert("BTS_TEST.ibatorgenerated_insertSelective", record);
    }

	@Override
	public List<Bts_test> selectAll() {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>(); 
		map.put("p_DATA", null);
		
		return getSqlMapClientTemplate().queryForList("BTS_TEST.getBTSList", map);
	
	}
	
	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		
		Bts_test bt = new Bts_test();
		bt.setId(id);
		int rows = getSqlMapClientTemplate().delete("BTS_TEST.ibatorgenerated_delete", bt);
		return rows;
	
	}

	@Override
	public Bts_test getBTS(Integer id) {
		// TODO Auto-generated method stub
	
		Map<String, Object> map = new HashMap<String, Object>(); 
		map.put("P_ID", id);
		map.put("p_DATA", null);
		return (Bts_test) getSqlMapClientTemplate().queryForObject("BTS_TEST.getOneBTS", map);
	}

	@Override
	public int editBTS(Bts_test bts) {
		// TODO Auto-generated method stub
		int row = getSqlMapClientTemplate().update("BTS_TEST.ibatorgenerated_updateBts_Test", bts);
		return row;
	}

	@Override
	public int addBTS(Bts_test bts) {
		// TODO Auto-generated method stub
		int row = getSqlMapClientTemplate().update("BTS_TEST.ibatorgenerated_insert", bts);
		return row;
	
	}
}