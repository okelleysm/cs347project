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
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author Leeroy
 */
public class RegisterAction extends ActionSupport {

    bean.GetQuestions securityQuestionsBean = new bean.GetQuestions();
    // ArrayList<String> securityQuestions = securityQuestionsBean.;
    String inputUserName;
    String inputPassword1;
    String inputPassword2;
    String inputEmail;
    
    String inputAnswer;
    boolean submit;

    public String execute() {
        return SUCCESS;
    }

    public void validate() {
        if (inputUserName.isEmpty()) {
            addFieldError("inputUserName", "Username cannot be blank");
        }
        if (inputPassword1.isEmpty()) {
            addFieldError("inputPassword1", "Password cannot be blank");
        }
        if (inputEmail.isEmpty()) {
            addFieldError("inputEmail", "Email cannot be blank");
        }
        /* if (inputQuestion.isEmpty()) {
            addFieldError("inputQuestion", "You must select a security question");
        } */
        if (inputAnswer.isEmpty()) {
            addFieldError("inputAnswer", "Security Answer cannot be blank");
        }
        
        if (inputUserName.length() > 16 || inputUserName.length() < 6) {
            addFieldError("inputUserName", "Username must be between 6 and 16 characters long");
        }
        if (inputPassword1.length() > 32 || inputPassword1.length() < 6) {
            addFieldError("inputPassword1", "Password must be between 6 and 32 characters long");
        }
        if (inputEmail.length() > 64 || inputEmail.length() < 10) {
            addFieldError("inputEmail", "Email must be between 10 and 64 characters long");
        }
        if (inputAnswer.length() > 32 || inputAnswer.length() < 3) {
            addFieldError("inputAnswer", "Your answer must be between 3 and 32 characters long");
        }
        if (Pattern.matches("^[A-Z0-9._+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$", inputEmail.toUpperCase())) {
            
        }
        if (inputPassword2.equals(inputPassword1)) {
            addFieldError("inputPassword", "Passwords do not match");
        }
    }
    
    public String getInputUserName() {
        return inputUserName;
    }

    public void setInputUserName(String inputUserName) {
        this.inputUserName = inputUserName;
    }

    public String getInputPassword1() {
        return inputPassword1;
    }

    public void setInputPassword1(String inputPassword1) {
        this.inputPassword1 = inputPassword1;
    }

    public String getInputPassword2() {
        return inputPassword2;
    }

    public void setInputPassword2(String inputPassword2) {
        this.inputPassword2 = inputPassword2;
    }

    public String getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(String inputEmail) {
        this.inputEmail = inputEmail;
    }

    /* public String getInputQuestion() {
        return inputQuestion;
    }

    public void setInputQuestion(String inputQuestion) {
        this.inputQuestion = inputQuestion;
    } */

    public String getInputAnswer() {
        return inputAnswer;
    }

    public void setInputAnswer(String inputAnswer) {
        this.inputAnswer = inputAnswer;
    }

    public boolean isSubmit() {
        return submit;
    }

    public void setSubmit(boolean submit) {
        this.submit = submit;
    }

    

    
}
