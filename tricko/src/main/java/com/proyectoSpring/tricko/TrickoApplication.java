package com.proyectoSpring.tricko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.proyectoSpring"})
public class TrickoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrickoApplication.class, args);
	}

}
