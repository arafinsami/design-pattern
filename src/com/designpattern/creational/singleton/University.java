package com.designpattern.creational.singleton;

public class University {

    private static University instance;

    private University() {
    }

    public static University getInstance() {
        if (instance == null) {
            synchronized (University.class) {
                if (instance == null) {
                    instance = new University();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        University universityOne = University.getInstance();
        University universityTwo = University.getInstance();
        System.out.println("object 1" + universityOne);
        System.out.println("object 2" + universityTwo);
    }
}
