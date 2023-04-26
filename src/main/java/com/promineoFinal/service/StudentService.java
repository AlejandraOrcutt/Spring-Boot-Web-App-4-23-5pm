package com.promineoFinal.service;

import java.util.List;

import com.promineoFinal.model.Student;

public interface StudentService {
    // Get all students
    List<Student> getAllStudents();

    // Get student by ID
    Student getStudentByID(Long id);

    // Save a student by name
    //Student saveStudentByName(String name, String email, String instrumentName, int groupId);

    Student saveStudentByName(Student student);
    // Update a student
    Student updateStudent(Student student, long studentId);

    // Delete a student
    void deleteStudent(Long id);
    

    List<Student> searchStudentsByName(String name);
}
