package com.cg.capbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capbook.beans.User;
import com.cg.capbook.exceptions.UserNotFoundException;
import com.cg.capbook.services.CapbookServices;

@Controller
public class CapBookServiceController {
@Autowired
	private CapbookServices capbookServices;

@RequestMapping("/loginUser")
public ModelAndView loginUser(@ModelAttribute User user) throws UserNotFoundException {
     user=capbookServices.logIn(user);
	return new ModelAndView("HomePage","user",user);
}
@RequestMapping("/registerUser")
public ModelAndView registerUser(@ModelAttribute User user) {
	     user=capbookServices.registeringNewUser(user);
	return new ModelAndView("HomePage","user",user);
}
}
