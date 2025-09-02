package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String firstName;
    private String surname;
    private int studentId;
    private List<Kurs> kurs;

    public Student(String firstName, String surname, int studentId) {
        this.firstName = firstName;
        this.surname = surname;
        this.studentId = studentId;
        this.kurs = new ArrayList<>();
    }

    public void addKurs(Kurs kurs) {
        this.kurs.add(kurs);
    }


    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getStudentId() {
        return studentId;
    }

    public List<Kurs> getKurs() {
        return kurs;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", studentId=" + studentId +
                ", kurs=" + kurs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return studentId == student.studentId && Objects.equals(firstName, student.firstName) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname, studentId);
    }
}
