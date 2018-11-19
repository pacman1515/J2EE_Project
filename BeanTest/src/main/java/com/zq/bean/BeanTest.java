package com.zq.bean;

import org.springframework.stereotype.Component;

@Component
public class BeanTest {
    String name;
    String password;

    public BeanTest(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public BeanTest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void Display() {
        System.out.println("BeanTest{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}');
    }
    public void test(){
        System.out.println("ceshi");
    }
}
