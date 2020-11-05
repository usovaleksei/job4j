package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Class convert students list to map
 * @author Aleksei Usov
 * @since 05/11/2020
 */

public class StudentMap {

    /**
     * method convert list of students to map with key - surname
     * @param students - list of students
     * @return map with key - surname, value - object Student type
     */

    public Map<String, Student> convertListToMap (List<Student> students) {
        Map<String, Student> studentsMap = students
                .stream()
                .collect(Collectors.toMap(
                        s -> s.getSurname(),
                        o -> o,
                        (s1, s2) -> s1
                ));
        //studentsMap.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
        return studentsMap;
    }
}
