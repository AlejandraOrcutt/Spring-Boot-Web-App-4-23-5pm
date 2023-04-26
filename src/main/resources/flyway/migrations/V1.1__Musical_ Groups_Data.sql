-- Insert data into instruments table
INSERT INTO instruments (name) VALUES ('viola'), ('violin'), ('cello');

-- Insert data into musical_groups table
INSERT INTO musical_groups (name) VALUES ('The Beatles'), ('Led Zeppelin'), ('Pink Floyd');
INSERT INTO musical_groups (name) VALUES ('The Skankin Six'), ('Ska Stars'), ('The Rude Boys');

-- Insert sample data into students table
INSERT INTO students (name, email, grade, instrument_id, group_id) VALUES 
('John Lennon', 'john.lennon@example.com', 'advanced', 1, 1),
('Paul McCartney', 'paul.mccartney@example.com', 'intermediate', 2, 1),
('George Harrison', 'george.harrison@example.com', 'beginner', 3, 2),
('Ringo Starr', 'ringo.starr@example.com', 'beginner', 1, 2),
('Jimmy Page', 'jimmy.page@example.com', 'advanced', 2, 3),
('Robert Plant', 'robert.plant@example.com', 'intermediate', 3, 3),
('Roger Waters', 'roger.waters@example.com', 'advanced', 1, 1),
('David Gilmour', 'david.gilmour@example.com', 'intermediate', 2, 2),
('Syd Barrett', 'syd.barrett@example.com', 'beginner', 3, 3),
('Nick Mason', 'nick.mason@example.com', 'beginner', 1, 3);
('Skankin' Steve', 'skankinsteve@example.com', 'intermediate', 1, 1),
('Trombone Tony', 'trombonetony@example.com', 'beginner', 2, 2),
('Saxy Sarah', 'saxysarah@example.com', 'advanced', 3, 3);


-- Inserting data for student_instruments
INSERT INTO student_instruments (student_id, instrument_id)
VALUES (1, 1), (2, 2), (3, 3);

-- Inserting data for student_groups
INSERT INTO student_groups (student_id, group_id)
VALUES (1, 1), (2, 2), (3, 3);