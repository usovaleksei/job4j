package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    // проверка, когда первое число максимальное
    @Test
    public void WhenMaxFirst () {
        int result = SqMax.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }
    // проверка, когда второе число максимальное
    @Test
    public void WhenMaxSecond () {
        int result = SqMax.max(7, 8, 6, 5);
        assertThat(result, is(8));
    }
    // проверка, когда третье число максимальное
    @Test
    public void WhenMaxThird () {
        int result = SqMax.max(10, 12, 15, 11);
        assertThat(result, is(15));
    }
    // проверка, когда четвертое число максимальное
    @Test
    public void WhenMaxForth () {
        int result = SqMax.max(20, 21, 23, 29);
        assertThat(result, is(29));
    }
}
