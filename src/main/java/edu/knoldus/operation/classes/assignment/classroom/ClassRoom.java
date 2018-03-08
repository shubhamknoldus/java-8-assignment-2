package edu.knoldus.operation.classes.assignment.classroom;

import java.util.List;
import java.util.Optional;

final public class ClassRoom {
     Integer roomId;
     Optional<List<Student>> studentList;

    public ClassRoom(Integer roomNum, Optional<List<Student>> listOfStudent) {
        this.roomId = roomNum;
        this.studentList = listOfStudent;
    }
}
