package com.AgentMed.controller;

import com.AgentMed.Entity.UserReg;
import com.AgentMed.repository.UserRegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRegRepository userRegRepository;

    @PostMapping("/userReg")
    public ResponseEntity<UserReg> createUser(@RequestBody UserReg userReg){

        Optional<UserReg> userExist = userRegRepository.findByPhoneNumber(userReg.getPhoneNumber());
        if(userExist.isPresent()){
            return ResponseEntity.badRequest().build();
        }
        UserReg savedUser = userRegRepository.save(userReg);
        return ResponseEntity.ok(savedUser);
    }
}
