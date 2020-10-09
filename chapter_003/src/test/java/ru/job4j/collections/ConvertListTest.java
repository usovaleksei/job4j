package ru.job4j.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {1, 4, 5});
        in.add(new int[] {2, 3, 2});
        in.add(new int[] {0, 7, 10, - 1, 4});
        List<Integer> expect = Arrays.asList(1, 4, 5, 2, 3, 2, 0, 7, 10, - 1, 4);
        assertThat(ConvertList.convert(in), is(expect));
    }
}
