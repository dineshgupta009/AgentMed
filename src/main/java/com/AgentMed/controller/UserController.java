package com.AgentMed.controller;

import com.AgentMed.Entity.UserReg;
import com.AgentMed.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/userReg")
    public UserReg saveUser(@Valid @RequestBody UserReg userReg){

        return  userRepository.save(userReg);
    }
}
