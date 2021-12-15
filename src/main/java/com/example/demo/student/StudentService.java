package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
    public List<Student> getStudents(){
        return List.of( new Student(1l, "Stefan", "abc@mail.com", LocalDate.now(), 35));
    }
}
