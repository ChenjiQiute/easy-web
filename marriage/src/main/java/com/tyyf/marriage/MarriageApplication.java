package com.tyyf.marriage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tyyf.marriage.mapper")
public class MarriageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarriageApplication.class, args);
	}
}
