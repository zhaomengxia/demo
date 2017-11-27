package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


	@Value("${com.didispace.blog.name}")
	private String name;

	@Value("${com.didispace.blog.title}")
	private String title;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
