package com.project.example.repository;

import com.project.example.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
