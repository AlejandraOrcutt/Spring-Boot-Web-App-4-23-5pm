package com.promineoFinal.service;

import java.util.List;
import com.promineoFinal.model.Student;

public interface StudentService {

    // Get all students
    public List<Student> getAllStudents();

    // Get student by ID
    public Student getStudentByID(Long id);

    // Save a student
    public Student saveStudent(Student student);

    // Update a student
    public Student updateStudent(Student student, long studentId);

    // Delete a student
    public void deleteStudent(Long id);

    // Delete a student by ID
    public void deleteStudent(int id);

    // Get student by ID
    public Student getStudentByID(int id);
}
