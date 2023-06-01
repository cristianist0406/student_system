package com.project.example.service;

import com.project.example.student.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student updateStudent(Student student);

    Student getStudentbyId(Long id);

    void deleteStudentById(Long id);
}
