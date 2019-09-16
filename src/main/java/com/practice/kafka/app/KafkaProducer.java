package com.practice.kafka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.practice.kafka")
public class KafkaProducer {
	public static void main(String[] args) {
		SpringApplication.run(KafkaProducer.class, args);
	}
}
