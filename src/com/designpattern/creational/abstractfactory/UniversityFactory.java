package com.designpattern.creational.abstractfactory;

public class UniversityFactory {
    public static University getComputer(UniversityAbstractFactory factory) {
        return factory.createUniversity();
    }
}
