package com.f1soft.abstractauditableentityexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
//@Profile("dev")
public class AbstractauditableentityexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbstractauditableentityexampleApplication.class, args);
	}

}
