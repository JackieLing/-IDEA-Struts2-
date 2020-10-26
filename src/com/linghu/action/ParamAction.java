package com.linghu.action;

import com.linghu.entity.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

/*
* 用来测试参数接收的action
* */

public class ParamAction extends ActionSupport {
    private String username;
    private Integer age;
    private Double price;
    private Boolean sex;
    private Date bir;


    private User user;


    public String test(){

        /*System.out.println("用户名是"+username);
        System.out.println("用户名是"+age);
        System.out.println("价格是"+price);
        System.out.println("性别是"+sex);
        System.out.println("生日是"+bir);*/
        System.out.println("============解决对象类型的参数==================");
        //System.out.println(user);
        return "OK";
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
