package com.promineoFinal.service;

import java.util.List;
import com.promineoFinal.model.StudentGroup;

public interface StudentGroupService {

  List<StudentGroup> getAllStudentGroups();

  StudentGroup getStudentGroup(Long id);

  StudentGroup createStudentGroup(Long studentId, Long groupId);

  StudentGroup updateStudentGroup(Long id, StudentGroup studentGroup);

  void deleteStudentGroup(Long id);

}

