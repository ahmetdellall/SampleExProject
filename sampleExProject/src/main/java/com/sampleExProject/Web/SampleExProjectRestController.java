package com.sampleExProject.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.sampleExProject.DomainCustomerData.Customer;
import com.sampleExProject.Exception.CustomerNotFoundException;
import com.sampleExProject.Service.SampleExProjectService;

@RestController
@RequestMapping(value = "/rest")
public class SampleExProjectRestController {

	@Autowired(required = true)
	private SampleExProjectService exProjectService;

	@RequestMapping(method = RequestMethod.GET, value = "/customer")
	public ResponseEntity<List<Customer>> getAllCustomers() {

		List<Customer> customers = exProjectService.findByCustomer();
		return ResponseEntity.ok(customers);
	}

	
	@RequestMapping(method = RequestMethod.GET, value = "/customer/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("id") int id) throws CustomerNotFoundException {
		try {
			Customer customer = exProjectService.findById(id);
			return ResponseEntity.ok(customer);
		} catch (CustomerNotFoundException e) {
			return ResponseEntity.notFound().build();
		}
	}

}
