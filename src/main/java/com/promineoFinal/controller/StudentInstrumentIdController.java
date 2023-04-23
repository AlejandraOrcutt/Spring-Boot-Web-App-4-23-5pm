package com.promineoFinal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.promineoFinal.model.StudentInstrumentId;
import com.promineoFinal.service.StudentInstrumentIdService;

@RestController
@RequestMapping("/studentInstrumentIds")
public class StudentInstrumentIdController {

    @Autowired
    private StudentInstrumentIdService studentInstrumentIdService;

    @GetMapping("/{studentId}")
    public ResponseEntity<StudentInstrumentId> getStudentInstrumentId(@PathVariable("studentId") Long studentId) {
        StudentInstrumentId studentInstrumentId = studentInstrumentIdService.getStudentInstrumentId(studentId);
        return new ResponseEntity<>(studentInstrumentId, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<StudentInstrumentId>> getAllStudentInstrumentIds() {
        List<StudentInstrumentId> studentInstrumentIds = studentInstrumentIdService.getAllStudentInstrumentIds();
        return new ResponseEntity<>(studentInstrumentIds, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<StudentInstrumentId> updateStudentInstrumentId(
            @RequestBody StudentInstrumentId studentInstrumentId) {
        StudentInstrumentId updatedStudentInstrumentId = studentInstrumentIdService
                .updateStudentInstrumentId(studentInstrumentId);
        return new ResponseEntity<>(updatedStudentInstrumentId, HttpStatus.OK);
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudentInstrumentId(@PathVariable("studentId") Long studentId) {
        StudentInstrumentId studentInstrumentId = studentInstrumentIdService.getStudentInstrumentId(studentId);
        studentInstrumentIdService.deleteStudentInstrumentId(studentInstrumentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
