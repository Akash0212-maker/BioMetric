package com.bio.model;

public class Response {

	
	public Response(String status) {
		this.status=status;
	}
	
	
	public Response(Request request) {
		super();
		this.request = request;
	}


	private String status;
	
	private Request request;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public Request getRequest() {
		return request;
	}


	public void setRequest(Request request) {
		this.request = request;
	}
	
	
	
	
}
