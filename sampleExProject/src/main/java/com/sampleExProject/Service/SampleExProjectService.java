package com.sampleExProject.Service;

import java.util.List;

import com.sampleExProject.DomainCustomerData.Customer;
import com.sampleExProject.Exception.CustomerNotFoundException;

public interface SampleExProjectService {

	List<Customer> findByCustomer();

	List<Customer> findByLastName(String lastName);

	Customer findById(int id) throws CustomerNotFoundException;

	List<Customer> findByStretId(int id) throws CustomerNotFoundException;

	List<Customer> findByStoreAndStreed(int streedId, String storeName) throws CustomerNotFoundException;

	void crete(Customer customer);

	void delete(int id);

	Customer update(Customer customer);
}
