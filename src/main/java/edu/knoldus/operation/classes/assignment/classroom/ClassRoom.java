package edu.knoldus.operation.classes.assignment.classroom;

import java.util.List;
import java.util.Optional;

public class ClassRoom {
    public Integer roomId;
    public Optional<List<Student>> studentList;

    public ClassRoom(Integer roomId, Optional<List<Student>> studentList) {
        this.roomId = roomId;
        this.studentList = studentList;
    }
}
