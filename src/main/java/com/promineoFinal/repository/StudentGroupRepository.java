package com.promineoFinal.repository;

import javax.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import com.promineoFinal.model.StudentGroup;
@Table
public interface StudentGroupRepository extends JpaRepository<StudentGroup, Long>{

}
