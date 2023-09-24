package com.designpattern.creational.abstractfactory;

public class Student extends University {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
