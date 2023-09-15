package org.example;

public class Student extends User{
    public String grade;
    public Student(String name, int id, String grade) {
        super(name, id);
        this.grade = grade;
    }
}
