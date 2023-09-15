package org.example;
import org.example.GradeBook;
public class Teacher extends User {

    GradeBook gradeBook;
    public Teacher(String name, int id) {
        super(name, id);
    }

//    public void getGrade() {
//        return gradeBook.returnGrade();
//    }

}