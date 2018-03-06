package edu.knoldus.operation.classes.assignment.classroom;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Student {
    public String name;
    public Integer rollNo;
    public Optional<List<String>> subjectList;


    public Student(String name, Integer rollNo, Optional<List<String>> subjectList) {
        this.name = name;
        this.rollNo = rollNo;
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return this.name + " " + this.rollNo + " " + this.subjectList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(rollNo, student.rollNo) &&
                Objects.equals(subjectList, student.subjectList);
    }

}
