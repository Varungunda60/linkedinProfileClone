package com.example.LinkedinBasicProfle.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LinkedinBasicProfle.entity.User;

public interface UserRepositry extends JpaRepository<User,Long>{

}
