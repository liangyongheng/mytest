package com.yy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //代表为SpringBoot应用的运行主类
public class Application {
	
	public static void main(String[] args) {
		//创建SpringApplication应用对象
		SpringApplication springApplication = 
				new SpringApplication(Application.class);
		
		//设置关闭横幅模式(可选)
		springApplication.setBannerMode(Mode.OFF);
		
		//运行
		springApplication.run(args);
	}
	
}
