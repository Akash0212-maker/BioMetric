package com.bio.model;

import java.util.ArrayList;
import java.util.List;

public class Request {
	
	private String dvcSrNo;
	private String dvcTime;
	private List<Transactions> trans=new ArrayList();
	
	
	public List<Transactions> getTrans() {
		return trans;
	}
	public void setTrans(List<Transactions> trans) {
		this.trans = trans;
	}
	public String getDvcSrNo() {
		return dvcSrNo;
	}
	public void setDvcSrNo(String dvcSrNo) {
		this.dvcSrNo = dvcSrNo;
	}
	public String getDvcTime() {
		return dvcTime;
	}
	public void setDvcTime(String dvcTime) {
		this.dvcTime = dvcTime;
	}
	
	
	

}
