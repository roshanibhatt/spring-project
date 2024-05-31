package com.bway.springmvcproject.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bway.springmvcproject.model.User;
import com.bway.springmvcproject.repository.UserRepository;
import com.bway.springmvcproject.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepo;

	@Override
	public void userSignup(User user) {
		userRepo.save(user);
		
	}

	@Override
	public User userLogin(String un, String pw) {
		
		return userRepo.findByUsernameAndPassword(un, pw);
	}

	@Override
	public User isUserExist(String un) {
		
		return  userRepo.findByUsername(un);
	}

}
