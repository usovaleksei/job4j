package ru.job4j.array;

public class MinDiapason {

    //метод ищет минимальный элемент в массиве в указанном диапазоне
    public static int findMin (int[] array, int start, int finish) {
        int min = array[start];
        for (int index=start; index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
