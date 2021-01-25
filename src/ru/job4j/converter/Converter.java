package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return -1;
    }

    public static void main(String[] args) {
        int in = 140;
        int in1 = 10;
        int expected = 2;
        int expected1 = -1;
        int out = Converter.rubleToEuro(in);
        int out1 = Converter.rubleToDollar(in1);
        boolean passed = expected == out;
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("Любое число. Test result : " + passed1);

    }
}
