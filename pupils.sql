CREATE TABLE pupils (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    email VARCHAR(355) NOT NULL,    
    school_id INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (school_id) REFERENCES schools(id)
);