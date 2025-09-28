package com.example.uetms;

import org.springframework.boot.SpringApplication;

public class TestUetmsApplication {

	public static void main(String[] args) {
		SpringApplication.from(UetmsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
