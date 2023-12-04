package de.ait.timeapi;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDataTimeUtil {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        ZoneId zoneId = ZoneId.of("Africa/Addis_Ababa");
        LocalDateTime localTimeAUS = LocalDateTime.now(zoneId);
        System.out.println(localTimeAUS);

        LocalDateTime localDateTime1 = LocalDateTime.of(2000,01,01,12,30,00);
        localDateTime1.plusHours(15);
        localDateTime1.atZone(zoneId);
        System.out.println(localDateTime1);


    }
}
