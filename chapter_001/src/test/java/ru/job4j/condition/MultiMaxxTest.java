package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MultiMaxxTest {
    //тест максимальное первое число
    @Test
    public void whenFirstMax() {
        MultiMaxx check = new MultiMaxx();
        int result = check.max(5, 3, 3);
        assertThat(result, is(5));
    }

    //тест максимальное второе число
    @Test
    public void whenSecondMax() {
        MultiMaxx check = new MultiMaxx();
        int result = check.max(2, 7, 3);
        assertThat(result, is(7));
    }

    //тест максимальное третье число
    @Test
    public void whenThirdMax() {
        MultiMaxx check = new MultiMaxx();
        int result = check.max(5, 3, 10);
        assertThat(result, is(10));
    }

    //тест все числа равны
    @Test
    public void whenEqualsMax() {
        MultiMaxx check = new MultiMaxx();
        int result = check.max(5, 5, 5);
        assertThat(result, is(5));
    }
}
