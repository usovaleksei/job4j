package ru.job4j.tracker;

/**
 * Class example to interface work
 * @author Aleksei Usov
 * @since 08/06/2020
 */

public class StubInput implements Input {
    private String[] answer;
    private int position = 0;

    public StubInput(String[] answer) {
        this.answer = answer;
    }

    @Override
    public String askStr(String question) {
        return answer[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
