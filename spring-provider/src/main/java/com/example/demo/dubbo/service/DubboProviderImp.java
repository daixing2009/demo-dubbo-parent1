package com.example.demo.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DubboProviderImp {

  @Reference(version = "${demo.service.version}")
  DubboService dubboService;

  public List<User> testDobbo(String pararm) {
    System.out.println("consumerservice=" + pararm);
    return dubboService.testDubbo(pararm);
  }
}
