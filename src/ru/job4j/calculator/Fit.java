package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height){
        double rsl = (height-100)*1.15;
        return rsl;
    }
    public static double womenWeight(short height){
        double rsl = (height-110)*1.15;
        return rsl;
    }
    public static void main(String[] args){
            short height = 187;
           double weight1 = Fit.manWeight(height);
           double weight2 = Fit.womenWeight(height);
           System.out.println(weight1);
           System.out.println(weight2);
    }
}
