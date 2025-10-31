package com.shemuchemi.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/findAllStudents")
public class StudentController {

    private StudentService studentService;

    /*
      Constructor direct Injection.
      of StudentService into
      StudentController
    */
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    };
};