package com.joins.Joins.Operations.Controller;

import com.joins.Joins.Operations.Entity.Student;
import com.joins.Joins.Operations.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/createStudent")
    public String createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return "Data SuccessFully Created";
    }

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @GetMapping("/getByIdStudent/{id}")
    public Student getByIdStudent(@PathVariable int id) {
        return studentService.getByIdStudent(id);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "Data Deleted";
    }

    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    // JOINS
    @GetMapping("/innerJoin")
    public List<Student> innerJoin() {
        return studentService.innerJoin();
    }

    @GetMapping("/leftJoin")
    public List<Student> leftJoin() {
        return studentService.leftJoin();
    }

    @GetMapping("/rightJoin")
    public List<Student> rightJoin() {
        return studentService.rightJoin();
    }

    @GetMapping("/fullOuterJoin")
    public List<Student> fullOuterJoin() {
        return studentService.fullOuterJoin();
    }
    @GetMapping("/crossJoin")
    public List<Student> crossJoin(){
        return studentService.crossJoin();
    }
}
