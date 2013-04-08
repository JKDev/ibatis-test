package jk.sample.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import jk.db.core.TSqlMap;
import jk.vo.BasicVO;
import jk.vo.EmpVO;
import jk.vo.GroupVO;

public class InnerVOCallSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SqlMapClient sqlMapClient =  TSqlMap.getInstance().getSqlMapClient();
		
		try{
			
			GroupVO gVO = new GroupVO();
			BasicVO bVO = new BasicVO();
			bVO.setCode("EMP");
			gVO.setVo(bVO);
			
			
			List<GroupVO>list =  sqlMapClient.queryForList( "basic.getDList" , gVO);
			int len = list.size();
			GroupVO temp = null;
			for( int i=0;i<len;++i ){
				temp = list.get(i);
				System.out.println( " code:" + temp.getVo().getCode() + " data:" + temp.getVo().getData() + " InnerData:" + temp.getVo().getInnerData() );
			}
			
			
			// queryForMap
			Map mm =  sqlMapClient.queryForMap("basic.getMap", null, "ENAME");
			
			System.out.println( "mm=" + mm );
			
			Map mm2 = sqlMapClient.queryForMap("basic.getMap",null, "JOB", "ENAME");
			System.out.println( "mm2:" + mm2 );	// distinct 유사 
			
			//
			EmpVO vo = new EmpVO();
			vo.setSeqName("SEQ_EMP_EMPNO");
			vo.setEname("김아무개");
			vo.setJob("D-Job");
			vo.setMgr("Manager");
			vo.setHiredate("2011-12-22");
			vo.setSal("1000");
			vo.setComm("comm:");
			vo.setDeptno( 7839 );
			
			sqlMapClient.startTransaction();
			sqlMapClient.insert("basic.insertEmp", EmpVO.class);		// result
			
			sqlMapClient.commitTransaction();
			
		}catch(Exception ie){
			ie.printStackTrace();
		}finally{
			try {
				sqlMapClient.endTransaction();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
