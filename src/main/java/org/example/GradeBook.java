package org.example;


import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    Map<String,Grades> map = new HashMap<String,Grades>();

    public void addGrade(String student,Grades score){
        map.put(student,score);
    }

}