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
  public ArrayList<String> executeQuery(String query) {
    
    ArrayList<String> result = new ArrayList<>();
    
    try {
      Connection con = getConnection();
      PreparedStatement stmt = con.prepareStatement(query);
      
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
