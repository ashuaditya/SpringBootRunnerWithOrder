package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(10)
@Component
public class MyRunner1 implements CommandLineRunner{

	public void run(String... args) throws Exception 
	{
		System.out.println("From Runner 1");
	}

}
