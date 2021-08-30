package com.ordinner.backend.model;

public class User {
    private Integer UserId;
    private String username;

    public User(Integer userId, String username) {
        UserId = userId;
        this.username = username;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    //TODO permission
}
