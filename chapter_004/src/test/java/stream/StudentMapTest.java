package stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentMapTest {

    /**
     * test when all students surname are unique
     */

    @Test
    public void whenListToMapUniqueSurname() {
        List<Student> students = new ArrayList<>();
        Student studentOne = new Student("Surname1", 50);
        Student studentTwo = new Student("Surname2", 70);
        Student studentThree = new Student("Surname3", 60);
        Student studentFour = new Student("Surname4", 90);
        Student studentFive = new Student("Surname5", 20);
        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);
        students.add(studentFour);
        students.add(studentFive);
        StudentMap studentMap = new StudentMap();
        Map<String, Student> result = studentMap.convertListToMap(students);
        Map<String, Student> expected = Map.of(
                "Surname1", studentOne,
                "Surname2", studentTwo,
                "Surname3", studentThree,
                "Surname4", studentFour,
                "Surname5", studentFive);
        assertThat(result, is(expected));
    }

    /**
     * test when students list have recurring surname
     */

    @Test
    public void whenListToMapRepeatSurname() {
        List<Student> students = new ArrayList<>();
        Student studentOne = new Student("Surname1", 50);
        Student studentTwo = new Student("Surname2", 70);
        Student studentThree = new Student("Surname2", 60);
        Student studentFour = new Student("Surname4", 90);
        Student studentFive = new Student("Surname4", 20);
        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);
        students.add(studentFour);
        students.add(studentFive);
        StudentMap studentMap = new StudentMap();
        Map<String, Student> result = studentMap.convertListToMap(students);
        Map<String, Student> expected = Map.of(
                "Surname1", studentOne,
                "Surname2", studentTwo,
                "Surname4", studentFour);
        assertThat(result, is(expected));
    }
}
