package com.example.LinkedinBasicProfle.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LinkedinBasicProfle.entity.Profile;

public interface ProfileRepositry extends JpaRepository<Profile, Long> {

}
