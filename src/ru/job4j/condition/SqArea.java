package ru.job4j.condition;

public class SqArea {
    public static double square(double p,double k){
       double h = p / (2 * (k + 1));
         double l = h * k;
          return l * h;
    }
        public static void main(String[] args){
           double result1 = SqArea.square(6,2);
           double result2 = SqArea.square(10,3);
        System.out.println(" p = 6, k = 2, s = 2, real =   " + result1);
        System.out.println(" p = 10, k = 3   real =   " + result2);
    }
}
