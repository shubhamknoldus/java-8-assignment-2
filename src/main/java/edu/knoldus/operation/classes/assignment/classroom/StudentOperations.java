package edu.knoldus.operation.classes.assignment.classroom;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

final public class StudentOperations {


    Predicate<Student> studentWithNoSubject = student -> !(student.subjectList.isPresent());

    /**
     * @param classRoomsList
     * @return returns all those students who are not having any subjects
     */
    public List<Student> studentsHasNoSubjects(List<ClassRoom> classRoomsList) {

        return classRoomsList.stream()
                .filter(classRoom -> classRoom.studentList.isPresent())
                .flatMap(classRoomWithStudent -> classRoomWithStudent.studentList.get().stream()
                        .filter(studentWithNoSubject)).collect(Collectors.toList());

    }

    public List<List<String>> findSubjectByClassId(Integer id, List<ClassRoom> classRooms) {
        return classRooms.stream()
                .filter(classRoom -> classRoom.roomId.equals(id) && classRoom.studentList.isPresent())
                .map(classRoom -> classRoom.studentList.get().parallelStream()
                        .filter(student -> student.subjectList.isPresent()).collect(Collectors.toList())
                        .stream().map(student -> student.subjectList.get())).flatMap(x -> x).collect(Collectors.toList());

    }

    /**
     * @param classRooms
     * @return prints hello to all the students of a class room
     */
    public List<List<String>> helloStudent(List<ClassRoom> classRooms) {
        return classRooms.stream()
                .filter(classRoom -> classRoom.studentList.isPresent())
                .map(classRoomWithStudent -> classRoomWithStudent.studentList.get()
                        .parallelStream()
                        .map(student -> "\nhello " + student.name).collect(Collectors.toList())).collect(Collectors.toList());
    }
}
