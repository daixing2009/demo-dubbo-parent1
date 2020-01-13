package com.example;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@EnableDubbo
public class DemoMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMySqlApplication.class, args);
	}

}
