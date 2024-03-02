package org.jsp.onetoone_uni.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity
public class Person {
//	@Id
	private int personID;
	private String personName;
	private int age;
	private long mobileNo;

	@OneToOne(cascade = CascadeType.ALL)
	Passport passport;

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Person [personID=" + personID + ", personName=" + personName + ", age=" + age + ", mobileNo=" + mobileNo
				+ ", passport=" + passport + "]";
	}

}
