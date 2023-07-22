package com.example.cloudclient;

import com.example.cloudclient.config.ClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ClientConfig.class)
public class CloudclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudclientApplication.class, args);
	}

}
