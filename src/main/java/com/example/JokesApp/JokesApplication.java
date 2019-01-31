package com.example.JokesApp;

import com.example.JokesApp.manager.JokesManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokesApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(JokesApplication.class, args);
		final JokesManager jokesManager = (JokesManager)applicationContext.getBean("jokesManager");
		for(int i=0; i<10; i++) {
			System.out.println(jokesManager.getJoke());
		}
	}

}