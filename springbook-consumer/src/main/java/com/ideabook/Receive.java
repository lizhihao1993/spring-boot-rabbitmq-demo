package com.ideabook;

import com.ideabook.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: lzh
 * @Description:
 * @Date: Created in 2017/8/17 17:42
 */
@Component
@RabbitListener(queues = "spring-boot-queue")
public class Receive {

    @RabbitHandler
    public void process(List<User> userList) {
        System.out.println("start---------------------------");
        for (User u: userList) {
            System.out.println(u.toString());
        }
        System.out.println("end---------------------------");
    }
}
