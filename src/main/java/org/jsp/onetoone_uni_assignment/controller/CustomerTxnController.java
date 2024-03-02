package org.jsp.onetoone_uni_assignment.controller;

import javax.transaction.Transaction;

import org.jsp.onetoone_uni_assignment.dao.CustomerTxnDao;
import org.jsp.onetoone_uni_assignment.dto.Customer;
import org.jsp.onetoone_uni_assignment.dto.Customer_Transaction;

public class CustomerTxnController {

	public static void main(String[] args) {
		/*
		 * Case 1 : We are Saving Customer Object as We have defined @OneToOne from
		 * Customer Side and as we set Cascade=CascadeType.ALL so adding Customer Object
		 * in Customer table first persist data in associated Entities
		 * 
		 * 
		 */
//		Customer customer1 = new Customer();
//		customer1.setCustomerId(101);
//		customer1.setCustomerName("Alex");
//		Customer_Transaction transaction = new Customer_Transaction();
//		transaction.setTxnId(5001);
//		transaction.setUpiProvider("Gpay");
//		customer1.setTransaction(transaction);
//		CustomerTxnDao daoObj = new CustomerTxnDao();
//		daoObj.SaveCustomer(customer1);

		/*
		 * Case 2 : AS We Have Try TO Save Transaction Object and As
		 * Customer_transaction doesnt kknow about the other entity as we have not done
		 * mapping from Customer_Transaction so any Insertion on Customer_transaction
		 * doest insert the record in Customer Tab;e
		 * 
		 * 
		 */
//		Customer_Transaction txn1 = new Customer_Transaction();
//		txn1.setTxnId(5002);
//		txn1.setUpiProvider("PhonePe");
//		CustomerTxnDao txnObj = new CustomerTxnDao();
//		txnObj.saveTransaction(txn1);

//	
		/*
		 * Case 3 : If We Try TO delete Row From Associated Entity i.e.
		 * Customer_Transaction Records will not deleted Cause it will throw exception
		 * that canntoupdate parent row
		 * 
		 * If There are no mapping present for that particular Txn in Customer Table We
		 * can easily delete records from Transaction i.e. from associated Entity
		 */

//		new CustomerTxnDao().removeTransaction();

		/*
		 * Case 4 : If We Try To delete row from Entity Where we set @OneToOne Mapping
		 * from that side only we are able to perform Delete Operation
		 * 
		 */

//		CustomerTxnDao removeCustomerObj = new CustomerTxnDao();
//		removeCustomerObj.removeCustomer();

		/*
		 * Case 5 : Customer Does Not Have Transaction Object i.e We are not setting
		 * Trnasaction Object as Null
		 * 
		 */
//		Customer customer3 = new Customer();
//		customer3.setCustomerId(4);
//		customer3.setCustomerName("Maria");
//		customer3.setTransaction(null);
//		CustomerTxnDao daoObj = new CustomerTxnDao();
//		daoObj.SaveCustomer(customer3);

	}

}
