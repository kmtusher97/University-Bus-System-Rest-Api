package com.transport.university.universitytransportsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UniversityTransportSystemApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UniversityTransportSystemApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(UniversityTransportSystemApplication.class);
	}
}
