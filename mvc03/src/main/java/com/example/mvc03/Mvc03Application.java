package com.example.mvc03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Mvc03Application {

	public static void main(String[] args) {
		SpringApplication.run(Mvc03Application.class, args);
	}

}
