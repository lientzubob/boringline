package com.casual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class CasualMainApplication {
	public static void main(String[] args) {
		SpringApplication.run(CasualMainApplication.class, args);
	}
}
