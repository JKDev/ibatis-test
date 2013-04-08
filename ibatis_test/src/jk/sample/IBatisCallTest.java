package jk.sample;

import jk.db.core.TSqlMap;
import jk.log.LogUtil;

import org.apache.log4j.Logger;

import com.ibatis.sqlmap.client.SqlMapClient;

public class IBatisCallTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		call1();
	
	}
	
	//-------------------------------------------------------------------//
	//call_test
	private static void call1() {
		Logger LOG = LogUtil.getLogger(IBatisLoaderMain.class);
		LOG.debug("logger.debug");
		try{
			LOG.info("[call1.IBatisCallTest]		");
			SqlMapClient sqlMapClient = TSqlMap.getInstance().getSqlMapClient();
			String rs = (String)sqlMapClient.queryForObject("sample.get");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
