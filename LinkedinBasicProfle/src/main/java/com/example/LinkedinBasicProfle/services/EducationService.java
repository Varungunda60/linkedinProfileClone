package com.example.LinkedinBasicProfle.services;


import com.example.LinkedinBasicProfle.Repositry.EducationRepositry;
import com.example.LinkedinBasicProfle.Repositry.UserRepositry;
import com.example.LinkedinBasicProfle.entity.Education;
import com.example.LinkedinBasicProfle.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class EducationService {

    @Autowired
    private UserRepositry userRepositry;
    @Autowired
    private EducationRepositry educationRepositry;

    public Long addEducation(Long  id, Education education){
        User user=userRepositry.findById(id).get();
        education.setUser(user);
        List<Education> educations=new ArrayList<Education>();
        educations.add(education);
        user.setEducation(educations);
        return userRepositry.save(user).getId();
    }

}
