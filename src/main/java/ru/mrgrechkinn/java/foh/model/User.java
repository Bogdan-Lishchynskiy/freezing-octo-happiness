package ru.mrgrechkinn.java.foh.model;

public class User implements Entity {
    
    private String login;
    private String password;
    private String fullName;
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    

}
