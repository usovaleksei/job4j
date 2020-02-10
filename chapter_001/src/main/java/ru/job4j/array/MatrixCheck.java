package ru.job4j.array;

/**
 * Class  Класс для проверки заполнения строки, столбца, диагонали двумерного массива символом 'X'.
 * Поиск наличия выигрышной ситуации на поле в игре "Сокобан".
 * Метод monoHorizontal проверяет наличие элементов 'X' в одной строке двумерного массива
 * Метод monoVertical проверяет наличие элементов 'X' в одном стролбце двумерного массива
 * Метод isWin проверяет полностью заполненной символом 'X' строки или столбца в квадратном массиве 5х5
 * @author Aleksei Usov
 * @since 12.01.2020
 * @version 1.0
 */

public class MatrixCheck {

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

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i != board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i != board.length; i++) {
            if (board[i][i] == 'X') {
               if (monoHorizontal(board, i) || monoVertical(board, i)) {
                   result = true;
                   break;
               }
            }
        }
        return result;
    }
}
