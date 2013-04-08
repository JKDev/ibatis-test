package jk.sample.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ibatis.sqlmap.client.SqlMapClient;

import jk.db.core.TSqlMap;
import jk.log.LogUtil;

public class SqlTest {
	
	private static Logger LOG = LogUtil.getLogger(SqlTest.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callSql();
	}

	// * 적용가능하다.
	private static void callSql() {
		LOG.debug("==============SqlTest++++++++++++++++++");
		
		SqlMapClient sqlMapClient =  TSqlMap.getInstance().getSqlMapClient();
		try{
			
			Map m = new HashMap();
			m.put( "TABLE_NAME", "DEPT" );
			
			List resultList = sqlMapClient.queryForList("basic.getDynamicList", m);
			
			Map resultMap = new HashMap();
			resultMap.put("resultList", resultList);
			
			System.out.println( resultMap );
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
