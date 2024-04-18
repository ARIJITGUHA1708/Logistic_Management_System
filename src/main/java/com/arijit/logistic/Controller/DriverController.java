package com.arijit.logistic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.arijit.logistic.Model.DriverModel;
import com.arijit.logistic.Service.DriverService;

@Controller
public class DriverController {
	@Autowired
	DriverService driverService;
	@RequestMapping(value = "/adddriver",method = RequestMethod.GET)
public String AddDriverPage()
{
	return "AddDriverPage.html";
}
	@RequestMapping(value="/adddriver",method = RequestMethod.POST)
	public String AddDriverDetails(DriverModel driverModel)
	{
		driverService.AddDriverDetails(driverModel);
		return "AdminHomePage.html";
	}
	@RequestMapping(value="/showdrivers",method = RequestMethod.GET)
	public ModelAndView ShowDriverDetails()
	{
		List<DriverModel> list=driverService.ShowAllDrivers();
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("ShowDriverPage.html");
		return modelAndView;
	}
}
