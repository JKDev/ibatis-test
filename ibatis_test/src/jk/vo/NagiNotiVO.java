package jk.vo;

import java.io.Serializable;
import java.util.List;

public class NagiNotiVO extends BaseVO {

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public int getAnalysisId() {
		return analysisId;
	}
	public void setAnalysisId(int analysisId) {
		this.analysisId = analysisId;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
	private int id;
	private int serviceId;
	private int analysisId;
	private int level;
	
	private List resourceList;

	public List getResourceList() {
		return resourceList;
	}
	public void setResourceList(List resourceList) {
		this.resourceList = resourceList;
	}
}
