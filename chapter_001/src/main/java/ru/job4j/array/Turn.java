package ru.job4j.array;

/**
 * Class  Класс для переворачивания массива.
 * @author Aleksei Usov
 * @since 06.01.2020
 * @version 1.0
 */

public class Turn {
    public int[] back (int[] array) {
        for (int i=0; i != array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
            }
        return array;
    }
}
