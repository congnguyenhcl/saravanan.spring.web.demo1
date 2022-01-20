package com.hcl.saravanan.springwebdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/abc")
    public String display() {
        return "Welcome";
    }
}
