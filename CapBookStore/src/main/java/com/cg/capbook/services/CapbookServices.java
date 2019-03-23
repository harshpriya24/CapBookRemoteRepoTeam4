package com.cg.capbook.services;

import com.cg.capbook.beans.User;
import com.cg.capbook.exceptions.UserNotFoundException;

public interface CapbookServices {
public User registeringNewUser(User user);
public User logIn(User user) throws UserNotFoundException;
public  User findOne(User user) throws UserNotFoundException;
}
