package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class MatrixCheckTest {

    //Тест проверяет заполнена ли полностью строка с индексом 1 символами 'X'
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    //Тест проверяет заполнена ли полностью колонка с индексом 2 символами 'X'
    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    //тест проверяет заполняется ли одномерный массив элементами диагнонали двумерной матрицы
    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }

    //тест проверяет заполняется ли одномерный массив элементами диагнонали двумерной матрицы
    @Test
    public void whenDiagonalis5() {
        char[][] input = {
                {'A', ' ', ' ', ' ', ' '},
                {' ', 'b', ' ', ' ', ' '},
                {' ', ' ', 'C', ' ', ' '},
                {' ', ' ', ' ', 'd', ' '},
                {' ', ' ', ' ', ' ', 'E'},

        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'A', 'b', 'C', 'd', 'E'};
        assertThat(result, is(expect));
    }
}

