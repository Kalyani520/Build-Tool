package com.buildtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BuildToolDesignApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(BuildToolDesignApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BuildToolDesignApplication.class);
	}

}
