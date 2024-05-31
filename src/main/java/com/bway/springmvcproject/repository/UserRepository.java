package com.bway.springmvcproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springmvcproject.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
//----for user login-----
	User findByUsernameAndPassword(String un,String pw);
	
	//-----for if user already exist------
	User findByUsername(String un);
}
