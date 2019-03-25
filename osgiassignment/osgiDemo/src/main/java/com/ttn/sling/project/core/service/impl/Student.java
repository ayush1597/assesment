package com.ttn.sling.project.core.service.impl;

public class Student {
    String name;
    int id;
    int marks;
    int age;


    public Student(int i, String name, int i1, int i2) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }
}
