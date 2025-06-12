package com.crud.project.StudentController;

import com.crud.project.StudentRepo.StudentRepo;
import com.crud.project.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @GetMapping("/student")
    public List<Student> getAllStudents() {
        List<Student> list = repo.findAll();
        return list;
    }
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id) {
        Student student = repo.findById(id).get();
        return student;
    }

     @PostMapping("/create")
    public void createStudent(@RequestBody Student student) {
        repo.save(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id) {
        Student student1 = repo.findById(id).get();
        repo.delete(student1);
    }
}
