package com.linghu.entity;

import java.util.Date;

public class User {
    public String id;
    private String name;
    private Integer age;
    private Double price;
    private Boolean sex;
    private Date bir;


    public User(String id, String name, Integer age, Double price, Boolean sex, Date bir) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.price = price;
        this.sex = sex;
        this.bir = bir;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", sex=" + sex +
                ", bir=" + bir +

                '}';
    }
}
