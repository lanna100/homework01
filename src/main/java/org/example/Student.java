package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 2 && grade <= 5) {
            grades.add(grade);
        } else {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5");
        }
    }

    public List<Integer> getGrades() {
        return grades;
    }


    @Override
    public String toString() {
        return name + ": " + grades;
    }
}
