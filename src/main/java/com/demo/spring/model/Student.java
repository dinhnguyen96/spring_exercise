package com.demo.spring.model;

public class Student {

    private String name;
    private int age;

    public Student()
    {
        this.name = "";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
