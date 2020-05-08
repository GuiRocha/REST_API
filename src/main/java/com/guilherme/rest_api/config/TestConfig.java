package com.guilherme.rest_api.config;


import com.guilherme.rest_api.entity.User;
import com.guilherme.rest_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.reflect.Array;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Bobby Brown", "boby@gmail.com", "1234321", "12345323");
        User user2 = new User(null, "Billy Brown", "nilly@gmail.com", "1234321", "3232345");

        userRepository.saveAll(Arrays.asList(user1,user2));
    }
}
