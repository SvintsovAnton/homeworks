package de.ait.enums;

public class Main {
    public static void main(String[] args) {
        DayUtil today = new DayUtil(29,Day.WENSDAY,Seasons.WINTER);

        System.out.println(today.dayOfWeek);

        today.setDayOfWeek(Day.FRIDAY);
     //   System.out.println(today.dayOfWeek);
       // System.out.println(today.getDayOfWeek());


        System.out.println();


    }
}
