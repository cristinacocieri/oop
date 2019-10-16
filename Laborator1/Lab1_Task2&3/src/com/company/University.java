package com.company;

public class University {
    public String name;
    public int foundationYear;
    public Student[] students;


    public University(String name, int foundationYear, Student[] students) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.students = students;
    }
    
}