package com.designpattern.creational.factory;

public abstract class University {
    public abstract String getName();

    @Override
    public String toString() {
        return "Name= " + this.getName();
    }
}
