package com.shemuchemi.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {


    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Shem",
                        "Muchmemi",
                        LocalDate.now(),
                        "shemuchemi@gmail.com",
                        30
                ),
                new Student(
                        "Florence",
                        "Wambui",
                        LocalDate.now(),
                        "wambui@gmail.com",
                        30
                )
        );
    };
}
