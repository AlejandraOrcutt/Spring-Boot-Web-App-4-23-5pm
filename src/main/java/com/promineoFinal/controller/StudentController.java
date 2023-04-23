package com.promineoFinal.controller;

import java.util.List;
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
import com.promineoFinal.model.Student;
import com.promineoFinal.service.StudentService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;


@RestController
@RequestMapping("/musical_groups/students")
@Api(value = "StudentController", tags = {"Students"})
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    @GetMapping
    @ApiOperation(value = "Get all students", notes = "Get a list of all students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("{student_id}")
    @ApiOperation(value = "Get student by ID", notes = "Get student details by ID")
    public ResponseEntity<Student> getStudentById(
            @PathVariable("student_id") @ApiParam(value = "Student ID", example = "1") Long studentId) {
        return new ResponseEntity<Student>(studentService.getStudentByID(studentId), HttpStatus.OK);
    }

    @PostMapping
    @ApiOperation(value = "Create a student", notes = "Create a new student")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    @PutMapping("{student_id}")
    @ApiOperation(value = "Update student", notes = "Update student details by ID")
    public ResponseEntity<Student> updateStudent(
            @PathVariable("student_id") @ApiParam(value = "Student ID", example = "1") Long studentId,
            @RequestBody Student student) {
        return new ResponseEntity<Student>(studentService.updateStudent(student, studentId), HttpStatus.OK);
    }

    @DeleteMapping("{student_id}")
    @ApiOperation(value = "Delete student", notes = "Delete student by ID")
    public ResponseEntity<String> deleteStudent(
            @PathVariable("student_id") @ApiParam(value = "Student ID", example = "1") Long studentId) {
        studentService.deleteStudent(studentId);
        return new ResponseEntity<String>("Student Gone!!!", HttpStatus.OK);
    }
}

