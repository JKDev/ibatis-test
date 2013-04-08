package jk.vo;

import java.io.Serializable;

public class BasicVO implements Serializable{

	private String data;
	
	private String code;
	
	private String innerData;
	
	private int count;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getInnerData() {
		return innerData;
	}

	public void setInnerData(String innerData) {
		this.innerData = innerData;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
