package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = "api/v1/students")
    public List<Student> hello() {

        Student alice = new Student(
                "Alice Johnson",
                22, "Alice.Johnson@gmail.com",
                1L,
                LocalDate.of(1998, 5, 15));

        Student bob = new Student(
                "Bob Smith",
                23, "Bob.smith@gmail.com",
                2L,
                LocalDate.of(1997, 8, 20));
        Student charlie = new Student(
                "Charlie Brown",
                24, "Charlie.brown@gmail.com",
                3L,
                LocalDate.of(1996, 12, 30));

        return List.of(alice, bob, charlie);
    }
}
