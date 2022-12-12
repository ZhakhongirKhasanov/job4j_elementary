package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To34Then5() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 4;
        int expected = 5;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}