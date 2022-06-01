package com.example.crud;

//import java.util.List;
//import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		ApplicationContext context;
	    context=SpringApplication.run(CrudApplication.class, args);
		StudentRepository stud;
		stud =context.getBean(StudentRepository.class);
		
		//Insert
		Student st1=new Student(300, "cccc");
				stud.save(st1);
				System.out.println("Record Saved");
//		//Update
//	    Optional<Student>op;
//	           op=stud.findById(300);
//	           Student st2=op.get();
//	           System.out.println(st2.getId());
//	           System.out.println(st2.getName());
//	           st2.setName("demo123");
//	           stud.save(st2);
//	    
//       //Delete
//	   Optional<Student>optional;
//	   op=stud.findById(300);
//	   Student st2=op.get();
//	   stud.delete(st2);
//	   
//	   
//	   List<Student>studlist;
//	   studlist=stud.findAll();
//	   for(Student st3:studlist) {
//		   System.out.println(st3.getId());
//		   System.out.print(st3.getName());
		   
	   //}
	 			
	}

}
