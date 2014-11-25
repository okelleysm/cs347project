
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