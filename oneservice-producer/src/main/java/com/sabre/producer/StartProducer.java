package com.sabre.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StartProducer {

	public static void main(String[] args) {

		SpringApplication.run(StartProducer.class, args);

	}

}
