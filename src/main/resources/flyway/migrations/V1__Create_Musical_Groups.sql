-- DROP DATABASE IF EXISTS musical_groups;

DROP TABLE IF EXISTS student_instruments;
DROP TABLE IF EXISTS student_groups;
DROP TABLE IF EXISTS students;
DROP TABLE IF EXISTS instruments;
DROP TABLE IF EXISTS musical_groups;

-- Create musical_groups database
-- CREATE DATABASE musical_groups;
USE musical_groups;
-- Create instruments table
CREATE TABLE instruments (
  instrument_id INT PRIMARY KEY AUTO_INCREMENT,
  name ENUM('viola', 'violin', 'cello')
);

-- Create musical_groups table (rock band name for example)
CREATE TABLE musical_groups (
  group_id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50)
);

-- Create students table with "delete on cascade"
CREATE TABLE students (
  student_id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50),
  email VARCHAR(50),
  grade ENUM('beginner', 'intermediate', 'advanced'),
  instrument_id INT,
  group_id INT,
  FOREIGN KEY (instrument_id) REFERENCES instruments (instrument_id) ON DELETE CASCADE,
  FOREIGN KEY (group_id) REFERENCES musical_groups (group_id)
);

-- Create student_instruments table
CREATE TABLE student_instruments (
  student_id INT,
  instrument_id INT,
  PRIMARY KEY (student_id),
  FOREIGN KEY (student_id) REFERENCES students (student_id),
  FOREIGN KEY (instrument_id) REFERENCES instruments (instrument_id)
);

-- Create student_groups table
CREATE TABLE student_groups (
  student_id INT,
  group_id INT,
  PRIMARY KEY (student_id, group_id),
  FOREIGN KEY (student_id) REFERENCES students (student_id),
  FOREIGN KEY (group_id) REFERENCES musical_groups (group_id)
);

--open Web App in swagger http://localhost:8080/swagger-ui.html

