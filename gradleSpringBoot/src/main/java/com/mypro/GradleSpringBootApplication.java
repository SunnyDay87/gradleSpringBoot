package com.mypro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mypro.mapper")
public class GradleSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleSpringBootApplication.class, args);
	}
}
