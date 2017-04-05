package com.spring.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;


@RestController
public class ConsumerController {

	/*
	 * url=http://localhost:2222  
	 * 该值来源于applicaiton.properties文件
	 */
	@Value("${user.userMybatisServerPath}")
	private String url;
	@Autowired
	private RestTemplate restTemplate;

	
	 @RequestMapping(value = "/save/user", method = RequestMethod.GET)
	 public String save() {
		User user = new User();
		/*
		 * 由于provide-mybatis工程中，UserMapper.xml文件中sql语句的原因
		 * 此处加上id，也不会存入数据库，
		 * 数据库中id自增长
		 */
//		user.setId(100);
		user.setUserName("TestForConsumer");
		user.setAge(20);
		/*
		 * 转换成jsonstring类型的数据
		 * 目的是为了传输user
		 * 
		 * 不清楚能不能直接传User，我觉得不可以，暂时没有尝试
		 */
		String userJson = JSON.toJSONString(user);
	    return restTemplate.getForEntity(url+"/save/text?text={text}" , String.class ,userJson).getBody();
	 }
	 
	@RequestMapping(value = "/deleteUserById")
	public String deleteUserById(){
		String temp = save();
//		System.out.println(temp+"*********************");
		Integer id = 1;
		return restTemplate.getForEntity(url+"/delete/id?id={id}", String.class, id).getBody();
	}
	
	@RequestMapping(value = "/findAll")
	public String findAll(){
		return restTemplate.getForEntity(url+"/findAll", String.class).getBody();
	}
	
	
}




