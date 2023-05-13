package com.springboot.app.model;

import com.springboot.app.utils.Constants;

public class ResponseModel {
	private String status = Constants. FAIL;
	private Object data;
	public String getStatus () {
	    return status;
	}
	public void setStatus (String status){
	    this.status = status;
	}
	public Object getData() {
	    return data;
	}
	public void setData(Object data) {
	    this.data = data;
	}
}