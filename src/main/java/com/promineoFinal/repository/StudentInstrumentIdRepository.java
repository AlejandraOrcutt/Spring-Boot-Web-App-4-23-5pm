package com.promineoFinal.repository;

import javax.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import com.promineoFinal.model.StudentInstrumentId;

@Table
public interface StudentInstrumentIdRepository extends JpaRepository<StudentInstrumentId, Long> {
}