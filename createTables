
CREATE TABLE IF NOT EXISTS Users
(
  userId integer(10) NOT NULL,
  securityQuestionId integer(10) NOT NULL,
  userName varchar(16) NOT NULL,
  password varchar(32) NOT NULL,
  email varchar(64) NOT NULL,
  securityAnswer varchar(32) NOT NULL,
  userClass varchar(16) NOT NULL,
  PRIMARY KEY (userId),
  FOREIGN KEY (securityQuestionId) REFERENCES SecurityQuestions (securityQuestionId)

);


CREATE TABLE IF NOT EXISTS Tasks
(
  taskId integer(10) NOT NULL,
  userId integer(10) NOT NULL,
  taskName varchar(32) NOT NULL,
  dueDate date NOT NULL,
  priority integer(2) NOT NULL,
  status varchar(16) NOT NULL,
  PRIMARY KEY (taskId),
  FOREIGN KEY (userId) REFERENCES Users (userID)

);


CREATE TABLE IF NOT EXISTS SecurityQuestions
(
  securityQuestionId integer(10) NOT NULL,
  securityQuestion varchar(32) NOT NULL,
  PRIMARY KEY (securityQuestionId)

);
