package com.mycompany.fos.model;

public class UserLogin {

    protected int id;
    protected String username;
    protected String password;
    protected int block;
    protected int log;

    public UserLogin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getLog() {
        return log;
    }

    public void setLog(int log) {
        this.log = log;
    }

    @Override
    public String toString() {
        return "UserLogin{" + "id=" + id + ", username=" + username + ", password=" + password + ", block=" + block + ", log=" + log + '}';
    }

}
