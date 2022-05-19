package com.example.onetomanydemo;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class OnetomanydemoApplication {

	public static void main(String[] args) {
		ApplicationContext context ;
		context=SpringApplication.run(OnetomanydemoApplication.class, args);
		ItemRepository items;
		items=context.getBean(ItemRepository.class);
		cartRepository cart1;
		cart1=context.getBean(cartRepository.class);
		cart c1= new cart(4,"kk");
		cart1.save(c1);
		Items I1=new Items(2,"muse",600,c1);
		items.save(I1);
		
		
		
	}

}
 