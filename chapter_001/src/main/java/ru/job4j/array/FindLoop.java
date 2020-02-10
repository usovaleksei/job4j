package ru.job4j.array;

/**
 * Class  Класс для поиска заданного элемента в массиве и в заданном диапазоне в массиве
 * @author Aleksei Usov
 * @since 17.01.2020
 * @version 1.0
 */

public class FindLoop {

    public int indexOf(int[] data, int el) {
        int rst = -1; //если нет элемента в массиве, то возвращаем значение -1
        for (int i = 0; i != data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
