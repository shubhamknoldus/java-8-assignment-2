package edu.knoldus.operation.classes.assignment.classroom;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

final public class Student {
    public String name;
    public Integer rollNo;
    public Optional<List<String>> subjectList;


    public Student(String studentName,
                   Integer enrollNum,
                   Optional<List<String>> listOfSubject
    ) {
        this.name = studentName;
        this.rollNo = enrollNum;
        this.subjectList = listOfSubject;
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
