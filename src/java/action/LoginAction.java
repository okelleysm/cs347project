/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Leeroy
 */
public class LoginAction extends ActionSupport {

    HttpSession session;
    String inputUserName;
    String inputPassword;
    boolean submit;
    boolean cancel;

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        entity.User user = new entity.User(inputUserName, inputPassword);
        String securityQuestionId = user.getData(2);
        String userName = user.getData(3);
        String userClass = user.getData(7);
        if (user.authenticate()) {
            session = request.getSession(true);
            session.setAttribute("loggedIn", true);
            session.setAttribute("securityQuestionId", securityQuestionId);
            session.setAttribute("userName", userName);
            session.setAttribute("userClass", userClass);
        }
        return SUCCESS;
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
