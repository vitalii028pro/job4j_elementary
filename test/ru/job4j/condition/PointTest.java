package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when0and1to23then40(){
        int expected = 45;
        int x1 = 0;
        int y1 = 1;
        int x2 = 23;
        int y2 = 40;
        double out = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected, out, 0.28);
    }
    @Test
    public void when00to200then25() {
        int expected = 201;
        int x1 = 0;
        int y1 = 0;
        int x2 = 200;
        int y2 = 25;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.56);
    }
    @Test
    public void when0and100to200then45(){
        int expected = 207;
        int x1 = 0;
        int y1 = 100;
        int x2 = 200;
        int y2 = 45;
        double out = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected, out, 0.43);
    }
}