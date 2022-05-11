package com.example.demo;

//import javax.swing.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//import ch.qos.logback.core.Context;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context;
		context=SpringApplication.run(DemoApplication.class, args);
		StudentRepository stud = context.getBean(StudentRepository.class);
		//create row
		Student st=new Student(500,"abc");
		stud.save (st);
		System.out.println("Record save");

	}

}
