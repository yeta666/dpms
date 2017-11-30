package com.yeta.dpms.model;

/**
 * 用户实体
 * Created by Administrator on 2017-11-30.
 */
public class User {

    /**
     * 用户码
     */
    private Integer user_code;

    /**
     * 用户名
     */
    private String username_;

    /**
     * 密码
     */
    private String password_;

    /**
     * 角色
     * 0：超级管理员
     * 1：管理员
     */
    private Integer role_;

    public User() {
    }

    public Integer getUser_code() {
        return user_code;
    }

    public void setUser_code(Integer user_code) {
        this.user_code = user_code;
    }

    public String getUsername_() {
        return username_;
    }

    public void setUsername_(String username_) {
        this.username_ = username_;
    }

    public String getPassword_() {
        return password_;
    }

    public void setPassword_(String password_) {
        this.password_ = password_;
    }

    public Integer getRole_() {
        return role_;
    }

    public void setRole_(Integer role_) {
        this.role_ = role_;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_code=" + user_code +
                ", username_='" + username_ + '\'' +
                ", password_='" + password_ + '\'' +
                ", role_=" + role_ +
                '}';
    }
}
