package jk.sample;

import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import jk.db.core.TSqlMap;
import jk.log.LogUtil;
import jk.vo.DeptVO;
import jk.vo.EmpVO;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class IBatisLoaderMain {

	
	private static Logger LOG = LogUtil.getLogger(IBatisLoaderMain.class);
	//private static Logger LOG = Logger.getLogger(IBatisLoaderMain.class);
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		LOG.debug("logger.debug");
		try{
			LOG.info("info <--- ");
			SqlMapClient sqlMapClient = TSqlMap.getInstance().getSqlMapClient();
			//System.out.println("sqlMapClient:" + sqlMapClient);
			
			String rs = (String)sqlMapClient.queryForObject("sample.day");
			//System.out.println(rs);
			
			LOG.info("++++++++++++++=" + rs);
			
			getListEmp();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		LOG.info("logger.debug");
	}
	
	
	private static void getListEmp() {
		LOG.debug("getListEmp() begin--------------------");
		
		SqlMapClient sqlMapClient = TSqlMap.getInstance().getSqlMapClient();
		
		try {
			// 
			EmpVO vo = new EmpVO();
			List<EmpVO> list = sqlMapClient.queryForList( "basic.getEmpList",  vo);
			List<DeptVO> deptList = null;
			for(int i=0;i<list.size();++i){
				//LOG.debug("["+i+"] ename:" +  list.get(i).getEname() );
				deptList = list.get(i).getDeptList();
				
				for(int j=0; j<deptList.size(); ++j){
					LOG.debug("++++++++++> " + " id:" +deptList.get(j).getId() +" dName:" + deptList.get(j).getDname());
				}
				
				for(int j=0; j<list.get(i).getDeptOtherList().size(); ++j){
					LOG.debug("++++++++++>Ohter " + " id:" +list.get(i).getDeptOtherList().get(j).getId() +" dName:" + list.get(i).getDeptOtherList().get(j).getDname());
				}
				//LOG.debug( " ++++++++ DEPTNO:" + list.get(i).getDeptno() );
			}
			
			/*
			List<DeptVO> listDept = sqlMapClient.queryForList("basic.getDeptList");
			
			// commonVO 고려 해야 됨
			for(int i=0;i<listDept.size();++i){
				LOG.debug("["+i+"]" +  listDept.get(i).getId() );
				
			}
			*/
			
			
			//LOG.debug( "empVo=" + listDept.size() );
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		LOG.debug("getListEmp() end--------------------");
		
	}

}
