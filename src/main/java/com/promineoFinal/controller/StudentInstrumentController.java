package com.promineoFinal.controller;

import com.promineoFinal.model.StudentInstrument;
import com.promineoFinal.service.StudentInstrumentService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student-instruments")
public class StudentInstrumentController {

    private StudentInstrumentService studentInstrumentService;

    public StudentInstrumentController(StudentInstrumentService studentInstrumentService) {
        this.studentInstrumentService = studentInstrumentService;
    }

    @GetMapping
    @ApiOperation(value = "Get all student instruments", notes = "Get a list of all student instruments")
    public List<StudentInstrument> getAllStudentInstruments() {
        return studentInstrumentService.getAllStudentInstruments();
    }

    @GetMapping("/{student_id}/{instrument_id}")
    @ApiOperation(value = "Get student instrument by IDs", notes = "Get student instrument details by student ID and instrument ID")
    public ResponseEntity<StudentInstrument> getStudentInstrumentByIds(
            @PathVariable("student_id") @ApiParam(value = "Student ID", example = "1") Long studentId,
            @PathVariable("instrument_id") @ApiParam(value = "Instrument ID", example = "1") Long instrumentId) {
        return new ResponseEntity<StudentInstrument>(studentInstrumentService.getStudentInstrumentByIds(studentId, instrumentId), HttpStatus.OK);
    }

    @PostMapping
    @ApiOperation(value = "Create a student instrument", notes = "Create a new student instrument")
    public ResponseEntity<StudentInstrument> saveStudentInstrument(@RequestBody StudentInstrument studentInstrument) {
        return new ResponseEntity<StudentInstrument>(studentInstrumentService.saveStudentInstrument(studentInstrument), HttpStatus.CREATED);
    }

    @PutMapping("/{student_id}/{instrument_id}")
    @ApiOperation(value = "Update student instrument", notes = "Update student instrument details by student ID and instrument ID")
    public ResponseEntity<StudentInstrument> updateStudentInstrument(
            @PathVariable("student_id") @ApiParam(value = "Student ID", example = "1") Long studentId,
            @PathVariable("instrument_id") @ApiParam(value = "Instrument ID", example = "1") Long instrumentId,
            @RequestBody StudentInstrument studentInstrument) {
        return new ResponseEntity<StudentInstrument>(studentInstrumentService.updateStudentInstrument(studentInstrument, studentId, instrumentId), HttpStatus.OK);
    }

    @DeleteMapping("/{student_id}/{instrument_id}")
    @ApiOperation(value = "Delete student instrument", notes = "Delete student instrument by student ID and instrument ID")
    public ResponseEntity<String> deleteStudentInstrument(
            @PathVariable("student_id") @ApiParam(value = "Student ID", example = "1") Long studentId,
            @PathVariable("instrument_id") @ApiParam(value = "Instrument ID", example = "1") Long instrumentId) {
        studentInstrumentService.deleteStudentInstrument(studentId, instrumentId);
        return new ResponseEntity<String>("Student Instrument Removed!!!", HttpStatus.OK);
    }
}
