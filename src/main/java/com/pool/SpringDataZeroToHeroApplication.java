package com.pool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringDataZeroToHeroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataZeroToHeroApplication.class, args);
	}

}
