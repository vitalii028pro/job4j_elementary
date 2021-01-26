package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA10B0C0X1Then40() {
        int expected1 = 3;
        int expected2 = 2;
        int expected3 = 2;
        int expected4 = 1;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl1 = X2.calc(1, 1, 1, 1);
        int rsl2 = X2.calc(0, 1, 1, 1);
        int rsl3 = X2.calc(1, 1, 0, 1);
        int rsl4 = X2.calc(1, 1, 1, 0);

        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected1, rsl1);
        Assert.assertEquals(expected2, rsl2);
        Assert.assertEquals(expected3, rsl3);
        Assert.assertEquals(expected4, rsl4);
    }
}