package com.spring.boot;

import com.spring.boot.enums.ShiChen;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);

		System.out.print(ShiChen.chen.toString());

	}
}
