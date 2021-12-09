package com.joins.Joins.Operations.Service;

import com.joins.Joins.Operations.Entity.Student;
import com.joins.Joins.Operations.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);

    }

    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student getByIdStudent(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);

    }

    @Override
    public Student updateStudent(int id, Student student) {
        Student student1 = studentRepository.findById(id).get();
        student1.setName(student.getName());
        student1.setfName(student.getfName());
        student1.setAddress(student.getAddress());
        student1.setState(student.getState());
        studentRepository.save(student1);
        return student1;
    }

    //native Joins
    @Override
    public List<Student> innerJoin() {
        return studentRepository.innerJoin();
    }

    @Override
    public List<Student> leftJoin() {
        return studentRepository.leftJoin();
    }

    @Override
    public List<Student> rightJoin() {
        return studentRepository.rightJoin();
    }

    @Override
    public List<Student> fullOuterJoin() {
        return studentRepository.fullOuterJoin();
    }

    @Override
    public List<Student> crossJoin() {
        return studentRepository.crossJoin();
    }
}
