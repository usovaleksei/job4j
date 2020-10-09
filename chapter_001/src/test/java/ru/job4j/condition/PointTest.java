package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    //проверка расстояния между точками в двухмерном пространстве
    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(out, expected, 0.01);
    }

    //проверка расстояния между точками в трехмерном пространстве
    @Test
    public void distance3d() {
        Point c = new Point(0, 0, 0);
        Point d = new Point(0, 2, 2);
        double expected = 2.82;
        double out = c.distance3d(d);
        Assert.assertEquals(out, expected, 0.01);
    }
}
