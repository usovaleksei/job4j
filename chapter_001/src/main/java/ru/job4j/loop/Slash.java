package ru.job4j.loop;

/**
 * Class  Класс для рисования креста в консоли.
 * @author Aleksei Usov
 * @since 05.01.2020
 * @version 1.1
 */

public class Slash {
    public static void draw(int size) {
        int temp = size - 1;
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = (cell == row);
                boolean right = (temp == (cell + row));
                if (left || right) {
                    System.out.print("0");
                } else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
            }
        }

    public static void main(String[] args) {
        System.out.println("Draw by 5");
        draw(5);
    }
}
