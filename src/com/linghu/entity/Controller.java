package com.linghu.entity;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class Controller extends ActionSupport {
    private String name;
    private String id;

    public String test(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String parameter = request.getParameter("name");
        String parameter1 = request.getParameter("id");
        System.out.println("name:"+parameter);
        System.out.println("id:"+parameter1);
        return "OK";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Controller{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
