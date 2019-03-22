package com.cg.capbook.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capbook.beans.User;
import com.cg.capbook.services.CapbookServices;

@Controller
public class CapBookServiceController {
@Autowired
	private CapbookServices capbookServices;

@RequestMapping("/loginUser")
public ModelAndView loginUser(@Valid@ModelAttribute User user,BindingResult result) {
	if(result.hasErrors()) return new ModelAndView("indexPage");
     user=capbookServices.logIn(user);
	return new ModelAndView("HomePage","user",user);
}
@RequestMapping("/registerUser")
public ModelAndView registerUser(@Valid@ModelAttribute User user,BindingResult result) {
	if(result.hasErrors()) return new ModelAndView("indexPage");
     user=capbookServices.registeringNewUser(user);
	return new ModelAndView("HomePage","user",user);
}
}
