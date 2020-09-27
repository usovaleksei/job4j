package ru.job4j.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Class convert list of array to one list
 * @author Aleksei Usov
 */

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] OneArray: list) {
            for (Integer element: OneArray) {
                rsl.add(element);
            }
        }
        return rsl;
    }
}
