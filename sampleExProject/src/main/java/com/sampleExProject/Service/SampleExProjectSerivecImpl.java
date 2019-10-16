package com.sampleExProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sampleExProject.DAOCustomer.CustomerRepository;
import com.sampleExProject.DomainCustomerData.Customer;
import com.sampleExProject.Exception.CustomerNotFoundException;
@Service //bu anotasyon ilgili sınıftan birtane bean yaratmasını sağlayacak 
@Transactional  //bu anotasyon ile bu sınıfa ait beanin bütün public metodları transactional olacak ...
public class SampleExProjectSerivecImpl implements SampleExProjectService {

	private CustomerRepository customerRepository;
	
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> findByCustomer() {
		return customerRepository.findByCustomer();
	}

	@Override
	public List<Customer> findByLastName(String lastName) {
		return customerRepository.findByLastName(lastName);
	}

	@Override
	public Customer findById(int id) throws CustomerNotFoundException {
		Customer customer = customerRepository.findById(id);
		if (customer == null) throw new CustomerNotFoundException("Customer Not Found");
		return customerRepository.findById(id);
	}

	@Override
	public List<Customer> findByStretId(int id) throws CustomerNotFoundException {
		List<Customer> customers = customerRepository.findByStretId(id);
		if (customers.size() == 0) throw new CustomerNotFoundException("\r\n" + 
				"no customers found at such address ");
		return customers;
	}

	@Override
	public List<Customer> findByStoreAndStreed(int streedId, String storeName) throws CustomerNotFoundException {
		List<Customer> customer =customerRepository.findByStoreAndStreed(streedId, storeName);
		if(customer ==null) throw new CustomerNotFoundException("Customer Not Found");
		return customerRepository.findByStoreAndStreed(streedId, storeName);
	}

	@Override
	public void crete(Customer customer) {
		customerRepository.crete(customer);
		
	}

	@Override
	public void delete(int id) {
		customerRepository.delete(id);
	}

	@Override
	public Customer update(Customer customer) {
		return customerRepository.update(customer);
	}

}
