/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author terrelkl
 */
public class User{
    
    ArrayList<String> data;
    
    String userName;
    String password;
    String md5password;
    
    model.db.DBQuery dbq = new model.db.DBQuery();
    
    public User(String user, String pass) {
        this.userName = user.toLowerCase(); // Case Insensitive username will always be stored as lowercase.
        this.password = hashedPassword(pass);
        data = queryUser(user);
    }
    
    public boolean authenticate() {
        String query = "SELECT password FROM users WHERE userName='" + userName + "';";
        if (!data.isEmpty())
            if (dbq.doQuery(query).get(4).equals(password))
                return true;
        return false;
    }
    
    private String hashedPassword(String pass) {
        String md5;
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            md.reset();
            byte[] bytes = md.digest(pass.getBytes());
            md5 = new BigInteger(1, bytes).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            md5 = "";
        }
        return md5;
    }
    
    private ArrayList<String> queryUser(String userName) {
        String query = "SELECT * FROM users WHERE userName='" + userName + "';";
        return dbq.doQuery(query);
    }
    
    public String getData(int index) {
        return data.get(index);
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}