use social_events ;

CREATE TABLE User(
  id INT PRIMARY KEY NOT NULL AUTO_INCREMENT ,
  login VARCHAR(200) NOT NULL,
  password VARCHAR(200)NOT NULL,
  name VARCHAR(200) ,
  gender VARCHAR(200) ,
  email VARCHAR(200) ,
  cpf VARCHAR(11) ,
  age INT 
);


SELECT * FROM User;
/*new User*/
INSERT INTO User
(login, password) VALUES
('TEST', 'TEST');

SELECT  *
FROM User;

/*update user info*/
UPDATE User SET
login='admin',password='admin'
WHERE id = 1;

/*delete user by cod_user*/
DELETE FROM User
WHERE id = 2;

UPDATE User SET
password='' WHERE id = 1;
