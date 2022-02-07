package com.shashwat.springapi.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(new Student(1L, "shashwat", "test@email.com", LocalDate.of(1998, Month.JANUARY, 18), 24));
    }
}
