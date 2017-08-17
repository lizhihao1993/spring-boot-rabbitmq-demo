package com.ideabook;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class SpringbookConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbookConsumerApplication.class, args);
	}
}
