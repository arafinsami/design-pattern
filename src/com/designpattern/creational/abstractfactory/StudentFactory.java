package com.designpattern.creational.abstractfactory;

public class StudentFactory implements UniversityAbstractFactory {

    private String name;

    public StudentFactory(String name) {
        this.name = name;
    }

    @Override
    public University createUniversity() {
        return new Student(name);
    }
}
