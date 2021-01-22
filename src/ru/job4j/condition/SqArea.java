package ru.job4j.condition;

public class SqArea {
    public static double height(double p,double k){
          return p / (2 * (k + 1));
    }
        public static void main(String[] args){
        double p = 6;
        double k = 2;
        double resultH = SqArea.height(p,k);
        double resultL = resultH*k;
        double resultS = resultH*resultL;
        System.out.println(" p = 6, k = 2, s = 2, real =   " + "Longer = " + resultL + "   height = " + resultH);
    }
}
