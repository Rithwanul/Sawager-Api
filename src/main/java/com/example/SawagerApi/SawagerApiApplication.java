package com.example.SawagerApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SawagerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SawagerApiApplication.class, args);
	}

}
