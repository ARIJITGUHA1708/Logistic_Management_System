package com.arijit.logistic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogisticServicesController {
	@RequestMapping(value="/logistics",method = RequestMethod.GET)
public String logistics()
{
	return "Logistics.html";
}
	@RequestMapping(value="/otherservices",method = RequestMethod.GET)
	public String otherServices()
	{
		return "OtherServices.html";
	}
}
