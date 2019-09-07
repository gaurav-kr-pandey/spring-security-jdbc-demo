package com.javaeccentrics.springsecurityjdbcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springsecurity.jdbc.demo")
public class SpringSecurityJdbcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJdbcDemoApplication.class, args);
	}

}
