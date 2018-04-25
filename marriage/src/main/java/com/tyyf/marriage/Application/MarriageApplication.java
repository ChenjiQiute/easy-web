package com.tyyf.marriage.Application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tyyf.marriage")
@MapperScan("com.tyyf.marriage.mapper")
public class MarriageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarriageApplication.class, args);
	}
}
