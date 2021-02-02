package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            // case
            default -> -1;
        };
    }
   public static void main(String[] args){
     int result1 = MultipleSwitchWeek.numberOfDay("Понедельник");
     int result2 = MultipleSwitchWeek.numberOfDay("Вторник");
     int result3 = MultipleSwitchWeek.numberOfDay("Среда");
     int result4 = MultipleSwitchWeek.numberOfDay("Четверг");
     int result5 = MultipleSwitchWeek.numberOfDay("Пятница");
     int result6 = MultipleSwitchWeek.numberOfDay("Суббота");
     int result7 = MultipleSwitchWeek.numberOfDay("Воскресенье");
     System.out.println(result1);
     System.out.println(result2);
     System.out.println(result3);
     System.out.println(result4);
     System.out.println(result5);
     System.out.println(result6);
     System.out.println(result7);
    }
}