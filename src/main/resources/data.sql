CREATE TABLE Recipe(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  serveCount int NOT NULL,
  description VARCHAR(250) DEFAULT NULL,
  isVeg boolean,
 instructions varchar(250)
);