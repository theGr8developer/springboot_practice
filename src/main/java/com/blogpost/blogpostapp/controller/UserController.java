package com.blogpost.blogpostapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blogpost.blogpostapp.dao.UserRepository;
import com.blogpost.blogpostapp.model.User;

@RestController
public class UserController {
    
    @Autowired
    UserRepository userRepository;
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user){

        user = userRepository.save(user);
        return ResponseEntity.ok(user);

    }

    

}
