package com.spring.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.mybatis.domain.User;

@Mapper
public interface UserMapper {
	
	int saveByUser(User user);
	
    User selectById(Integer id);  
      
    int updateById(User user);  
      
    int deleteById(Integer id);  
      
    List<User> queryAll(); 
}
