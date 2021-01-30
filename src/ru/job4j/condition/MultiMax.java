package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
         if (second > third){
             if (second > first){
                 result = second;
             }
         }
         else {
             if(third > first){
                 result = third;
             }
         }
        return result;
    }
    public static void main(String[] args){
         int result = MultiMax.max(20,20,200);
         System.out.println(result);
    }
}