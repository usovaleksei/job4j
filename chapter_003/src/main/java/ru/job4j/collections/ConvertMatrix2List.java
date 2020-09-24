package ru.job4j.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Class convert two-dimensional array to list
 * @author Aleksei Usov
 * @since 25/09/2020
 */

public class ConvertMatrix2List {

    /**
     * method to convert two-dimensional array to list
     * @param array
     * @return list
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}
