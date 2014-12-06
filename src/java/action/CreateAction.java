/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author terrelkl
 */
public class CreateAction extends ActionSupport {
    
    String inputPriority;
    
    public CreateAction() {
    }
    
    public String execute() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String getInputPriority() {
        return inputPriority;
    }

    public void setInputPriority(String inputPriority) {
        this.inputPriority = inputPriority;
    }
    
}
