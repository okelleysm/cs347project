/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import bean.GetTasks;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author terrelkl
 */
public class DisplayAction extends ActionSupport {

    List<GetTasks> list = null;

    public List<GetTasks> getList() {
        return list;
    }

    public void setList(List<GetTasks> list) {
        this.list = list;
    }

    @Override
    public String execute() throws Exception {
        list = new ArrayList<>();

        GetTasks task = new GetTasks();
        task.setTaskName("Testing123");
        task.setPriority("2");
        task.setDueDate("1987-1-1");
        task.setStatus("Open");
        list.add(task);
        ServletActionContext.getRequest().setAttribute("names", list);
        return SUCCESS;
    }

}
