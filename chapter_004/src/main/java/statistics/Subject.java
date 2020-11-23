package statistics;

/**
 * Class data model of school subject
 * @author Aleksei Usov
 * @since 23/11/2020
 */

public class Subject {

    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
