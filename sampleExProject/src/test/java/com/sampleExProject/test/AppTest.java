package com.sampleExProject.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.sampleExProject.DomainCustomerData.Customer;

public class AppTest {

	RestTemplate restTemplate;
	
	@Before
	public void setUp() {
		restTemplate = new RestTemplate();
	}
	
	@Test
	public void findByIdTest() {
		
			ResponseEntity<Customer> cResponseEntity=restTemplate.getForEntity("http://localhost:8080/rest/customer/2", Customer.class);
		
			MatcherAssert.assertThat(cResponseEntity.getStatusCode(), Matchers.equalTo(200));
			MatcherAssert.assertThat(cResponseEntity.getBody().getFirstName(),Matchers.equalTo("PATRICIA"));

	}
	
	@Test
	public void createCustomerTest() {
		

		
		Customer customer = new Customer();
		customer.setActive(true);
		customer.setAddressId(100);
		customer.setCustomerID(100);
		customer.setDateTime(new Date());
		customer.setEmail("cedellalahmet@gmail.com");
		customer.setFirstName("ahmet");
		customer.setLastName("DELLAL");
		customer.setLastUpdate(new Timestamp(new Date().getTime()));
		customer.setStoreId(100);
		
		URI location =restTemplate.postForLocation("http://localhost:8080/rest/customer", customer);
		
		Customer customer2 =restTemplate.getForObject(location, Customer.class);
		
		MatcherAssert.assertThat(customer.getFirstName(), Matchers.equalTo(customer2.getFirstName()));
		MatcherAssert.assertThat(customer.getLastName(), Matchers.equalTo(customer2.getLastName()));
		
	}
}
