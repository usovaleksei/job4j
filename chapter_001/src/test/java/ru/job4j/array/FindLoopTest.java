package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    //тест, если разыскиваемый элемент массива 5 и он есть в массиве, то его индекс в массиве 0
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat (result, is(expect));
    }
    //тест, если разыскиваемый элемент массива 7 и он есть в массиве, то его индекс в массиве 5
    @Test
    public void whenArrayHas7Then5() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {2, 6, 3, 12, 4, 7, 11};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = 5;
        assertThat (result, is(expect));
    }
    //тест, если нет указанного элемента в массиве, то выводим значение "-1"
    @Test
    public void whenArrayHasNoEl() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {40, 1, 23, 17, 6, 5, 11};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat (result, is(expect));
    }

    //тест, когда есть указанный элемент в заданном диапазоне индексов массива
    @Test
    public void whenFind2() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    //тест, когда указанный элемент лежит вне зоны заданного диапазона индексов массива
    @Test
    public void whenNotFind5() {
        int[] input = new int[]{5, 2, 10, 2, 4, 11, 17};
        int value = 5;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
