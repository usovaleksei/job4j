package statistics;

import java.util.List;

/**
 * Class data model of pupil
 * @author Aleksei Usov
 * @since 23/11/2020
 */

public class Pupil {

    private String name;
    private List<Subject> subjects;

    public Pupil(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}
