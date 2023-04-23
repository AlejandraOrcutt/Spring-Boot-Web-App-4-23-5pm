package com.promineoFinal.repository;

import javax.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import com.promineoFinal.model.StudentInstrument;
import com.promineoFinal.model.StudentInstrumentId;


@Table
public interface StudentInstrumentRepository extends JpaRepository<StudentInstrument, StudentInstrumentId> {
}