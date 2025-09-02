package org.example;

import java.util.*;

public class Schule {
    private Map<Integer,Student> students;
    private String name;

    //Konstruktor
    public Schule(){
        this.students = new HashMap<>();
    }

    public Schule(Map<Integer,Student> students) {
        this.students = students;
    }


    public void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    //Methoden
    public void getAllStudents() {
        for(Map.Entry<Integer,Student> entry : students.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    public Student getStudentById(int studentId) {
        return students.get(studentId);
    }

    public void removeStudentById(int studentId) {
        Student student = getStudentById(studentId);
        if (student != null) {
            students.remove(student);
        } else {
            System.out.println("Student nicht gefunden");
        }
    }

    public List<Kurs> getAllKurs(int studentId) {
        List<Kurs> kursList = new ArrayList<>();
        kursList = getStudentById(studentId).getKurs();
        return kursList;
    }

    //Getter
    public Map<Integer, Student> getStudents() {
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
