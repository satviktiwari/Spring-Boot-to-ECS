package com.springproject.demoproject.controller;

import com.springproject.demoproject.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {

    @Autowired
    private Subject subject;

    @RequestMapping("/getsubjects")
    public Subject getSubjects() {
        return subject;
    }
}
