package com.springproject.demoproject.controller;

import com.springproject.demoproject.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @RequestMapping("/getstudents")
    public List<Student> getStudents() {
        return Arrays.asList(
                new Student(1, "Satvik", "Tiwari"),
                new Student(2, "Mrinal", "Anand"),
                new Student(3, "Ketan", "Vaish"),
                new Student(4, "Naman", "Bhatia"),
                new Student(5, "Harshit", "Chopra")
        );
    }
}
