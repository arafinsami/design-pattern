package com.designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Student implements Cloneable {

    private List<String> students;

    public Student() {
        students = new ArrayList<>();
    }

    public Student(List<String> list) {
        this.students = list;
    }

    public List<String> getEmpList() {
        return students;
    }

    public void loadData() {
        students.add("Sami");
        students.add("Sadi");
        students.add("Babu");
        students.add("Tamanna");
    }

    @Override
    public Object clone() {
        List<String> temp = new ArrayList<>();
        for (String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Student(temp);
    }
}
