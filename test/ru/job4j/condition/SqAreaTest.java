package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class SqAreaTest {

    @Test
    public void squareTest() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void squareTest1(){
        int expected = 4;
        int p = 10;
        int k = 3;
        double out = SqArea.square(p,k);
        Assert.assertEquals(expected,out,0.69);
    }

    @Test
    public void square() {
    }
}