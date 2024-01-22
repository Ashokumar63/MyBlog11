package com.myblog.myblog11;

public class LoginDto {
    private String userName;
    private String password;

    public LoginDto(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public LoginDto() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
