package de.ait.timeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class TimeUtil {
    public static void main(String[] args) {

        /*

    LocalDate localDate =LocalDate.now();
        System.out.println(localDate);

        ZoneId zoneId = ZoneId.of("Africa/Addis_Ababa");
        LocalDate localDate1AUS = LocalDate.now(zoneId);
        System.out.println(localDate1AUS);

        //Почему мы не инициализируем объекты класса LocalDate через new, это же ссылочная переменная.

        LocalDate localDate1 =LocalDate.of(2000, Month.APRIL,5);
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2000,100);
        System.out.println(localDate2);

        localDate= localDate.plusDays(57);
        System.out.println(localDate);
        LocalTime time = LocalTime.of(20,00,00);
        System.out.println(time);
        time = time.plusHours(2);
        System.out.println(time);
*/

        LocalTime timeFromSecond = LocalTime.ofSecondOfDay(85800);
        System.out.println(timeFromSecond);
}}