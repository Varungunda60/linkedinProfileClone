package com.example.LinkedinBasicProfle.services;

import com.example.LinkedinBasicProfle.Repositry.UserRepositry;
import com.example.LinkedinBasicProfle.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepositry userRepositry;


    public List<User> getUsers(){
        return userRepositry.findAll();
    }

    public Optional<User> getUser(Long id){
        return userRepositry.findById(id);
    }

    public void addUser(User user){
        userRepositry.save(user);
    }

    public Long saveUser(User user) {
        return userRepositry.save(user).getId();
    }
}
