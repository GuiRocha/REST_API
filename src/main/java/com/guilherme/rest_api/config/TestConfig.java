package com.guilherme.rest_api.config;


import com.guilherme.rest_api.entity.Order;
import com.guilherme.rest_api.entity.User;
import com.guilherme.rest_api.repositories.OrderRepository;
import com.guilherme.rest_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.reflect.Array;
import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Bobby Brown", "boby@gmail.com", "1234321", "12345323");
        User user2 = new User(null, "Billy Brown", "nilly@gmail.com", "1234321", "3232345");

        Order order = new Order(null, Instant.parse("2019-06-29T19:53:07Z"),user1);
        Order order1 = new Order(null, Instant.parse("2019-06-29T19:53:07Z"), user2);

        userRepository.saveAll(Arrays.asList(user1,user2));
        orderRepository.saveAll(Arrays.asList(order, order1));
    }
}
