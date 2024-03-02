package org.jsp.onetoone_uni_assignment.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer_Transaction {
	@Id
	private int txnId;
	private String upiProvider;

	@Override
	public String toString() {
		return "Transaction [txnId=" + txnId + ", upiProvider=" + upiProvider + "]";
	}

	public int getTxnId() {
		return txnId;
	}

	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}

	public String getUpiProvider() {
		return upiProvider;
	}

	public void setUpiProvider(String upiProvider) {
		this.upiProvider = upiProvider;
	}

}
