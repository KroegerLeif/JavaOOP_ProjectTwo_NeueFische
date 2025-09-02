package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 1));
        students.add(new Student("Jane", "Doe", 2));
        students.add(new Student("John", "Smith", 3));

        Map<Integer, Student> studentMap= new HashMap<>();
        for(Student student : students){
            studentMap.put(student.getStudentId(), student);
        }

        Schule schule = new Schule(studentMap);
        schule.getAllStudents();
        schule.removeStudentById(1);
        schule.getAllStudents();
        schule.addStudent(new Student("Jane", "Smith", 4));
        schule.getAllStudents();

        students.get(1).addKurs(new Kurs("Informatik", "Floooorian", "A101"));
        System.out.println(students.get(1));
    }
}