package statistics;

import java.util.Objects;

/**
 * Class pupil results: name and score for pupil and subject
 * @author Aleksei Usov
 * @since 23/11/2020
 */

public class Tuple {

    private String name;
    private double score;

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public Tuple(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return Double.compare(tuple.score, score) == 0 &&
                Objects.equals(name, tuple.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}
