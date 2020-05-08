package com.guilherme.rest_api.resources;


import com.guilherme.rest_api.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "guilherme", "guilhermerxcha@gmail.com", "123456789", "12345");
        return ResponseEntity.ok().body(user);
    }
}
