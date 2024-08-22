package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Анна", new ArrayList<>());
        Student student1 = new Student("Андрей", new ArrayList<>());

        student.addGrade(3);
        student.addGrade(4);
        student.addGrade(5);
        System.out.println(student);

        student1.addGrade(2);
        student1.addGrade(5);
        student1.addGrade(5);

        List<Integer> allGrades = student1.getGrades();
        System.out.println("Все оценки студента Андрей: " + allGrades);

        student1.addGrade(1); // тут будет Exception

    }
}
