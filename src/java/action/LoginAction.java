/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Leeroy
 */
public class LoginAction extends ActionSupport {

    String inputUserName;
    String inputPassword;
    boolean submit;
    boolean cancel;

    public String execute() {
        return "dashboard";
    }

    public void validate() {
        if (inputUserName.isEmpty()) {
            addFieldError("inputUserName", "Name cannot be blank");
        }
        if (inputPassword.isEmpty()) {
            addFieldError("inputPassword", "Password cannot be blank");
        }
    }

    public String getInputUserName() {
        return inputUserName;
    }

    public void setInputUserName(String inputUserName) {
        this.inputUserName = inputUserName;
    }

    public String getInputPassword() {
        return inputPassword;
    }

    public void setInputPassword(String inputPassword) {
        this.inputPassword = inputPassword;
    }

    public boolean isSubmit() {
        return submit;
    }

    public void setSubmit(boolean submit) {
        this.submit = submit;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }
}
