/**
 * ibatis test 
 * 
 */

package jk.db.core;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class TSqlMap {
	
	private static TSqlMap instance;
	private Reader reader = null;
	private SqlMapClient client = null;
	
	protected TSqlMap(){
		onInit();
	}
	
	private void onInit() {
		String resource = "conf/sqlMapConfig.xml";
		try{
			reader = Resources.getResourceAsReader(resource);
			client = SqlMapClientBuilder.buildSqlMapClient(reader);
			System.out.println("client=" + client);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public SqlMapClient getSqlMapClient(){
		return client;
	}

	public static TSqlMap getInstance(){
		if(instance == null){
			instance = new TSqlMap();
		}
		return instance;
	}
	
	

}
