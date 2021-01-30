package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > third && second > first) {
           result = second;
            }
        else {
            if(third > first){
                result = third;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int result = ThreeMax.max(10,3,2);
       System.out.println(result);
    }
}
