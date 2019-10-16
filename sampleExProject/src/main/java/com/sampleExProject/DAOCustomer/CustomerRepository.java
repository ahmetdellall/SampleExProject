package com.sampleExProject.DAOCustomer;

import java.util.List;

import com.sampleExProject.DomainCustomerData.Customer;

public interface CustomerRepository {

	List<Customer> findByCustomer();

	List<Customer> findByLastName(String lastName);

	Customer findById(int id);

	List<Customer> findByStretId(int id);

	List<Customer> findByStoreAndStreed(int streedId, String customerName);

	void crete(Customer customer);

	void delete(int id);

	Customer update(Customer customer);
}
