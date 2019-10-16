package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] arr = {7,8};

        Student student1 = new Student("Dan", "Luchian", 19, 9.77);
        Student student2 = new Student("Victoria", "Cristea", 20, 9.51);
        Student student3 = new Student("Andrei", "Condrea", 18, 8.06);

        Student student4 = new Student("Victor", "Andronic", 21, 7.45);
        Student student5 = new Student("Maria", "Ghetoi", 19, 9.03);
        Student student6 = new Student("Alexandru", "Digor", 18, 6.89);

        Student student7 = new Student("Ana", "Bojoreanu", 20, 8.34);
        Student student8 = new Student("Ion", "Dubita", 19, 7.68);
        Student student9 = new Student("Alina", "Ichim", 19, 9.56);
        Student student10 = new Student("Natalia", "Ghincu", 21, 8.49);

        Student[] studentsUniv1 = {student1, student2, student3};
        Student[] studentsUniv2 = {student4, student5, student6, student7};
        Student[] studentsUniv3 = {student8, student9, student10};

        University university1 = new University("Technical University", 1970, studentsUniv1);
        University university2 = new University("University of Economic Studies", 1970, studentsUniv2);
        University university3 = new University("University of Medicine and Health Sciences", 1970, studentsUniv3);


    }
}
