package com.yeta.dpms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yeta.dpms.mapper")
public class DpmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DpmsApplication.class, args);
	}
}
