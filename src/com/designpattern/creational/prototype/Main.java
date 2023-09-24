package com.designpattern.creational.prototype;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.loadData();

        Student studentNew = (Student) student.clone();
        List<String> list = studentNew.getEmpList();
        list.add("Irha");

        System.out.println("student List: " + student.getEmpList());
        System.out.println("new student List: " + list);
    }
}
