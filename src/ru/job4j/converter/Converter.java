package ru.job4j.converter;

public class Converter {


    public static int rubleToEuro(int value) {
        return value / 90;
    }

    public static int rubleToDollar(int value) {
        return value / 70;
    }

    public static void main(String[] args) {
        int in = 180;
        int in1 = 140;
        int expected = 2;
        int expected1 = 2;
        int out = Converter.rubleToEuro(in);
        int out1 = Converter.rubleToDollar(in1);
        boolean passed = expected == out;
        boolean passed1 = expected1 == out1;
        System.out.println("180 rubles are 2 Euro. Test result : " + passed);
        System.out.println("140 rebles are 2 Dollar. Test result : " + passed1);
    }
}
