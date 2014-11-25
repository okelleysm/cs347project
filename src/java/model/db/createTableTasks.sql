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