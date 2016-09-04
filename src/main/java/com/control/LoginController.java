package com.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	LoginController()
	{
		System.out.println("log consssssss");
	}
	@RequestMapping("/AboutUs")
	public String showAboutUs() 
	{
		System.out.println("at Loggggggggggg");
	return "AboutUs";
	}
	@RequestMapping("/ContactUs")
	public String showContactUs() 
	{
	return "Contact";
	}
	
	@RequestMapping("/Login")
	public String showLogin() 
	{
	return "Login";
	}
	@RequestMapping("/Register")
	public String showRegister() 
	{
	return "Register";
	}
	@RequestMapping("/Home")
	public String showHome() 
	{
		System.out.println("at Loggggggggggg");
	return "Home";
	}
	

}
