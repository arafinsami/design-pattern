package com.designpattern.creational.builder;

public class Student {

    private String name;
    private Integer age;
    private Boolean isDisabled;

    private Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.isDisabled = builder.isDisabled;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isDisabled=" + isDisabled +
                '}';
    }

    public Boolean getDisabled() {
        return isDisabled;
    }

    public static class StudentBuilder {
        private final String name;
        private final Integer age;
        private Boolean isDisabled;

        public StudentBuilder(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public StudentBuilder setDisabled(boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
