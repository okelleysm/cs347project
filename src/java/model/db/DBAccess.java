package model.db;

import java.sql.*;

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
            connection = DriverManager.getConnection("jdbc:sqlite:347project.db");
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
        ResultSet rs;
        
        try {
            statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.
           
            statement.executeUpdate("create table if not exists users" 
                + "(userid varchar(10) default NULL, name varchar(30) default NULL)");
            
            rs = statement.executeQuery("select userid from users");
            if (!rs.next()) {
                statement.executeUpdate("insert into users values"
                        + "('1', 'Bob')");
            }

            // display the table contents
            rs = statement.executeQuery("select * from user");
            while (rs.next()) {
                System.out.print("User: " + rs.getString("userid")
                        + "  Name: " + rs.getString("username"));
            }

            statement.close();
        } catch (SQLException sqe) {
            System.err.println(sqe.getMessage());
        }
    }

} // end class
