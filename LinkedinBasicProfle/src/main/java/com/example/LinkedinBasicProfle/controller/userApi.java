package com.example.LinkedinBasicProfle.controller;

import com.example.LinkedinBasicProfle.entity.User;
import com.example.LinkedinBasicProfle.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;


import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class userApi {
    @Autowired
    private UserService userService;


    @GetMapping("/user")
    public List<User> getUser(){
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping(path="/user")
    public ResponseEntity<Object> addUser(@RequestBody User user, UriComponentsBuilder uriComponentsBuilder){
        Long id=userService.saveUser(user);
        UriComponents uriComponents=uriComponentsBuilder.path("/user/{id}").buildAndExpand(user.getId());
        URI location = uriComponents.toUri();
        return ResponseEntity.created(location).build();
    }
}
