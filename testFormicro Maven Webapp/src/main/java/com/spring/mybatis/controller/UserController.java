package com.spring.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mybatis.domain.User;
import com.spring.mybatis.mapper.UserMapper;



@RestController
public class UserController {
	@Autowired
	private UserMapper mapper;
	
	@RequestMapping("/save")
	public String save(){
		User user = new User();
		user.setUserName("baotao");
		user.setAge(19);
		user.setId(1);
		mapper.saveByUser(user);
		return user.toString();
	}
}
