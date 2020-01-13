package com.example.demo.part1.controller;

import com.example.demo.model.User;
import com.example.demo.part1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

	@Autowired
	private UserService userService;


	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}


	@RequestMapping("/getName")
	@ResponseBody
	public User getName(User user) {
		User u = userService.getNameById(user);

		return u;
	}

	@RequestMapping("/get")
	@ResponseBody
	public User get(User user) {
		User u = userService.getUserById(user);

		return u;
	}


	@RequestMapping("/list")
	@ResponseBody
	public Map list(User user) {
		List<User> u = userService.list(user);
		Map result = new HashMap();
		result.put("element", u);
		return result;
	}

}
