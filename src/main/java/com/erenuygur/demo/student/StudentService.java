package com.erenuygur.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student(1L, "Eren", "erenuygur@gmail.com", LocalDate.of(1999, Month.SEPTEMBER, 9), 24));
    }
}
