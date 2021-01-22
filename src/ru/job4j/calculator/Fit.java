package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height){
                 return (height-100)*1.15;
    }
    public static double womenWeight(short height){
                return (height-110)*1.15;
    }
    public static void main(String[] args){
            short height = 187;
           double weight1 = Fit.manWeight(height);
           double weight2 = Fit.womenWeight(height);
           System.out.println(weight1);
           System.out.println(weight2);
    }
}
