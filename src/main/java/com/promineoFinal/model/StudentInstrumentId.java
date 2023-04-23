package com.promineoFinal.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable


@Entity
@IdClass(StudentInstrumentId.class)
public class StudentInstrumentId implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "student_id")
    private Long studentId;
    @Id
    @Column(name = "instrument_id")
    private Long instrumentId;

 
}

    