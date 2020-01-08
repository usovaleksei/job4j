package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class MinDiapasonTest {

    //тест, когда минимальное число стоит первым в указанном диапазоне массива элементов
    @Test
    public void whenFirstMin () {
        assertThat(
                MinDiapason.findMin(
                        new int[] {-1, 0, 5, 10}, 1,3
                ),
                is(0)
        );
    }

    //тест, когда минимальное число стоит последним в указанном диапазоне массива элементов
    @Test
    public void whenLastMin () {
        assertThat(
                MinDiapason.findMin(
                        new int[] {-5, -3, 1, 0, -12, 10}, 1,4
                ),
                is(-12)
        );
    }

    //тест, когда минимальное число стоит посередине в указанном диапазоне массива элементов
    @Test
    public void whenMiddleMin () {
        assertThat(
                MinDiapason.findMin(
                        new int[] {-5, -3, 1, 0, -12, 10}, 3,5
                ),
                is(-12)
        );
    }
}
