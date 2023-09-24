package com.designpattern.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        University student = UniversityFactory.getComputer(new StudentFactory("Arafin"));
        University teacher = UniversityFactory.getComputer(new TeacherFactory("Mahfuz Hassan"));
        System.out.println("Teacher Object: " + teacher);
        System.out.println("Student Object: " + student);
    }
}
