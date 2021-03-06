package com.example.mappingdemo;

//import org.hibernate.dialect.Oracle10gDi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MappingdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context ;
		context=SpringApplication.run(MappingdemoApplication.class, args);
		RoleRepository role;
		role=context.getBean(RoleRepository.class);
		EmpRepository emp;
		emp=context.getBean(EmpRepository.class);
		Role r1=new Role(1,"Admin");
		role.save(r1);
		Emp e1=new Emp(100,"abc",r1);
		emp.save(e1);
	}

}
