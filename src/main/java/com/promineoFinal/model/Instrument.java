package com.promineoFinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "instruments")
public class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instrument_id")
    private int instrumentId;

    @Column(name = "name")
    private String name;

    // Add other fields, getters, and setters as needed

    // Constructors
    //...

    // Getters and Setters
    //...

    // Other methods
    //...
}

