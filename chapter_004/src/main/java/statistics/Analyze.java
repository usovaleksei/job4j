package statistics;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.summingDouble;

/**
 * Class receives statistics on certificates
 * @author Aleksei Usov
 * @since 23/11/2020
 */

public class Analyze {

    public Stream<Pupil> stream;

    /**
     * method calculates the overall average score
     * @param stream of pupils
     * @return average score
     */

    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(p -> p.getSubjects().stream())
                     .mapToInt(s -> s.getScore())
                     .average()
                     .orElse(0);
    }

    /**
     * method calculates the student's average score in his each subject
     * @param stream of pupils
     * @return average score for pupil in subjects
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
       return stream.map(pupil -> new Tuple(pupil.getName(),
                                            pupil.getSubjects().stream()
                                                               .mapToInt(s -> s.getScore())
                                                               .average()
                                                               .orElse(0)))
                    .collect(Collectors.toList());
    }

    /**
     * method calculates the average score in all subjects for each student
     * @param stream of pupils
     * @return a list from the Tuple object (subject name and average score)
     */
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(pupil -> pupil.getSubjects().stream())
                                                          .collect(Collectors.groupingBy(Subject::getName, averagingDouble(Subject::getScore)))
                     .entrySet().stream()
                     .map(subject -> new Tuple(subject.getKey(), subject.getValue()))
                     .collect(Collectors.toList());
    }

    /**
     * method find best student with max score to all subjects
     * @param stream
     * @return best student
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(pupil -> new Tuple(pupil.getName(),
                                             pupil.getSubjects().stream()
                                                                .mapToInt(s -> s.getScore())
                                                                .sum()))
                     .max(Comparator.comparing(Tuple::getScore))
                     .orElse(null);
    }

    /**
     * method find subject with max score to all students
     * @param stream
     * @return subject name, total score for each students to best subject
     */
    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap(pupil -> pupil.getSubjects().stream())
                                                          .collect(Collectors.groupingBy(Subject::getName, summingDouble(Subject::getScore)))
                     .entrySet().stream()
                                .map(subject -> new Tuple(subject.getKey(), subject.getValue()))
                                .max(Comparator.comparing(Tuple::getScore))
                                .orElse(null);
    }
}
