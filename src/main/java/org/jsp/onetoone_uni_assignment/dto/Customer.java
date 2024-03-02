package org.jsp.onetoone_uni_assignment.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	private int customerId;
	private String customerName;
	@OneToOne(cascade = CascadeType.ALL)
	private Customer_Transaction transaction;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Customer_Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Customer_Transaction transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", transaction=" + transaction
				+ "]";
	}

}
