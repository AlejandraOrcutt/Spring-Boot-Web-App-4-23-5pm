package com.promineoFinal.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.promineoFinal.model.StudentGroup;
import com.promineoFinal.repository.StudentGroupRepository;

@Service
public class StudentGroupServiceImpl implements StudentGroupService {

    @Autowired
    private StudentGroupRepository studentGroupRepository;

    @Override
    public StudentGroup getStudentGroup(Long id) {
        return studentGroupRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("StudentGroup not found with id: " + id));
    }

    @Override
    public List<StudentGroup> getAllStudentGroups() {
        return studentGroupRepository.findAll();
    }

    @Override
    public StudentGroup updateStudentGroup(Long id, StudentGroup studentGroup) {
        StudentGroup existingStudentGroup = studentGroupRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("StudentGroup not found with id: " + id));
        existingStudentGroup.setGroupId(studentGroup.getGroupId());
        return studentGroupRepository.save(existingStudentGroup);
    }

    @Override
    public StudentGroup createStudentGroup(Long studentId, Long groupId) {
        StudentGroup studentGroup = new StudentGroup();
        studentGroup.setStudentId(studentId);
        studentGroup.setGroupId(groupId);
        return studentGroupRepository.save(studentGroup);
    }

    @Override
    public void deleteStudentGroup(Long id) {
        StudentGroup studentGroup = studentGroupRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("StudentGroup not found with id: " + id));
        studentGroupRepository.delete(studentGroup);
    }

}
