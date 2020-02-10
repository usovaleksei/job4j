package ru.job4j.array;

/**
 * Class  Класс для поиска минимального элемента в массиве в указанном диаазоне
 * @author Aleksei Usov
 * @since 10.01.2020
 * @version 1.0
 */
public class MinDiapason {

    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
