package com.saveetha.universitymanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("/api/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new UndergraduateStudent(1, "Smith"));
        students.add(new UndergraduateStudent(2, "Johnson"));
        students.add(new GraduateStudent(3, "Williams"));
        students.add(new GraduateStudent(4, "Jones"));
        students.add(new StudentAtLarge(5, "Brown"));
        students.add(new StudentAtLarge(6, "Davis"));

        return students;
    }
}
