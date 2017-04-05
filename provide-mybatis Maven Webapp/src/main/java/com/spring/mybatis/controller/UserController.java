package com.spring.mybatis.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.spring.mybatis.domain.User;
import com.spring.mybatis.mapper.UserMapper;



@RestController
public class UserController {
	@Autowired
	private UserMapper mapper;
	
	@RequestMapping("/saveAuto")
	public String save(){
		User user = new User();
		user.setUserName("baotao");
		user.setAge(19);
		user.setId(1);
		mapper.saveByUser(user);
		return user.toString();
	}
	
	@RequestMapping(value = "/save/{text}")
	public String save(@Param("text") String text){
		User user = null;
//		System.out.println("**********************************************");
//		System.out.println(text);
		user = JSON.parseObject(text, User.class);
		mapper.saveByUser(user);
		return user.toString();
	}
	
	@RequestMapping(value = "/delete/{id}")
	public String delete(@Param("id") Integer id){
//		System.out.println("**********************"+id+"********************");
		User user = mapper.selectById(id);
//		System.out.println(user.toString()+"***********delete*************");
		mapper.deleteById(id);
		return user.toString()+"已经成功删除";
	}
	
	@RequestMapping(value = "/find/{id}")
	public String find(@Param("id") Integer id){
		return mapper.selectById(id).toString();
	}
	
	@RequestMapping(value = "/findAll")
	public List<User> findAll(){
		List<User> users= mapper.queryAll();
//		for(User user : users){
//			System.out.println(user.toString()+"\n");
//		}
		return users;
	}
}





