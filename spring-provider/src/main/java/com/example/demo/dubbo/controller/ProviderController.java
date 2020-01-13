package com.example.demo.dubbo.controller;

import com.example.demo.dubbo.service.DubboProviderImp;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProviderController {

  @Autowired DubboProviderImp dubboProviderImp;

  @RequestMapping
  @ResponseBody
  public List<User> testApi(@RequestParam String pararm) {
    List<User> users = dubboProviderImp.testDobbo(pararm);

    return users;
  }
}
