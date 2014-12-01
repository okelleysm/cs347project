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
        results.add(rs.getString(1) + " " 
                + rs.getString(2) + " " 
                + rs.getString(3) + " " 
                + rs.getString(4) + " "
                + rs.getString(5) + " "
                + rs.getString(6) + " "
                + rs.getString(7) + " ");
      }
      connection.close();
    } catch (SQLException s) {
      s.printStackTrace();
      return null;
    }
    return results;
  }

} // end class
