package com.readFile.text;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.readFile.repository")	

public class ReadFiles1Application {

	public static void main(String[] args) {
		SpringApplication.run(ReadFiles1Application.class, args);
	}
}
