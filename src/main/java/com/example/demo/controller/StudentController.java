package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{email}")
    public Student getStudentByEmail(@PathVariable String email) {
        return studentService.getStudentByEmail(email);
    }


    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
}
