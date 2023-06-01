package com.project.example;

import com.project.example.repository.StudentRepository;
import com.project.example.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
             public static void main(String[] args){
     SpringApplication.run(Main.class);

}
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student("Ramesh", "Akhur", "ahsads@gmail.com");
        studentRepository.save(student1);

    }
}
