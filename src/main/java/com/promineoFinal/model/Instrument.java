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

  // No need to manually define getter and setter methods

}
