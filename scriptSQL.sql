use defaultdb ;

CREATE TABLE social_events(
  cod_usuario INT PRIMARY KEY NOT NULL AUTO_INCREMENT ,
  login VARCHAR(200) NOT NULL,
  password VARCHAR(200)NOT NULL,
  name VARCHAR(200) ,
  gender VARCHAR(200) ,
  email VARCHAR(200) ,
  cpf VARCHAR(11) ,
  age INT 
);

drop table social_events;

SELECT * FROM social_events;
/*cadastrar um usuário*/
INSERT INTO social_events
(login, password) VALUES
('TEST', 'TEST');

SELECT  *
FROM social_events;

UPDATE social_events SET
login='admin',password='admin'
WHERE cod_usuario = 1;

DELETE FROM social_events
WHERE cod_usuario = 2;

UPDATE social_events SET
password='' WHERE cod_usuario = 1;
