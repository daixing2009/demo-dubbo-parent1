package com.example.demo.part1.dao;


import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserDao {

	public User getNameById(User user);

	public User getUserById(User user);

	public List<User> list(User user);


}
