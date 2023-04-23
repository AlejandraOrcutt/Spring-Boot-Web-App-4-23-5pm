package com.promineoFinal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.promineoFinal.model.Instrument;
import com.promineoFinal.model.Student;
import com.promineoFinal.repository.InstrumentRepository;
import com.promineoFinal.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    private InstrumentRepository instrumentRepository;

    public StudentServiceImpl(StudentRepository studentRepository, InstrumentRepository instrumentRepository) {
        this.studentRepository = studentRepository;
        this.instrumentRepository = instrumentRepository;
    }

    // Get all students
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get student by ID
    @Override
    public Student getStudentByID(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Save a student by name
    @Override
    public Student saveStudentByName(String name, String email, String instrumentName, int groupId) {
        // Retrieve the instrument by name
        Instrument instrument = instrumentRepository.findByName(instrumentName);

        // Create a new student with the provided details
        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setInstrument(instrument);
        student.setGroupId(groupId);

        return studentRepository.save(student);
    }

    // Update a student
    @Override
    public Student updateStudent(Student student, long studentId) {
        if (studentRepository.existsById(studentId)) {
            return studentRepository.save(student);
        } else {
            return null;
        }
    }

    // Delete a student
    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    // Search students by name
    @Override
    public List<Student> searchStudentsByName(String name) {
        return studentRepository.findByNameContainingIgnoreCase(name);
    }
}
