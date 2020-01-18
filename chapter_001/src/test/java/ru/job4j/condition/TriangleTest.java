package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    //проверка, что треугольник существует
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2, 2, 2);
        assertThat(result, is(true));
    }
    //проверка, что треугольник не существует
    @Test
    public void whenNotExist() {
        boolean result = Triangle.exist(2, 8, 3);
        assertThat(result, is(false));
    }
}
