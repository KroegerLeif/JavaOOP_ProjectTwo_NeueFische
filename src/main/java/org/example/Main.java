package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 1));
        students.add(new Student("Jane", "Doe", 2));
        students.add(new Student("John", "Smith", 3));

        Schule schule = new Schule(students);
        schule.getAllStudents();
        schule.removeStudentById(1);
        schule.getAllStudents();
        schule.addStudent(new Student("Jane", "Smith", 4));
        schule.getAllStudents();

    }
}