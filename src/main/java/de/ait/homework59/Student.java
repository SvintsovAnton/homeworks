package de.ait.homework59;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private double note;



    public Student(String name, int age, double note) {
        this.name = name;
        this.age = age;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }


    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age +
                ", note=" + note +
                '}';
    }
}
