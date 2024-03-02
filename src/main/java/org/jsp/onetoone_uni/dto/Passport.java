package org.jsp.onetoone_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity

public class Passport {
//	@Id
	private int passportID;
	private String Country;
	private String date_of_issue;

	public int getPassportID() {
		return passportID;
	}

	public void setPassportID(int passportID) {
		this.passportID = passportID;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getDate_of_issue() {
		return date_of_issue;
	}

	public void setDate_of_issue(String date_of_issue) {
		this.date_of_issue = date_of_issue;
	}

	@Override
	public String toString() {
		return "Passport [passportID=" + passportID + ", Country=" + Country + ", date_of_issue=" + date_of_issue + "]";
	}

}
