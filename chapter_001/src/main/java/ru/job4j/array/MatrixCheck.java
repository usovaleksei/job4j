package ru.job4j.array;

/**
 * Class  Класс для проверки заполнения строки, столбца, диагонали двумерного массива символом 'X'.
 * Поиск наличия выигрышной ситуации на поле в игре "Сокобан".
 * @author Aleksei Usov
 * @since 12.01.2020
 * @version 1.0
 */

public class MatrixCheck {

    //метод проверяет наличие элементов 'X' в одной строке двумерного массива (игрового поля)
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int j = 0; j != board[0].length; j++) {
                if (board[row][j] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }

    //метод проверяет наличие элементов 'X' в одном столбце двумерного массива
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i != board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    //метод заполняет одномерный массив элементами диагонали из двумерного массива
    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i != board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }

    //метод проверяет наличие полностью заполненной символом 'X' строки или столбца в квадратном массиве 5х5
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i != board.length; i++) {

            //проверяем наличие символа 'X' в диагонали матрицы
            if (board[i][i] == 'X') {

                //если в диагонали матрицы есть символ 'X' прроверяем заполненность соотвтетствующей строки или столбца символом 'X'
               if (monoHorizontal(board, i) || monoVertical(board, i)) {
                   result = true;
                   break;
               }
            }
        }
        return result;
    }
}
