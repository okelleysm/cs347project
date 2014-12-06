/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author zbanaw
 */
public class GetPriorities {
    
    private String[] priorities = {"Low", "Standard", "High", "Critical"};

    public String[] getPriorities() {
        return priorities;
    }

    public void setPriorities(String[] priorities) {
        this.priorities = priorities;
    }
    
    
}
