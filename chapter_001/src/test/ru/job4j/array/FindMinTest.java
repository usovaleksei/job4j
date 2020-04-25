package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindMinTest {

    //тест, когда минимальным является первое число массива
    @Test
    public void whenFirstMin() {
        Min find = new Min();
        int[] input = new int[] {0, 5, 10};
        int result = find.findMin(input);
        int expect = 0;
        assertThat(result, is(expect));
    }

    //тест, когда минимальным является последнее число массива
    @Test
    public void whenLastMin() {
        Min find = new Min();
        int[] input = new int[] {10, 5, 3};
        int result = find.findMin(input);
        int expect = 3;
        assertThat(result, is(expect));
    }

    //тест, когда минимальным является число, находящееся посередине массива
    @Test
    public void whenMiddleMin() {
        assertThat(
                Min.findMin(
                        new int[] {10, 2, 5}
                ),
                is(2)
        );
    }
}
