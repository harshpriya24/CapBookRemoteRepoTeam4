package com.cg.capbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.capbook.beans.User;
import com.cg.capbook.daoservices.UserDAOServices;
import com.cg.capbook.exceptions.UserNotFoundException;
@Component("capbookservices")
public class CapBookServicesImpl implements CapbookServices {
@Autowired
	private UserDAOServices userdao;

	@Override
	public User registeringNewUser(User user) {
			return userdao.save(user);
	}

	@Override
	public User logIn(User user) throws UserNotFoundException {
		
		return null;
	}

	@Override
	public User findOne(User user) throws UserNotFoundException {
	  int userId=user.getUserId();
		return userdao.findById(userId).orElseThrow(()->new UserNotFoundException("User not Found for user name"+user.getUserName()));
	}

}
