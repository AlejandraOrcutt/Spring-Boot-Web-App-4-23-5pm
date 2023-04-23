package com.promineoFinal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.promineoFinal.model.StudentGroup;
import com.promineoFinal.service.StudentGroupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/musical_groups/student_groups")
@Api(value = "StudentGroupController", tags = {"Student Groups"})
public class StudentGroupController {

    @Autowired
    private StudentGroupService studentGroupService;

    @GetMapping
    @ApiOperation(value = "Get all student groups")
    public List<StudentGroup> getAllStudentGroups() {
        return studentGroupService.getAllStudentGroups();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get student group by id")
    public StudentGroup getStudentGroup(@PathVariable Long id) {
        return studentGroupService.getStudentGroup(id);
    }

    @PostMapping("/{studentId}/{groupId}")
    @ApiOperation(value = "Create a new student group")
    public StudentGroup createStudentGroup(@PathVariable Long studentId, @PathVariable Long groupId) {
        return studentGroupService.createStudentGroup(studentId, groupId);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update student group by id")
    public StudentGroup updateStudentGroup(@PathVariable Long id, @RequestBody StudentGroup studentGroup) {
        return studentGroupService.updateStudentGroup(id, studentGroup);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete student group by id")
    public void deleteStudentGroup(@PathVariable Long id) {
        studentGroupService.deleteStudentGroup(id);
    }

}
