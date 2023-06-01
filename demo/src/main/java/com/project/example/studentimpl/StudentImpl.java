package com.project.example.studentimpl;

import com.project.example.repository.StudentRepository;
import com.project.example.service.StudentService;
import com.project.example.student.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentbyId(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
