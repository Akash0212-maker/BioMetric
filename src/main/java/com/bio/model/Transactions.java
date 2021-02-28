package com.bio.model;

public class Transactions {

	
	private String txnId;
	private String dvcId;
	private String dvcIP;
	private String punchId;
	private String txnDateTime;
	private String mode;
	
	public String getTxnId() {
		return txnId;
	}
	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}
	public String getDvcId() {
		return dvcId;
	}
	public void setDvcId(String dvcId) {
		this.dvcId = dvcId;
	}
	public String getDvcIP() {
		return dvcIP;
	}
	public void setDvcIP(String dvcIP) {
		this.dvcIP = dvcIP;
	}
	public String getPunchId() {
		return punchId;
	}
	public void setPunchId(String punchId) {
		this.punchId = punchId;
	}
	public String getTxnDateTime() {
		return txnDateTime;
	}
	public void setTxnDateTime(String txnDateTime) {
		this.txnDateTime = txnDateTime;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transactions [txnId=" + txnId + ", dvcId=" + dvcId + ", dvcIP="
				+ dvcIP + ", punchId=" + punchId + ", txnDateTime="
				+ txnDateTime + ", mode=" + mode + "]";
	}
	
	
}
