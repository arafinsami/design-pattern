package com.designpattern.creational.factory;

public class UniversityFactory {

    public static University getUniversity(StaffType type, String name) {
        switch (type) {
            case TEACHER -> {
                return new Teacher(name);
            }
            case STUDENT -> {
                return new Student(name);
            }
        }
        return null;
    }
}
