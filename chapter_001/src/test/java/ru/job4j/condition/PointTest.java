package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int inx1 = 0, inx2 = 0, iny1 = 2, iny2 = 0;
        double expected = 2;
        double out = Point.distance(inx1, inx2, iny1, iny2);
        Assert.assertEquals(out, expected, 0.01);
    }
}
