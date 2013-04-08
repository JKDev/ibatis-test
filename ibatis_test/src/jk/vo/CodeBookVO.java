package jk.vo;

import java.io.Serializable;


//
public class CodeBookVO implements Serializable {
	
	// Id
	public int getId() {
		return id;
	}
	// Id
	public void setId(int id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOrd() {
		return ord;
	}
	public void setOrd(int ord) {
		this.ord = ord;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCreateDt() {
		return createDt;
	}
	public void setCreateDt(String createDt) {
		this.createDt = createDt;
	}
	public String getDeleteDt() {
		return deleteDt;
	}
	public void setDeleteDt(String deleteDt) {
		this.deleteDt = deleteDt;
	}
	
	public String getInfo(){
		return  "" + id + type + code + name + ord + description + createDt + deleteDt;
	}
	
	private int id;
	private int type;
	private String code;
	private String name;
	private Integer ord;
	private String description;		// description
	private String desc;			// desc
	//
	private String createDt;
	private String deleteDt;
	
	

	
}
