package ru.job4j.array;

public class FindLoop {

    //метод ищет индекс заданного элемента в массиве
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

    //метод ищет индекс заданного элемента в указанном диапазоне индексов массива
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
