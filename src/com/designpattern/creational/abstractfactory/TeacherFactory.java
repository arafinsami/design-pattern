package com.designpattern.creational.abstractfactory;

public class TeacherFactory implements UniversityAbstractFactory {

    private String name;

    public TeacherFactory(String name) {
        this.name = name;
    }

    @Override
    public University createUniversity() {
        return new Teacher(name);
    }
}
