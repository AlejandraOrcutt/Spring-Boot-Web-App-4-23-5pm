package com.promineoFinal.service;

import java.util.List;
import com.promineoFinal.model.StudentInstrumentId;

public interface StudentInstrumentIdService {


  void deleteStudentInstrumentId(StudentInstrumentId studentInstrumentId);

  StudentInstrumentId getStudentInstrumentId(Long studentId);

  List<StudentInstrumentId> getAllStudentInstrumentIds();

  StudentInstrumentId updateStudentInstrumentId(StudentInstrumentId studentInstrumentId);


}