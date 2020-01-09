package ru.job4j.array;

/**
 * Class  Класс для сортировки элементов массива по возрастанию.
 * @author Aleksei Usov
 * @since 09.01.2020
 * @version 1.0
 */

public class SortSelected {
    //метод сортирует массив по возрастанию
    public static int[] sort(int[] data) {
        for (int i=0; i != data.length-1; i++) {
            int min = MinDiapason.findMin(data, i, (data.length-1));
            int index = FindLoop.indexOf(data, min, i, (data.length-1));
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
