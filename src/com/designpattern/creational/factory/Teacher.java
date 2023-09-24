package com.designpattern.creational.factory;

public class Teacher extends University {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
