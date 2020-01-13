package com.example.demo.dubbo.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.model.User;
import com.example.demo.part1.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "${demo.service.version}")
public class DubboServiceImpl implements DubboService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> testDubbo(String pararm) {
		System.out.println(">>>>>>>>>>testDobbo=" + pararm);
		return userDao.list(null);
	}
}
