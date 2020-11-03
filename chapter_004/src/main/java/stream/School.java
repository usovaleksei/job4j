package stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Class filter student by score
 * @author Aleksei Usov
 * @since 03/11/2020
 */

public class School {

    /**
     * method filters student from stream by score
     * @param students - list of students
     * @param predict - student score
     * @return - list filtered students
     */

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> filteredStudent =
        students.stream()
                .filter(predict)
                .collect(Collectors.toList());
        return filteredStudent;
    };
}
