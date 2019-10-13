package com.samplExProject.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.samplExProject.Service.SampleExProjectService;

@Controller
public class sampleExProjectController {
	@Autowired
	private SampleExProjectService exProjectService;
	
	@RequestMapping("/customer")
	public ModelAndView getCustomers() {
		ModelAndView andView = new ModelAndView();
		andView.addObject("customer", exProjectService.findByCustomer());
		andView.setViewName("customer");
		return andView;
	}
}
