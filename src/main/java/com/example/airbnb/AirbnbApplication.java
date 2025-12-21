package com.example.airbnb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.airbnb.integrations.imagekit.ImagekitProperties;

@SpringBootApplication
@EnableConfigurationProperties(ImagekitProperties.class)
public class AirbnbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirbnbApplication.class, args);
	}

}
