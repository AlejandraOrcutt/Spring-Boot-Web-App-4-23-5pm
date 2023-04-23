package com.promineoFinal.service;

import java.util.List;
import com.promineoFinal.model.StudentInstrument;

public interface StudentInstrumentService {

  List<StudentInstrument> getAllStudentInstruments();

  StudentInstrument getStudentInstrumentByIds(Long studentId, Long instrumentId);

  StudentInstrument saveStudentInstrument(StudentInstrument studentInstrument);

  StudentInstrument updateStudentInstrument(StudentInstrument studentInstrument, Long studentId,
      Long instrumentId);

  void deleteStudentInstrument(Long studentId, Long instrumentId);
  
 

  
}
