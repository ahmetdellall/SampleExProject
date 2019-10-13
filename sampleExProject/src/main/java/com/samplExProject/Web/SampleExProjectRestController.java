package com.samplExProject.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.samplExProject.Service.SampleExProjectService;
import com.sampleExProject.DomainCustomerData.Customer;

@RestController // Bu anotasyon satesinde spring container bu sınıftan bir controller beani
// yaratacak, hem de ayrı ayrı response body notasyonu yazmaktan kurtacak...
@RequestMapping("/rest") // sınıf düzeyinde requestmapping anotasyonu kullanmamamız ise bu handler
// metodların request mappinglerine teker teker bu prefixi eklmemize gerek
// kalmayacak
public class SampleExProjectRestController {

	@Autowired
	private SampleExProjectService exProjectService;

	@RequestMapping(method = RequestMethod.GET, value = "/customer")
	public ResponseEntity<List<Customer>> getAllCustomers() {

		List<Customer> customers = exProjectService.findByCustomer();
		return ResponseEntity.ok(customers);
	}

	
	

}
