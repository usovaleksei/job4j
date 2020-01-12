package ru.job4j.array;

/**
 * Class  Класс для проверки заполнения строки двумерного массива символом 'X'.
 * @author Aleksei Usov
 * @since 12.01.2020
 * @version 1.0
 */

public class MatrixCheck {
    public static boolean monoHorizontal (char[][] board, int row) {
        boolean result = true;
            for (int j=0; j!=board[0].length; j++) {
                if (board[row][j] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
