package jk.vo;

import java.io.Serializable;
import java.util.List;

public class EmpVO  implements Serializable {

	private int empno;
	private String ename;
	private String job;
	private String mgr;
	private String hiredate;
	private String sal;
	private String comm;
	private int deptno;
	private String seqName;
	
	private List<DeptVO> deptList;
	private List<DeptVO> deptOtherList;
	
	
	public String getSeqName() {
		return seqName;
	}
	public void setSeqName(String seqName) {
		this.seqName = seqName;
	}
	
	public List<DeptVO> getDeptOtherList() {
		return deptOtherList;
	}
	public void setDeptOtherList(List<DeptVO> deptOtherList) {
		this.deptOtherList = deptOtherList;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	public String getComm() {
		return comm;
	}
	public void setComm(String comm) {
		this.comm = comm;
	}
	

	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	

	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	public List<DeptVO> getDeptList() {
		return deptList;
	}
	public void setDeptList(List<DeptVO> deptList) {
		this.deptList = deptList;
	}
}
