package com.example.demo.part1.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

	public User getNameById(User user);

	public User getUserById(User user);

	List<User> list(User user);

	void testDobbo(String pararm);
}
