package edu.knoldus.application;

import edu.knoldus.operation.classes.assignment.classroom.ClassRoom;
import edu.knoldus.operation.classes.assignment.classroom.Student;
import edu.knoldus.operation.classes.assignment.classroom.StudentOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MainApplicationClassRoom {
    public static void main(String[] args) {
        List<String> subjectList1 = Arrays.asList("Maths", "Science", "English");
        List<String> subjectList2 = Arrays.asList("Maths", "Science", "English", "Geography");
        List<String> subjectList3 = Arrays.asList("Maths", "Science");
        List<Student> students = Arrays.asList(
                new Student("Ram", 123, Optional.empty()),
                new Student("Shyam", 456, Optional.of(subjectList2)),
                new Student("John", 789, Optional.of(subjectList3)),
                new Student("David", 101, Optional.of(subjectList1))
        );
        List<ClassRoom> classRooms = Arrays.asList(
                new ClassRoom(7, Optional.of(
                   Arrays.asList(
                           students.get(0),
                           students.get(1)
                   )
                )),
                new ClassRoom(8, Optional.of(
                        Arrays.asList(
                                students.get(1),
                                students.get(2)
                        )
                )),
                new ClassRoom(9, Optional.of(
                        Arrays.asList(
                                students.get(2),
                                students.get(3)
                        )
                )),
                new ClassRoom(10, Optional.of(
                        Arrays.asList(
                                students.get(3),
                                students.get(1)
                        )
                ))

        );
        StudentOperations so = new StudentOperations();
        System.out.println(so.studentsHasNoSubjects(classRooms));
//        System.out.println(so.findSubjectByClassId(9, classRooms));
        System.out.println(so.helloStudent(classRooms));
    }
}
