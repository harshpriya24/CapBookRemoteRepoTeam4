package com.cg.capbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.capbook.beans.User;

@Controller
public class URIController {
 
	private User user;
	@RequestMapping(value= {"/","index"})
   public String getIndexPage() {
	   return "indexPage";
   }
	@RequestMapping("/login")
	   public String getLoginPage() {
		   return "LoginPage";
	   }
	@RequestMapping("/registration")
	   public String getRegistrationPage() {
		   return "registrationPage";
	   }
	@ModelAttribute
	public User getUser() {
		user=new User();
		return user;
	}
}
