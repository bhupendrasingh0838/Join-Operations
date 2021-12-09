package com.joins.Joins.Operations.Service;

import com.joins.Joins.Operations.Entity.Student;

import java.util.List;

public interface StudentService {

    public void createStudent(Student student);

    public List<Student> getAllStudent();

    public Student getByIdStudent(int id);

    public void deleteStudent(int id);

    public Student updateStudent(int id, Student student);

         // Native Join
    public List<Student> innerJoin();

    public List<Student> leftJoin();

    public List<Student> rightJoin();

    public List<Student> fullOuterJoin();

    public List<Student> crossJoin();
}
