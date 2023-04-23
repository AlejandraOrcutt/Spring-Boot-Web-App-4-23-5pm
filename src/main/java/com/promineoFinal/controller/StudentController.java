package com.promineoFinal.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
        return new ResponseEntity<Student>(studentService.saveStudentByName(student.getName(), student.getEmail(),
                student.getInstrument().getName(), student.getGroupId()), HttpStatus.CREATED);
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

    @GetMapping("/search")
    @ApiOperation(value = "Search students", notes = "Search students by name")
    public List<Student> searchStudents(
            @RequestParam("name") @ApiParam(value = "Student name", example = "John") String name) {
        return studentService.searchStudentsByName(name);
    }
}
