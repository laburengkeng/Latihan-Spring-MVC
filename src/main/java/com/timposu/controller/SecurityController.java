package com.timposu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecurityController {
	
	@RequestMapping(value="/loginpage", method = RequestMethod.GET)
	public String loginPage(){
		return "loginpage";
	}
	
	@RequestMapping(value="/logoutpage", method = RequestMethod.GET)
	public String logoutPage(){
		return "logoutpage";
	}
}
