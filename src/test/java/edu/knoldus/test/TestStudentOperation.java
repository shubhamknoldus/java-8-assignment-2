package edu.knoldus.test;

import edu.knoldus.operation.classes.assignment.classroom.ClassRoom;
import edu.knoldus.operation.classes.assignment.classroom.Student;
import edu.knoldus.operation.classes.assignment.classroom.StudentOperations;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class TestStudentOperation {
/*
    private static StudentOperations studentOperations;
    private static List<ClassRoom> classRooms;

    @BeforeClass
    public static void setUp() {
        List<String> subjectList1 = Arrays.asList("Maths", "Science", "English");
        List<String> subjectList2 = Arrays.asList("Maths", "Science", "English", "Geography");
        List<String> subjectList3 = Arrays.asList("Maths", "Science");
        List<Student> students = Arrays.asList(
                new Student("Ram", 123, Optional.empty()),
                new Student("Shyam", 456, Optional.of(subjectList2)),
                new Student("John", 789, Optional.of(subjectList3)),
                new Student("David", 101, Optional.of(subjectList1))
        );
        classRooms = Arrays.asList(
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
        studentOperations = new StudentOperations();
    }

    @Test
    public void testStudentHasNoSubjects(){
        List<Student> actual = studentOperations.studentsHasNoSubjects(classRooms);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Ram", 123, Optional.empty()));
        assertEquals("Testing the students associated with a room that have no subjects associated.", actual, expected);

    }

    @Test
*/




}
