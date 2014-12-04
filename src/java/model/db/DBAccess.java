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
            connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/Anthony/Documents/NetBeansProjects/cs347project/project.db");
//            initializeDB(connection);
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
        ResultSet rs;
                
        String userTable = ("CREATE TABLE IF NOT EXISTS Users"
                     + "(userId integer(10) NOT NULL,"
                     + "securityQuestionId integer(10) NOT NULL,"
                     + "userName varchar(16) NOT NULL,"
                     + "password varchar(32) NOT NULL,"
                     + "email varchar(64) NOT NULL,"
                     +"securityAnswer varchar(32) NOT NULL,"
                     +"userClass varchar(16) NOT NULL,"
                     +"PRIMARY KEY (userId),"
                     +"FOREIGN KEY (securityQuestionId)"
                     + "REFERENCES SecurityQuestions (securityQuestionId));");
              
        try {
            statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.
            statement.executeUpdate(userTable);
            
            rs = statement.executeQuery("select userId from Users");
            //String SQL
            if (!rs.next()) {
                statement.executeUpdate("insert into Users VALUES"
                        + "('2', '1', 'Jerry', 'pwd', 'email', 'answer', '1')");
            }

            // display the table contents
            rs = statement.executeQuery("select * from Users");
            while (rs.next()) {
                System.out.print("User: " + rs.getString("userId"));
            }

            statement.close();
        } catch (SQLException sqe) {
            System.err.println(sqe.getMessage());
        }
    }

} // end class
