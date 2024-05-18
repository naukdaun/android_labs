package com.example.a23lab;

public class User {
    int _id;
    String _login;
    String _pass;

    public User(){
    }
    public User(String login, String pass){
        this._login = login;
        this._pass = pass;
    }

    public int getID(){
        return this._id;
    }
    public void setID(int id){
        this._id = id;
    }

    public String getLogin(){
        return this._login;
    }
    public void setLogin(String login){
        this._login = login;
    }

    public String getPass(){
        return this._pass;
    }
    public void setPass(String pass){
        this._pass = pass;
    }
}
