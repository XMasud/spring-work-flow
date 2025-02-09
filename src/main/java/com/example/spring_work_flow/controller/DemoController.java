package com.example.spring_work_flow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flow")
public class DemoController {
    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
