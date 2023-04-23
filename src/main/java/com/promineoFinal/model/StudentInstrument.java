package com.promineoFinal.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@Table(name = "student_instruments")
@ApiModel(description = "StudentInstrument Model")
public class StudentInstrument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_instrument_id")
    @ApiModelProperty(value = "Student Instrument ID", example = "1")
    private int studentInstrumentId;

    @Column(name = "student_id")
    @ApiModelProperty(value = "Student ID", example = "1")
    private int studentId;

    @Column(name = "instrument_id")
    @ApiModelProperty(value = "Instrument ID", example = "1")
    private int instrumentId;


 
}

    
