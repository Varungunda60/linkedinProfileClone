package com.example.LinkedinBasicProfle.controller;

import com.example.LinkedinBasicProfle.entity.Education;
import com.example.LinkedinBasicProfle.entity.User;
import com.example.LinkedinBasicProfle.services.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class EducationApi {

    @Autowired
    private EducationService educationService;

    @GetMapping("user/education/{id}")
    public String getEducation(){
        return  "hello";
    }

    @PostMapping("user/education/{id}")
    public ResponseEntity<Object> addEducatoin(@PathVariable Long id, @RequestBody Education education, UriComponentsBuilder uriComponentsBuilder){
        Long idCheck=educationService.addEducation(id,education);
        UriComponents uriComponents=uriComponentsBuilder.path("/user/{id}").buildAndExpand(education.getUser().getId());
        URI location = uriComponents.toUri();
        return ResponseEntity.created(location).build();
    }
}
