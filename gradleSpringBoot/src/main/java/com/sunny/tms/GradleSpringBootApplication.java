package com.sunny.tms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sunny.tms.mapper")
public class GradleSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleSpringBootApplication.class, args);
	}
}
