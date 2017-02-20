package com.spring.annotation.mvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.annotation.mvc.dao.IUserDAO;
import com.spring.annotation.mvc.dao.impl.UserDAOImpl;
import com.spring.annotation.mvc.entity.User;
import com.spring.annotation.mvc.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	@Qualifier("UserDAOImpl1")
	private IUserDAO userDAO;
	
	private User user;
	
	@Autowired
	public void setUser(@Qualifier("u1") User user){
		this.user = user;
	}
	
	
	public void insert(){
		userDAO.save(user);
		System.out.println("-------UserService÷¥––ÕÍ≥…--------");
	}
}
