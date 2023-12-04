package de.ait.homework56;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        LocalDateTime timeBre = LocalDateTime.of(2023, 12, 05, 07, 00);
        Event brekfast = new Event("Завтрак", LocalDateTime.of(2023, 12, 05, 07, 00), LocalDateTime.of(2023, 12, 05, 07, 30));
        Event work = new Event("Работа", LocalDateTime.of(2023, 12, 05, 07, 30), LocalDateTime.of(2023, 12, 05, 12, 00));
        Event meeting = new Event("Mieting", LocalDateTime.of(2023, 12, 05, 9, 30), LocalDateTime.of(2023, 12, 05, 11, 00));


        EventScheduler eventScheduler = new EventScheduler();
        eventScheduler.addEvent(brekfast);
        eventScheduler.addEvent(work);
        eventScheduler.addEvent(meeting);

//eventScheduler.EventDate("05.12.2023");

        eventScheduler.intersectionEvents(meeting, work);

        eventScheduler.intersectionEvents();


    }
}