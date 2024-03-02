package org.jsp.onetoone_uni_assignment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetoone_uni_assignment.dto.Customer;
import org.jsp.onetoone_uni_assignment.dto.Customer_Transaction;

public class CustomerTxnDao {

	public void SaveCustomer(Customer customer) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(customer);
		manager.getTransaction().commit();

	}

	public void saveTransaction(Customer_Transaction txn) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(txn);
		transaction.commit();

	}

	public void removeTransaction() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.remove(manager.find(Customer_Transaction.class, 5002));
		transaction.commit();
	}

	public void removeCustomer() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.remove(manager.find(Customer.class, 101));
		transaction.commit();
	}
}
