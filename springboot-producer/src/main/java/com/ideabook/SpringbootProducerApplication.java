package com.ideabook;

import com.ideabook.entity.User;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@EnableRabbit
@EnableScheduling//启用任务调度.z
public class SpringbootProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProducerApplication.class, args);
	}

	@Autowired
	Send sends;

	@Scheduled(fixedDelay=3000)//3s执行1次此方法;
	public void send(){
		List<User> users = new ArrayList<>();
		users.add(new User(1L,"zs","12345678901"));
		users.add(new User(2L,"ls","12345678902"));
		users.add(new User(3L,"ww","12345678903"));
		users.add(new User(4L,"zl","12345678904"));
		users.add(new User(5L,"xx","12345678905"));
		sends.sendMsg("msg start : "+ UUID.randomUUID().toString() +" ,msg end");
	}
}
