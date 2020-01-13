package com.example.demo.part1.service;

import com.example.demo.model.User;
import com.example.demo.part1.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User getNameById(User user) {
		return userDao.getNameById(user);
	}

	@Override
	public User getUserById(User user) {
		return userDao.getUserById(user);
	}

	@Override
	public List<User> list(User user) {
		return userDao.list(user);
	}

	@Override
	public void testDobbo(String pararm) {

	}
}
