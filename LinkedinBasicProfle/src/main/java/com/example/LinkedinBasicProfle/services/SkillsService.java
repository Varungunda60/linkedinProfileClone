package com.example.LinkedinBasicProfle.services;

import com.example.LinkedinBasicProfle.Repositry.SkillsRepositry;
import com.example.LinkedinBasicProfle.Repositry.UserRepositry;
import com.example.LinkedinBasicProfle.entity.Education;
import com.example.LinkedinBasicProfle.entity.Skills;
import com.example.LinkedinBasicProfle.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillsService {

    @Autowired
    private SkillsRepositry skillsRepositry;

    @Autowired
    private UserRepositry userRepositry;

    public Long addSkills(Long  id, Skills skill){

        User user=userRepositry.findById(id).get();
        skill.setUser(user);
        List<Skills> skills=new ArrayList<Skills>();
        skills.add(skill);
        user.setSkills(skills);
        return userRepositry.save(user).getId();
    }

}
