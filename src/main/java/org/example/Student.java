package org.example;

import java.util.Objects;

public class Student {
    private String firstName;
    private String surname;
    private int studentId;

    public Student(String firstName, String surname, int studentId) {
        this.firstName = firstName;
        this.surname = surname;
        this.studentId = studentId;
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

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", studentId=" + studentId +
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
