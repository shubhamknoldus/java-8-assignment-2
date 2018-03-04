package edu.knoldus.operation.classes.assignment.classroom;

import java.util.List;
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
        return this.name +" "+this.rollNo+" "+this.subjectList;
    }
}
