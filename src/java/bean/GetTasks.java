/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author terrelkl
 */
public class GetTasks implements Serializable{
    
    String query = "SELECT taskName, priority, dueDate, status FROM Tasks WHERE userId=1;";
    model.db.DBQuery dbq = new model.db.DBQuery();
    ArrayList<String> data = dbq.executeQuery(query);

    public ArrayList<String> getData() {
        return data;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }
    
    public ArrayList<String> tasks() {
        return data;
    }
}
