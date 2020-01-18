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
        //перебираем значения элементов массива циклом for
        for (int index = 0; index < (array.length - 1); index++) {
            //присваиваем переменной cell значение ячейки массива
            String cell = array[index];
            //проверяем соответствие значения ячейки значению null
            if (cell == null) {
                int j = index;
                //если значение ячейки массива null, то ищем ячейку с значением не null
                while (array[j] == null && j < (array.length - 1)) {
                    j++;
                }
                //находим значение не null, меняем местами с ячейкой, в которой остановились циклом for
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
