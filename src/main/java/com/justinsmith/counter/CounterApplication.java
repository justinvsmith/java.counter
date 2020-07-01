package com.justinsmith.counter;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}

	
	public static int counter(HttpSession session) {
		session.setAttribute("count", 0);
		int count = (Integer) session.getAttribute("count");
		return count + 1;
	}
}
