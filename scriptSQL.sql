use social_events ;

CREATE TABLE User(
  id INT AUTO_INCREMENT PRIMARY KEY NOT NULL  ,
  login VARCHAR(200) NOT NULL,
  password VARCHAR(200)NOT NULL,
  name VARCHAR(200) ,
  gender VARCHAR(200) ,
  email VARCHAR(200) ,
  cpf VARCHAR(11) ,
  age INT 
);

SELECT * FROM User;

INSERT INTO User	 
(login, password) VALUES
('admin', 'admin');


 create table Events(
 id INT AUTO_INCREMENT PRIMARY KEY NOT NULL  ,
 Name varchar(255),
 Description varchar(255),
 DateTimeStart date,
 DateTimeFinish date
  );
  
   insert into Events (Name, Description, DateTimeStart,DateTimeFinish)
  values ('python','curso de python basico','2024/06/12','2024/09/24');
  
   insert into Events (Name, Description, DateTimeStart,DateTimeFinish)
  values ('Java','curso de Java basico','2024/08/12','2024/09/24');
  
   insert into Events (Name, Description, DateTimeStart,DateTimeFinish)
  values ('c#','curso de C# basico','2024/01/12','2024/07/22');