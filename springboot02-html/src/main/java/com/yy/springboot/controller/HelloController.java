package com.yy.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
		
	@GetMapping("/hello") //get请求注解
	@ResponseBody //类上面如果没有使用@ResponseBody注解,那方法上要返回json则必须注解
	public String hello(){
		return "Hello";
	}
	
	@GetMapping("/user")
	public String user(){
		return "html/user.html";
	}
}
