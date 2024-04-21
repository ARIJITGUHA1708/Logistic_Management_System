package com.arijit.logistic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arijit.logistic.Model.MainAdminLoginDetails;
import com.arijit.logistic.Model.NewUser;
import com.arijit.logistic.Service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService userService;

	// website Start from this page which is home page
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage() {
		//return "Home.html";
		return "startingPage.html";
	}

	// Get the admin login page
	@RequestMapping(value = "/adminloginpage")
	public String adminLoginPage() {
		return "AdminLoginPage.html";
	}

	// check the admin username and password and through admin home page
	@RequestMapping(value = "/adminloginenter", method = RequestMethod.POST)
	public String adminLoginPage(MainAdminLoginDetails mainAdminLoginDetails) {
		String username = mainAdminLoginDetails.getUsername();
		String password = mainAdminLoginDetails.getPassword();
		if ((username.equals("arijitguha1708@gmail.com") && password.equals("arijit"))
				|| (username.equals("anurag@gmail.com") && password.equals("anurag"))
				|| (username.equals("jaskaran@gmail.com") && password.equals("jaskaran"))) {
			//return "AdminHomePage.html";
			return "AdminDashboard.html";
		} else {
			{
				return "AdminLoginPage.html";
			}
		}
	}

	// new user page
	@RequestMapping(value = "/getnewuserhomepage")
	public String adminAddNewUserPage() {
		return "NewUser.html";
	}

	// store all the data from new user form to the database
	@RequestMapping(value = "/newuser", method = RequestMethod.POST)
	public String saveNewUser(NewUser newUser) {
		userService.saveNewUser(newUser);
		return "AdminHomePage.html";
	}

	@RequestMapping(value = "/team", method = RequestMethod.GET)
	public String teamPage() {
		return "TeamPage.html";
	}

	@RequestMapping(value = "/gallery", method = RequestMethod.GET)
	public String galleryPage() {
		return "Gallery.html";
	}
}
