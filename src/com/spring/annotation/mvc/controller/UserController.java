package com.spring.annotation.mvc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.annotation.mvc.entity.User;
import com.spring.annotation.mvc.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService service;
	@Autowired
	private List<User> users;
	@Autowired
	private Map<String,User> map;
	
	
	public void test(){
	  service.insert();	
	  System.out.println("-----UserController÷¥––ÕÍ≥…------");
	  System.out.println(users.size());
	  System.out.println();
	  System.out.println(map);
	}
}
