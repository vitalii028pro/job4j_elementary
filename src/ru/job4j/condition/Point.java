package ru.job4j.condition;

public class Point {
    static double distance(int x1, int y1, int x2, int y2){
        double a = x2-x1;
        double b = y2-y1;
        double a1 = Math.pow(a,2);
        double b1 = Math.pow(b,2);
        double result = Math.sqrt(a1+b1);
              return result;

}
    public static void main(String[] args){
        double long1 = Point.distance(0,0,1,40);
        double long2 = Point.distance(0,1,23,40);
        double long3 = Point.distance(0,0,200,25);
        double long4 = Point.distance(0,100,200,45);
                 System.out.println("result (0, 0) to (1, 40)      " + long1);
                 System.out.println("result (0, 1) to (23, 40)    " + long2);
                 System.out.println("result (10, 10) to (10, 9)    " + long3);
                 System.out.println("result (10, 10) to (10, 9)    " + long4);
}
}
