package ru.job4j.array;

/**
 * Class  Класс для проверки заполнения строки двумерного массива символом 'X'.
 * @author Aleksei Usov
 * @since 12.01.2020
 * @version 1.0
 */

public class MatrixCheck {

    //метод проверяет наличие элементов 'X' в одной строке двумерного массива
    public static boolean monoHorizontal (char[][] board, int row) {
        boolean result = true;
            for (int j=0; j != board[0].length; j++) {
                if (board[row][j] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }

    //метод проверяет наличие элементов 'X' в одном столбце двумерного массива
    public static boolean monoVertical (char[][] board, int column) {
        boolean result = true;
        for (int i=0; i!= board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

}
