package model;

import model.db.DBCommand;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

/**
 * The servlet handles requests to create and delete tasks.
 * 
 */
@WebServlet(name = "DropAdd", urlPatterns = {"/dropadd"})
public class DropAdd extends HttpServlet {

    /*
     * Add a new task.
     */
    private void createTask() {
       
    }

    /*
     * Delete a task.
     */
    private void deleteTask() {
        
    }

} // end class
