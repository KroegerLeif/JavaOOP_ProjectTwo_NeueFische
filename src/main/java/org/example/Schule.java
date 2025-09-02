package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Schule {
    private List<Student> students;
    private String name;

    //Konstruktor
    public Schule(){
        this.students = new ArrayList<>();
    }

    public Schule(List<Student> students) {
        this.students = students;
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    //Methoden
    public void getAllStudents() {
        students.forEach(System.out::println);
    }

    public Student getStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public void removeStudentById(int studentId) {
        Student student = getStudentById(studentId);
        if (student != null) {
            students.remove(student);
        } else {
            System.out.println("Student nicht gefunden");
        }
    }

    //Getter
    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Schule{" +
                "students=" + students +
                ", name='" + name + '\'' +
                '}';
    }

    // Getter und Setter
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Schule schule)) return false;
        return Objects.equals(students, schule.students) && Objects.equals(name, schule.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students, name);
    }

}
