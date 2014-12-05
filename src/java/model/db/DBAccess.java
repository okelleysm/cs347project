package model.db;

import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is the parent class for database transactions.
 * 
 * @author R.Grove
 * @version 2014-10-02
 */
public abstract class DBAccess {

    /**
     * Get a connection to the database.
     * 
     * @return The Connection object
     */
    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            // create a database connection
            connection = DriverManager.getConnection("jdbc:sqlite:/cs/home/stu/zbanaw/NetBeansProjects/cs347project/project.db");
            connection = DriverManager.getConnection("jdbc:sqlite:/cs/home/stu/terrelkl/NetBeansProjects/cs347project/project.db");
//            connection = DriverManager.getConnection("jdbc:sqlite:/cs/home/stu/okellesm/cs347project/project.db");
            
            initializeDB(connection);
        } 
        catch (SQLException sqe) {
            System.err.println(sqe.getMessage()); 
        }
        catch (ClassNotFoundException cnfe) {
        
        }
        return connection;
    }

    /*
     * Initialize the database if the required table is not already present.
     */
    private void initializeDB(Connection connection) { 
        Statement statement;
        ResultSet users;
        ResultSet questions;
                
        String userTable = ("CREATE TABLE IF NOT EXISTS Users"
                     + "(userId integer PRIMARY KEY,"
                     + "securityQuestionId integer(10) NOT NULL,"
                     + "userName varchar(16) NOT NULL,"
                     + "password varchar(32) NOT NULL,"
                     + "email varchar(64) NOT NULL,"
                     + "securityAnswer varchar(32) NOT NULL,"
                     + "userClass varchar(16) NOT NULL,"
                     + "FOREIGN KEY (securityQuestionId)"
                     + "REFERENCES SecurityQuestions (securityQuestionId));");
        
        String insertUsers = ("INSERT INTO "
                + "Users (securityQuestionId,"
                    + "userName, password, email, securityAnswer, userClass)"
                + "VALUES ('1', 'Jerry', 'pwd', 'email', 'answer', '1');"
                + "INSERT INTO "
                + "Users (securityQuestionId,"
                    + "userName, password, email, securityAnswer, userClass)"
                + "VALUES ('2', 'Lee', 'pwd2', 'email2', 'answer2', '2')");
        
        String secQuestionTable = ("CREATE TABLE IF NOT EXISTS SecurityQuestions"
                      + "(securityQuestionId integer PRIMARY KEY,"
                      + " securityQuestion varchar(50) NOT NULL);");
        
        String insertQuestions = ("INSERT INTO "
                + "SecurityQuestions (securityQuestion)"
                + "VALUES ('What is your mothers maiden name?');"
                + "INSERT INTO "
                + "SecurityQuestions (securityQuestion)"
                + "VALUES ('What is the name of your first pet?')");
        
                
        String taskTable = ("CREATE TABLE IF NOT EXISTS Tasks"
                      + "(taskId integer PRIMARY KEY,"
                      + "userId integer(10) NOT NULL,"
                      + "taskName varchar(32) NOT NULL,"
                      + "dueDate date NOT NULL,"
                      + "priority integer(2) NOT NULL,"
                      + "status varchar(16) NOT NULL,"
                      + "FOREIGN KEY (userId) REFERENCES Users (userID));");
              
        try {
            statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.
            
            statement.executeUpdate(userTable);
            statement.executeUpdate(secQuestionTable);
            statement.executeUpdate(taskTable);
            
            
            users = statement.executeQuery("select userId from Users");
            questions = statement.executeQuery("select userId from Users");
            
            if (!users.next()) {
                statement.executeUpdate(insertUsers);
            }
            
            if (!questions.next()) {
                statement.executeUpdate(insertQuestions);
            }
            
            
//************************** BELOW DISPLAY TO CONSOLE CAN BE DELETED BEFORE TURNING IN
            // display the table contents
            users = statement.executeQuery("select * from Users");
            while (users.next()) {
                System.out.print("User: " + users.getString("userId")+ " ");
            }
            // display the table contents
            questions = statement.executeQuery("select * from SecurityQuestions");
            while (questions.next()) {
                System.out.print("Question: " + questions.getString("securityQuestion")+ " ");
            }
            statement.close();
        } catch (SQLException sqe) {
            System.err.println(sqe.getMessage());
        }
    }

} // end class
