package com.designpattern.creational.builder;

public class Main {
    public static void main(String[] args) {

        Student student = new Student.StudentBuilder("Sami", 36)
                .setDisabled(false)
                .build();
        System.out.println(student);
    }
}
