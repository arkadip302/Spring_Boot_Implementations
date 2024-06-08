package com.arkadip.apiCall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arkadip.apiCall.DTO.UserDTO;
import com.arkadip.apiCall.manager.UserGreetingsManager;
import com.arkadip.apiCall.model.User;

import jakarta.validation.Valid;

@Service
@RestController
@RequestMapping("/demo")
public class CallHello {

    @Autowired
    UserGreetingsManager greetingsManager;

    @GetMapping("/{userName}/hello")
    public String callHelloToUser(@PathVariable String userName) {
        return userName + " Hello !!!!";
    }

    @PostMapping("/isASeniorCitizen")
    public User postMethodName(@Valid @RequestBody UserDTO dto) {

        return greetingsManager.isSeniorCitizen(dto);
    }

}
