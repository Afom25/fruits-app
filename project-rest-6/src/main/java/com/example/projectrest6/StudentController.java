package com.example.projectrest6;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {
    @RequestMapping("/students")

    public List<Student> getAllStudents(){

        return Arrays.asList(
                new Student("1001A","hidri","Abraham","Computer Science "),
                new Student("1001B","henok","Abraham","Computer Eng "),
                new Student("1001C","hermon","Abraham","Computer AI ")

        );

    }
}
