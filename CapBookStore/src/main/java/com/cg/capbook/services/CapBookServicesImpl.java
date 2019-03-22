package com.cg.capbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.capbook.beans.User;
import com.cg.capbook.daoservices.UserDAOServices;
@Component("capbookservices")
public class CapBookServicesImpl implements CapbookServices {
@Autowired
	private UserDAOServices userdao;

	@Override
	public User registeringNewUser(User user) {
			return userdao.save(user);
	}

	@Override
	public User logIn(User user) {
		
		return null;
	}

}
