package jk.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import jk.db.core.TSqlMap;
import jk.vo.CodeBookVO;
import jk.vo.NagiNotiVO;

public class IBatisTestCall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testCall1();
		testCall2();
		
		//test();
	}

	
	// Object 정보구성 
	private static void test() {
	  HashMap test = new HashMap();
	  test.put("k1", "001");
	  test.put("k2", "001");
	  test.put("k3", "001");
	  List list = new ArrayList();
	  list.add("t1");
	  list.add("t1");
	  list.add("t1");
	  test.put("list", list);
	  test.toString();
	  System.out.println(test);
	}

	private static void testCall2() {
		// TODO Auto-generated method stub
		SqlMapClient sqlMap = TSqlMap.getInstance().getSqlMapClient();
		try{
			NagiNotiVO nagiVO = new NagiNotiVO();
			nagiVO.setId(12190);
			List<NagiNotiVO> list = sqlMap.queryForList("sample.getNagiNotiList", nagiVO);
			
			NagiNotiVO temp = new NagiNotiVO();
			for(int i=0;i<list.size();++i){
				temp = list.get(i);
				System.out.println(temp);
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	// - debug 여부 
	// sql - 
	//codeBook
	private static void testCall1() {
		System.out.println("===========testCall1() begin ===================================");
		SqlMapClient client = TSqlMap.getInstance().getSqlMapClient();
		CodeBookVO vo = new CodeBookVO();
		CodeBookVO tempVO = null;
		try{
			vo.setId(new Integer(100));
			vo.setCode("1234");
			vo.setDescription("[Description]");
			
			//tempVO = (CodeBookVO)client.queryForObject("sample.setCodeBook", vo);
			//System.out.println(" Description=" + tempVO.getDescription() + " code=" + tempVO.getCode());
			//String id = tempVO.getId();
			//System.out.println("	id=" + id);
			
			
			List<CodeBookVO> list = client.queryForList("sample.codeList", vo);
			
			// 
			CodeBookVO bookVO = null;
			int len = list.size();
			for(int i=0;i<len;++i){
				bookVO = (CodeBookVO)list.get(i);
				System.out.println("[CodeBookVO]result=" + bookVO.getInfo());
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("===========testCall1() end ===================================");
	}

}
