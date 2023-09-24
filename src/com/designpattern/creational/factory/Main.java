package com.designpattern.creational.factory;

public class Main {
    public static void main(String[] args) {

        University teacher = UniversityFactory.getUniversity(StaffType.TEACHER, "Mahfuz Hassan");
        University student = UniversityFactory.getUniversity(StaffType.STUDENT, "Arafin");
        System.out.println("Teacher Object: " + teacher);
        System.out.println("Student Object: " + student);
    }
}
