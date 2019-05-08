package com.springboot.chapter16.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.springboot.chapter16.pojo.User;

@Mapper
public interface UserDao {
	
	User getUser(Long id);

	List<User> findUsers(@Param("userName") String userName, @Param("note") String note);
}
