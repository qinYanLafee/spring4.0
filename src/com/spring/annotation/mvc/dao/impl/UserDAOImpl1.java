package com.spring.annotation.mvc.dao.impl;

import org.springframework.stereotype.Repository;

import com.spring.annotation.mvc.dao.IUserDAO;
import com.spring.annotation.mvc.entity.User;

@Repository("UserDAOImpl1")
public class UserDAOImpl1 implements IUserDAO {
	public void save(User user){
		System.out.println("-------UserDAOImpl1 save·½·¨"+user+"--------");
	} 
	
	
}
