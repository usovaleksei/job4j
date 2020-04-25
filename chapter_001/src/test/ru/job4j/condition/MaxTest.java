package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then1() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void when2equals1Then() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    //тест работы перегруженного метода для трех чисел
    @Test
    public void whenMax1To3Then2() {
        int result = Max.max(5, 7,2);
        assertThat(result, is(7));
    }

    //тест работы перегруженного метода для четырех чисел
    @Test
    public void whenMax1To4Then3() {
        int result = Max.max(5, 7,11, 4);
        assertThat(result, is(11));
    }
}