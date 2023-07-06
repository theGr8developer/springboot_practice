package com.blogpost.blogpostapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HmeController {
    


    @GetMapping("/")
    public ResponseEntity<String> Home(){


        return ResponseEntity.ok("This is home controller");
    }
}
