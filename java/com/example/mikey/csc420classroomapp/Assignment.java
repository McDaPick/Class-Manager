package com.example.mikey.csc420classroomapp;

/**
 * Created by Mikey on 10/24/2016.
 */

public class Assignment {
    public String name;
    public String date;
    public String className;
    public String description;

    public Assignment(String name, String date, String cName, String desc){
        this.name = name;
        this.date = date;
        this.className = cName;
        this.description = desc;
    }
}
