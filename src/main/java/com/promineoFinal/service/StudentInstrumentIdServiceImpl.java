package com.promineoFinal.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.promineoFinal.model.StudentInstrumentId;
import com.promineoFinal.repository.StudentInstrumentIdRepository;

@Service
public class StudentInstrumentIdServiceImpl implements StudentInstrumentIdService {

    @Autowired
    private StudentInstrumentIdRepository studentInstrumentIdRepository;


    @Override
    public void deleteStudentInstrumentId(StudentInstrumentId studentInstrumentId) {
        studentInstrumentIdRepository.delete(studentInstrumentId);
    }

    @Override
    public StudentInstrumentId getStudentInstrumentId(Long studentId) {
        return studentInstrumentIdRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("StudentInstrumentId not found with studentId: " + studentId));
    }

    @Override
    public List<StudentInstrumentId> getAllStudentInstrumentIds() {
        return studentInstrumentIdRepository.findAll();
    }

    // Update method for updating studentInstrumentId details
    @Override
    public StudentInstrumentId updateStudentInstrumentId(StudentInstrumentId studentInstrumentId) {
        return studentInstrumentIdRepository.save(studentInstrumentId);
    }

    // Other methods for CRUD operations or custom business logic
}