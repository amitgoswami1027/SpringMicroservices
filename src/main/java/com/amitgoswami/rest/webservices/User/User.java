package com.amitgoswami.rest.webservices.User;

import java.util.Date;

public class User
{
    private Integer id;
    private String name;
    private Date DOB;

    protected User(){}

    public User(Integer id, String name, Date DOB) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "AmitUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DOB=" + DOB +
                '}';
    }
}
