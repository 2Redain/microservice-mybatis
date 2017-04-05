package com.spring.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.mybatis.domain.User;

/**
 * 这是一个接口类
 * @author smallpanda
 * @date 2017年4月5日下午3:54:17
 */
@Mapper
public interface UserMapper {
	//insert into user(username,age) values(#{userName,jdbcType=VARCHAR},#{age,jdbcType=NUMERIC})
	int saveByUser(User user);
	
	//select * from user where id = #{id,jdbcType=NUMERIC}
    User selectById(Integer id);  
     
    /*
     *  update user set    
     *  username = #{userName,jdbcType=VARCHAR} ,  
     *  age = #{age,jdbcType=NUMERIC}  
     *  where id = #{id,jdbcType=NUMERIC}
     */
    int updateById(User user);  
      
    //delete from user where id = #{id,jdbcType=NUMERIC} 
    int deleteById(Integer id);  
     
    //select * from user
    List<User> queryAll(); 
}
