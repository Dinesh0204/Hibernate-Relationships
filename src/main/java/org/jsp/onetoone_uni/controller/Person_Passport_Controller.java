package org.jsp.onetoone_uni.controller;

import org.jsp.onetoone_uni.dto.Person;
import org.jsp.onetoone_uni.dao.Person_Passport_Dao;
import org.jsp.onetoone_uni.dto.Passport;

public class Person_Passport_Controller {

	public static void main(String[] args) {
// Creating Person and Passport Object simultaneously
//
//		Person person = new Person();
//		person.setPersonID(102);
//		person.setPersonName("Mary");
//		person.setAge(42);
//		person.setMobileNo(9897896540L);
//		Passport passport = new Passport();
//		passport.setPassportID(1003);
//		passport.setCountry("India");
//		passport.setDate_of_issue("02-02-2023");
//		person.setPassport(passport);
//		Person_Passport_Dao personPassportDao = new Person_Passport_Dao();
//		personPassportDao.savePerson(person);

//		Creating Passport Entries passportObj

//		Passport passportObj = new Passport();
//		passportObj.setPassportID(1003);
//		passportObj.setCountry("NewZealand");
//		passportObj.setDate_of_issue("02-01-2024");
//		Person_Passport_Dao daoObj = new Person_Passport_Dao();
//		daoObj.savePassport(passportObj);

//		Inserting person details without PassPort Object 
//		Person obj2 = new Person();
//		obj2.setPersonID(102);
//		obj2.setPersonName("Zumba");
//		obj2.setAge(23);
//		obj2.setMobileNo(897898564L);
//		Now if we want to update the details where passport id is kept null we can achieve using merge method
		/*
		 * create one method which accepts ClassName ,Primary key data,value to be
		 * updated inside update method first find out the details by passsing primary
		 * key id and fetch the records of that passed data ( primary key) Now whatever
		 * the object has been came update that objects passport value and called the
		 * merge method
		 * 
		 */
//		Person_Passport_Dao DaoObj = new Person_Passport_Dao();
//		DaoObj.savePerson(obj2);

//		Passport passPortObj = new Passport();
//		passPortObj.setPassportID(1002);
//		passPortObj.setCountry("Delhi");
//		passPortObj.setDate_of_issue("05-01-2024");
//		obj2.setPassport(passPortObj);
//		DaoObj.updatePerson(obj2, 102, passPortObj);

//		Update Passport table

//		Person_Passport_Dao updatePassObj = new Person_Passport_Dao();
//		Passport pass = new Passport();
//		pass.setPassportID(1002);
//		pass.setCountry("India");
//		pass.setDate_of_issue("03-02-2024");
//		updatePassObj.updatePassPort(pass);

//		Find Person By ID
//		Person_Passport_Dao findPersonObj = new Person_Passport_Dao();
//		findPersonObj.findPersonById(101);

//		Find Passport By ID
//		Person_Passport_Dao findPassportObj = new Person_Passport_Dao();
//		findPassportObj.findPassportById(1001);

//		DELETE PERSON OBJECT
		Person_Passport_Dao delPersonDao = new Person_Passport_Dao();
//		delPersonDao.savePerson(obj2);
//		System.out.println(obj2);
		delPersonDao.deletePerson(102);

//		Delete Passport Object
//		Person_Passport_Dao passDelObj = new Person_Passport_Dao();
//		passDelObj.deletePassportById(1002);
//
//		Fetch  Person Table

//		Person_Passport_Dao fetchObjPerson = new Person_Passport_Dao();
//		fetchObjPerson.fetchAllData();

//		Fetch Passport Table
//		Person_Passport_Dao fetchPassObj = new Person_Passport_Dao();
//		fetchObjPerson.fetchPassportData();

	}

}
