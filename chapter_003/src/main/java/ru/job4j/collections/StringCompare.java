package ru.job4j.collections;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int minLength = Math.min(left.length(), right.length());
        for (int i = 0; i < minLength; i++) {
            char char1 = left.charAt(i);
            char char2 = right.charAt(i);
            result = Character.compare(char1, char2);
            if (result != 0)
                break;
        }
        if (result == 0) {
            result = left.length() - right.length();
        }
        return result;
    }
}
