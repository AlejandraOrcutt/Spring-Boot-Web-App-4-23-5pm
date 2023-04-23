package com.promineoFinal.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.promineoFinal.exception.ResourceNotFoundException;
import com.promineoFinal.model.Student;
import com.promineoFinal.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Get all students
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get student by ID
    @Override
    public Student getStudentByID(Long id) { // Updated parameter data type to Long
        return studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student", "Id", id));
    }

    // Save a student
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Update a student
    @Override
    public Student updateStudent(Student student, long studentId) { 
        Student existingStudent = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student", "Id", studentId));
        // Update existingStudent with new values from student
        existingStudent.setName(student.getName());
        // Update other fields as needed

        return studentRepository.save(existingStudent); 
    }
    
    // Delete a student
    @Override
    public void deleteStudent(Long id) { 
        studentRepository.deleteById(id);
    }

    // Delete a student by ID
    @Override
    public void deleteStudent(int id) { 
        studentRepository.deleteById((long)id);
    }

    // Get student by ID
    @Override
    public Student getStudentByID(int id) { 
        return studentRepository.findById((long)id).orElseThrow(() -> new ResourceNotFoundException("Student", "Id", (long)id));
    }
}
