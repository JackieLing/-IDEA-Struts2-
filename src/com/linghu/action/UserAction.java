package com.linghu.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    public UserAction() {
        System.out.println("实例对象创建了~~~");
    }
    /* //登录
    public String login(){
        //1、搜集数据
        //2、调用登录业务对象
        System.out.println("用户登录方法~~~~");
        //3、流程跳转
        return "OK";
    }

    //注册
    public String register(){
        //1、搜集数据
        //2、调用注册业务对象
        System.out.println("用户注册方法~~~~");
        //3、流程跳转
        return "OK";
    }*/
}
