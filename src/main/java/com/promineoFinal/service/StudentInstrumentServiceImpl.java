package com.promineoFinal.service;

import com.promineoFinal.model.StudentInstrument;
import com.promineoFinal.model.StudentInstrumentId;
import com.promineoFinal.repository.StudentInstrumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentInstrumentServiceImpl implements StudentInstrumentService {

    @Autowired
    private StudentInstrumentRepository studentInstrumentRepository;

    @Override
    public List<StudentInstrument> getAllStudentInstruments() {
        return studentInstrumentRepository.findAll();
    }

    @Override
    public StudentInstrument getStudentInstrumentByIds(Long studentId, Long instrumentId) {
        Optional<StudentInstrument> optionalStudentInstrument = studentInstrumentRepository.findById(new StudentInstrumentId());
        return optionalStudentInstrument.orElse(null);
    }

    @Override
    public StudentInstrument saveStudentInstrument(StudentInstrument studentInstrument) {
        return studentInstrumentRepository.save(studentInstrument);
    }

    @Override
    public StudentInstrument updateStudentInstrument(StudentInstrument studentInstrument, Long studentId, Long instrumentId) {
        Optional<StudentInstrument> optionalStudentInstrument = studentInstrumentRepository.findById(new StudentInstrumentId());
        if (optionalStudentInstrument.isPresent()) {
            StudentInstrument existingStudentInstrument = optionalStudentInstrument.get();
            existingStudentInstrument.setStudentId(studentInstrument.getStudentId());
            existingStudentInstrument.setInstrumentId(studentInstrument.getInstrumentId());
            return studentInstrumentRepository.save(existingStudentInstrument);
        } else {
            return null;
        }
    }

    @Override
    public void deleteStudentInstrument(Long studentId, Long instrumentId) {
        studentInstrumentRepository.deleteById(new StudentInstrumentId());
    }
}
