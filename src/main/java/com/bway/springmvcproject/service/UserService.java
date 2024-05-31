package com.bway.springmvcproject.service;

import com.bway.springmvcproject.model.User;

public interface UserService {
	void userSignup(User user);

	User userLogin(String un, String pw);

	User isUserExist(String un);

}
