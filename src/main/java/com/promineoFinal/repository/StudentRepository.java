package com.promineoFinal.repository;

import java.util.List;
import javax.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import com.promineoFinal.model.Student;


@Table
public interface StudentRepository extends JpaRepository <Student, Long> {
  
  //find all students by their first name
  List<Student> findByName(String Name);

} 

