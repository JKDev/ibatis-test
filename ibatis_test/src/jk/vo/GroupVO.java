package jk.vo;

import java.io.Serializable;

public class GroupVO implements Serializable{

	public BasicVO getVo() {
		return vo;
	}
	public void setVo(BasicVO vo) {
		this.vo = vo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColum() {
		return colum;
	}
	public void setColum(String colum) {
		this.colum = colum;
	}
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	
	private BasicVO vo;
	private String name;
	private String colum;
	private String table;

}
