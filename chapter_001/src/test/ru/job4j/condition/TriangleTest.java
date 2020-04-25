package ru.job4j.condition;

import org.junit.Assert;
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
    //проверка правильности расчета площади треугольника
    @Test
    public void trueArea() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 2);
        Triangle d = new Triangle(a, b, c);
        double expected = 1.99;
        double out = d.area();
        Assert.assertEquals(out, expected, 0.01);
    }
}
