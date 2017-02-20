package com.spring.annotation.mvc.dao.impl;

import org.springframework.stereotype.Repository;

import com.spring.annotation.mvc.dao.IUserDAO;
import com.spring.annotation.mvc.entity.User;

@Repository("UserDAOImpl")
public class UserDAOImpl implements IUserDAO {
	public void save(User user){
		System.out.println("-------UserDAO save·½·¨"+user+"--------");
	} 
	
	
}
