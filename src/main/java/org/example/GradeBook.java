package org.example;
import java.util.Map;

/**
 * GradeBook will maintain teacher information, and will upload grade
 */
public class GradeBook {
    Map<String,Grades> map;

    private int ownerID;

    public GradeBook(int id, Map <String, Grades> map) {
        this.map =map;
        ownerID = id;
    }

    public void addGrade(String student, Grades score){
        map.put(student,score);
    }

    public String returnGrade(String stuName ){
        //return calculateLetterGrade(stuName);
        return "";
    }

}