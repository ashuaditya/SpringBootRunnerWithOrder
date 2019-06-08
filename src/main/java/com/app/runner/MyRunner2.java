package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MyRunner2 implements CommandLineRunner, Ordered
{

	
	public int getOrder() {
		return 12;
	}

	
	public void run(String... args) throws Exception {
		System.out.println("From Ruuner 2");
		
	}

}
