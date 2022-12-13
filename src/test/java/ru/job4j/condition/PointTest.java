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

    @Test
    public void when33To91Then6dot32() {
        int x1 = 3;
        int y1 = 3;
        int x2 = 9;
        int y2 = 1;
        double expected = 6.32;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when114To15Then10dot05() {
        int x1 = 11;
        int y1 = 4;
        int x2 = 1;
        int y2 = 5;
        double expected = 10.05;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}