/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author terrelkl
 */
public class GetUsers {
    
    private String inputUserName = null;
    private String inputPassword1 = null;
    private String inputPassword2 = null;
    private String inputEmail = null;
    private String inputAnswer = null;
    private boolean submit = false;

    
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
