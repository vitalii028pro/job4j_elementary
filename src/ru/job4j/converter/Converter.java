package ru.job4j.converter;

public class Converter {

    public static int a(int a1){
        int resoltEuro = a1/77;
        return resoltEuro;
    }
    public static int b(int b1){
        int resoltDol = b1/60;
        return resoltDol;
    }
    public static void main(String[] args){
        int euro  = Converter.a(100);
        int doll = Converter.b(100);
        System.out.println("154 rubles are " + euro + " euro ");
        System.out.println("120 rubles are " + doll + " doll ");

    }
}
