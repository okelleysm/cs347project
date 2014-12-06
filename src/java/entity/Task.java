/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author terrelkl
 */
public class Task {
    
    ArrayList<String> data = new ArrayList<>();
            
    String taskName;
    String priority;
    String dueDate;
    String status;
    
    model.db.DBQuery dbq = new model.db.DBQuery();
    
    
    public Task(String userId, String taskName, String priority, String dueDate, String status) {
        String query = "SELECT taskName, priority, dueDate, status FROM tasks WHERE userId="+userId+";";
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.status = status;
        ArrayList<String> data = dbq.executeQuery(query);
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public ArrayList<String> getData() {
        return data;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }
}
