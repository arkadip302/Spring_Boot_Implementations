package com.arkadip.apiCall.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class CallHello {

    @GetMapping("/{userName}/hello")
    public String callHelloToUser(@PathVariable String userName) {
        return userName + " Hello !!!!";
    }
}
