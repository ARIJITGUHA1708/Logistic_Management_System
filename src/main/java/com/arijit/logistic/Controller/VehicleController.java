package com.arijit.logistic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.arijit.logistic.Model.VehicleModel;
import com.arijit.logistic.Service.VehicleService;

@Controller
public class VehicleController {
	@Autowired
	VehicleService vehicleService;
	@RequestMapping(value="/addvehicle",method = RequestMethod.GET)
public String addVehiclePage()
{
	return "AddVehicle.html";
}
	@RequestMapping(value="/addvehicle",method = RequestMethod.POST)
	public String addVehicleDetails(VehicleModel vehicleModel)
	{
		vehicleService.AddVehicle(vehicleModel);
		return "AdminHomePage.html";
	}
	@RequestMapping(value="/showvehicles",method = RequestMethod.GET)
	public ModelAndView showVehicleDetails()
	{
		List<VehicleModel> list= vehicleService.ShowAllVehicle();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("ShowVehicleDetails.html");
		return modelAndView;
	}
}
