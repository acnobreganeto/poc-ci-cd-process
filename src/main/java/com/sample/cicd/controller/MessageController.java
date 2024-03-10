package com.sample.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class MessageController {
    @GetMapping("/helloMessage")
    public String getHelloMessage() {
        return "Hi there!";
    }
}
