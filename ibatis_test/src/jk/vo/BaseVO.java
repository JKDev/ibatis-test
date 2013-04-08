package jk.vo;

import java.io.Serializable;

public class BaseVO implements Serializable {

	public String getCreateDt() {
		return createDt;
	}
	public void setCreateDt(String createDt) {
		this.createDt = createDt;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	private String createDt;
	private String msg;
	
}
