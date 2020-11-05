package stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
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
        Student studentOne = new Student(50, "Surname1");
        Student studentTwo = new Student(70, "Surname2");
        Student studentThree = new Student(60, "Surname3");
        Student studentFour = new Student(90, "Surname4");
        Student studentFive = new Student(20, "Surname5");
        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);
        students.add(studentFour);
        students.add(studentFive);
        StudentMap studentMap = new StudentMap();
        Map<String, Student> result = studentMap.convertListToMap(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Surname1", studentOne);
        expected.put("Surname2", studentTwo);
        expected.put("Surname3", studentThree);
        expected.put("Surname4", studentFour);
        expected.put("Surname5", studentFive);
        assertThat(result, is(expected));
    }

    /**
     * test when students list have recurring surname
     */

    @Test
    public void whenListToMapRepeatSurname() {
        List<Student> students = new ArrayList<>();
        Student studentOne = new Student(50, "Surname1");
        Student studentTwo = new Student(70, "Surname2");
        Student studentThree = new Student(60, "Surname2");
        Student studentFour = new Student(90, "Surname4");
        Student studentFive = new Student(20, "Surname2");
        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);
        students.add(studentFour);
        students.add(studentFive);
        StudentMap studentMap = new StudentMap();
        Map<String, Student> result = studentMap.convertListToMap(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Surname1", studentOne);
        expected.put("Surname2", studentTwo);
        expected.put("Surname4", studentFour);
        assertThat(result, is(expected));
    }

}
