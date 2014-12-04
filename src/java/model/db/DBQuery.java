package model.db;

import java.sql.*;
import java.util.*;

/**
 * This class executes SQL queries.
 * 
 * @author R.Grove
 * @version 2014-10-02
 */
public class DBQuery extends DBAccess {

  /**
   * Execute an SQL query and return the results. The name and
   * number of each class are concatenated and returned as a String.
   * 
   * @param query The query to be executed
   * @return An ArrayList containing the query results
   */
  public ArrayList<String> doQuery(String query) {
    ArrayList<String> results = new ArrayList<String>();
    try {
      Connection connection = getConnection();
      if (connection == null) {
        return null;
      }
      Statement st = connection.createStatement();
      ResultSet rs = st.executeQuery(query);
      while (rs.next()) {
        results.add(rs.getString(1) + " " + rs.getString(2));
      }
      connection.close();
    } catch (SQLException s) {
      s.printStackTrace();
      return null;
    }
    return results;
  }

  /**
   * Execute an SQL query and return the results
   * from all records stored in the selected table.
   * 
   * @param table The table to be queried
   * @return An ArrayList containing the query results
   */
  public ArrayList<String> allFrom(String table) {
    
    ArrayList<String> result = new ArrayList<>();
    
    try {
      Connection con = getConnection();
      PreparedStatement stmt = con.prepareStatement("select * from " + table);
      
      ResultSet rs = stmt.executeQuery();
      ResultSetMetaData md = rs.getMetaData();
      
      // Get field values
      while (rs.next()) {
        for (int i = 1; i <= md.getColumnCount(); i++) {
          result.add(rs.getString(i));
        }
      }
    } catch (SQLException ignore) {
    }
    return result;
  }
} // end class
