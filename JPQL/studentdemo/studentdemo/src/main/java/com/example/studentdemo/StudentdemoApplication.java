package com.example.studentdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudentdemoApplication {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ApplicationContext context;
		context=SpringApplication.run(StudentdemoApplication.class, args);
	MyRepository stud;
		stud =context.getBean(MyRepository.class);
		stud.getData();
	}

}







