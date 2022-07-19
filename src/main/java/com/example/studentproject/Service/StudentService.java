package com.example.studentproject.Service;

import com.example.studentproject.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudents(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
}
