package com.twd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
public class TWDController {

    @GetMapping("/api")
    public String get() {
        return "Hello from TWD app";
    }

}