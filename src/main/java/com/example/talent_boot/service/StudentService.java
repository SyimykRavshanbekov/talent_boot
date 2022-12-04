package com.example.talent_boot.service;

import com.example.talent_boot.model.Student;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

public interface StudentService {
    List<Student> getAllListStudent();

    List<Student> getAllStudents(Long id);

    void addStudent(Long id, Student student) throws IOException;

    Student getStudentById(Long id);

    void updateStudent(Student student, Long id) throws IOException;

    void deleteStudent(Long id);

    void assignStudent(Long groupId, Long studentId) throws IOException;
}
