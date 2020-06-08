package ru.job4j.tracker;

/**
 * Class example to interface work
 * @author Aleksei Usov
 * @since 08/06/2020
 */

public class StubInput implements Input {
    @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
