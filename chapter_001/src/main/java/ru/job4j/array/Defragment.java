package ru.job4j.array;

/**
 * Class  Класс дефрагментации массива: перемещение заполненных ячеек в начало массива,
 * незаполненных (null ячеек) в конец массива
 * @author Aleksei Usov
 * @since 17.01.2020
 * @version 1.0
 */

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < (array.length - 1); index++) {
            String cell = array[index];
            if (cell == null) {
                int j = index;
                while (array[j] == null && j < (array.length - 1)) {
                    j++;
                }
                array[index] = array[j];
                array[j] = null;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String cell : compressed) {
            System.out.print(cell + " ");
        }
    }
}
