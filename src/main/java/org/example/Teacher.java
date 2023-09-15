package org.example;
import org.example.GradeBook;

public class Teacher extends User {

    GradeBook gradeBook;

    public Teacher(String name, int id) {
        super(name, id);
    }

    public boolean isTeacher(int id){
        return true;
    }

}