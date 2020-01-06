package ru.job4j.array;

/**
 * Class  Класс для проверки монотоности элементов массива.
 * @author Aleksei Usov
 * @since 06.01.2020
 * @version 1.0
 */

public class Check {
    public boolean mono (boolean[] data) {
        boolean result = true;
        for (int i=0; i != data.length - 1; i++) {
            if (data[i] != data[i+1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
