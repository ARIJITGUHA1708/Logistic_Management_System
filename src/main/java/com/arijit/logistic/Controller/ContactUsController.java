package com.arijit.logistic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.arijit.logistic.Model.ContactUsModel;
import com.arijit.logistic.Service.ContactUsService;

@Controller
public class ContactUsController {
	@Autowired
	ContactUsService contactUsService;

	@RequestMapping(value = "/contactuspage", method = RequestMethod.GET)
	public String contactUs() {
		return "ContactUsPage.html";
	}

	@RequestMapping(value = "/SendContactUsPageInformation", method = RequestMethod.POST)
	public String contactusdata(ContactUsModel contactUsModel) {
		contactUsService.addAllData(contactUsModel);
		return "startingPage.html";
	}
	@RequestMapping(value="/fetchContactUsMessage",method = RequestMethod.GET)
	public ModelAndView contactUsMessage()
	{
		ModelAndView mView=new ModelAndView();
		List<ContactUsModel> list=contactUsService.listOfMessages();
		mView.addObject("list",list);
		mView.setViewName("ContactUsMessageForAdminPage.html");
		return mView;
	}
}
