package com.atuluttam.springBootDatabase.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private int Roll;
    private String Name;
    private int Marks;



    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Roll=" + Roll +
                ", Name='" + Name + '\'' +
                ", Marks=" + Marks +
                '}';
    }
}
