package com.example.LinkedinBasicProfle.controller;

import com.example.LinkedinBasicProfle.entity.Education;
import com.example.LinkedinBasicProfle.entity.Skills;
import com.example.LinkedinBasicProfle.services.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class SkillsApi {
//    @GetMapping("user/skills/{id}")
//    public String getEducation(){
//        return  "hello";
//    }
    @Autowired
    private SkillsService skillsService;



    @PostMapping("user/skills/{id}")
    public ResponseEntity<Object> addSkills(@PathVariable Long id, @RequestBody Skills skill, UriComponentsBuilder uriComponentsBuilder){
        Long idCheck=skillsService.addSkills(id,skill);
        UriComponents uriComponents=uriComponentsBuilder.path("/user/{idCheck}").buildAndExpand(skill.getUser().getId());
        URI location = uriComponents.toUri();
        return ResponseEntity.created(location).build();
    }
}
