package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private String name;
    private int age;
    private String email;
    private long id;
    private LocalDate dateOfBirth;

    public Student(String name, int age, String email, long id, LocalDate dateOfBirth) {
        this.name = name;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
        this.email = email;
        this.id = id;
        this.dateOfBirth = dateOfBirth;

    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
