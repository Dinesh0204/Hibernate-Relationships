package org.jsp.onetoone_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import org.jsp.onetoone_uni.dto.Passport;
import javax.persistence.Persistence;

import org.jsp.onetoone_uni.dto.Person;

import java.util.List;
import java.util.ListIterator;

import javax.persistence.*;

public class Person_Passport_Dao {

	// savePersonDetails
	// savePassportDetails

	public void savePerson(Person person) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(person);
		transaction.commit();

	}

	public void savePassport(Passport passport) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(passport);
		transaction.commit();
	}

	public void updatePerson(Person person, int dataID, Passport passport) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager emanager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = emanager.getTransaction();
		transaction.begin();
		Person dataFetch = emanager.find(Person.class, dataID);
		System.out.println(person);
		dataFetch.setPassport(passport);
		emanager.merge(dataFetch);
		System.out.println(person);
		transaction.commit();
	}

	public void updatePassPort(Passport pass) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(pass);
		System.out.println("Passport Table Updated");
		transaction.commit();

	}

	public void findPersonById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = entityManagerFactory.createEntityManager();
		Person obj = manager.find(Person.class, id);
		if (obj != null) {
			System.out.println(obj);
		} else {
			System.out.println("Person Details with " + id + " Not Found");
		}

	}

	public void findPassportById(int id) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = managerFactory.createEntityManager();
		Passport pass = manager.find(Passport.class, id);
		if (pass != null) {
			System.out.println(pass);
		} else {
			System.out.println("Passprot Details with " + id + " Not Found ");
		}
	}

	public void deletePerson(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Person person = entityManager.find(Person.class, id);
		entityManager.remove(person);
		System.out.println("Removed Person " + person);
		transaction.commit();
	}

	public void deletePassportById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Passport passportObj = manager.find(Passport.class, id);
		System.out.println(passportObj);
		manager.remove(passportObj);
		transaction.commit();

	}

	public void fetchAllData() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query q = entityManager.createQuery("SELECT DATA FROM Person DATA");
		List<Person> person = q.getResultList();
		ListIterator list = person.listIterator();
		while (list.hasNext()) {
			System.out.println(list.next());
		}
	}

	public void fetchPassportData() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = entityManagerFactory.createEntityManager();
		Query query = manager.createQuery("SELECT DATA FROM Passport DATA");
		List<Passport> data = query.getResultList();
		ListIterator list = data.listIterator();
		while (list.hasNext()) {
			System.out.println(list.next());
		}
	}
}
