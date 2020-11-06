package stream;

import java.util.List;
import java.util.stream.Collectors;

public class StudentLevel {

    public static List<Student> levelOf(List<Student> students, int bound) {
        List<Student> result = students.stream()
                .filter(s -> s != null)
                .sorted((left, right) -> right.compareTo(left))
                .takeWhile(b -> b.getScore() > bound)
                .collect(Collectors.toList());
        return result;
    }
}
