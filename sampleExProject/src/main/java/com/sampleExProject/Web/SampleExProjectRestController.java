package com.sampleExProject.Web;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

	@RequestMapping(method = RequestMethod.GET, value = "/customer/{id}", produces = "application/json")
	public ResponseEntity<?> getHeateoasCustomer(@PathVariable("id") int id) {
		try {
			Customer customer = exProjectService.findById(id);
			Link self = ControllerLinkBuilder.linkTo(SampleExProjectRestController.class).slash("/customer/" + id)
					.withSelfRel();
			Link create = ControllerLinkBuilder.linkTo(sampleExProjectController.class).slash("/customer")
					.withRel("create");
			Link update = ControllerLinkBuilder.linkTo(sampleExProjectController.class).slash("/customer/" + id)
					.withRel("update");
			Link delete = ControllerLinkBuilder.linkTo(sampleExProjectController.class).slash("/customer/" + id)
					.withRel("delete");

			Resource<Customer> resource = new Resource<Customer>(customer, self, create, update, delete);
			return ResponseEntity.ok(resource);
		} catch (CustomerNotFoundException e) {
			return ResponseEntity.notFound().build();
		}
	}

	@RequestMapping(method = RequestMethod.GET, value = "/customer/address/{id}")
	public ResponseEntity<List<Customer>> getAddressCustomerById(@PathVariable("id") int id)
			throws CustomerNotFoundException {
		List<Customer> customers = exProjectService.findByStretId(id);
		return ResponseEntity.ok(customers);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/costomer/store/{id}")
	public ResponseEntity<List<Customer>> getAddressAndStoreById(@RequestParam("ln") String firstName,
			@PathVariable("id") int addressIdx) throws CustomerNotFoundException {
		List<Customer> customers = exProjectService.findByStoreAndStreed(addressIdx, firstName);

		return ResponseEntity.ok(customers);
	}


////geri dönüş tipini uri yapmamızın sebebi owner	//// oluşturkduktan sonra oluştuğubu görmek için	//// uri kullanacağız
	@RequestMapping(method = RequestMethod.POST, value = "/customer") 														
	public ResponseEntity<URI> createCustomer(@RequestBody Customer customer) {

		try {
			exProjectService.crete(customer);
			long id = customer.getCustomerID();
			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(id).toUri();
			// ServletUriComponentsBuilder kullanarak owner nesnesine erişim sağlyacak rest
			// get uri oluşturmaya calışacağız, id bilgisini currentrequst uri ile
			// birliştiriyoruz ve geri döndürüyoruz
			return ResponseEntity.created(location).build();// 201 statü kodu ile döner
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();// 500 statü kodu ile döner
		}

	}

}
