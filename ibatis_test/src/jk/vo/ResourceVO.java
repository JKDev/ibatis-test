package jk.vo;

public class ResourceVO {
	
	public int getResourceId() {
		return resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getResultColName() {
		return resultColName;
	}
	public void setResultColName(String resultColName) {
		this.resultColName = resultColName;
	}
	
	private int resourceId;
	private String name;
	private String codeName;
	private String tableName;
	private String resultColName;

}
