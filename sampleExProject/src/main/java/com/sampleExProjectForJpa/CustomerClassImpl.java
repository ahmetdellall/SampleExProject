package com.sampleExProjectForJpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.sampleExProject.DAOCustomer.CustomerRepository;
import com.sampleExProject.DomainCustomerData.Customer;

@Repository("customerRepository")
public class CustomerClassImpl  implements CustomerRepository{

	@PersistenceContext //bu anotasyonla spring continerin run timeda yönettiği transaction(tx) entity manager instancenin buraya enjecte edilmesini sapladık
	EntityManager entityManager;
	
	
	@Override
	public List<Customer> findByCustomer() {
		
		return entityManager.createQuery("from customer", Customer.class).getResultList();
	}

	@Override
	public List<Customer> findByLastName(String lastName) {
		
		return entityManager.createQuery("from customer where last_name= :lastName",Customer.class).setParameter("lastName",lastName).getResultList();
	}

	@Override
	public Customer findById(int id) {
	
		return entityManager.find(Customer.class, id);
	}

	@Override
	public List<Customer> findByStretId(int id) {

		return entityManager.createQuery("from customer where address_id = :id").setParameter("address_id",id).getResultList();
	}

	@Override
	public List<Customer> findByStoreAndStreed(int streedId, String customerName) {
		String query = "select c from customer c where c.addressId = :streedId and c.firstName = :customerName";
		return entityManager.createQuery(query).setParameter("address_id", streedId).setParameter("firstName", customerName).getResultList();
	}

	@Override
	public void crete(Customer customer) {
		entityManager.persist(customer);
		
	}

	@Override
	public void delete(int id) {
		entityManager.remove(entityManager.getReference(Customer.class, id));
	}

	@Override
	public Customer update(Customer customer) {
		
		return entityManager.merge(customer);
	}

}
