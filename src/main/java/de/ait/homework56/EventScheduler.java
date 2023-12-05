package de.ait.homework56;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class EventScheduler {
    ArrayList<Event> listOfEvent;

    public EventScheduler() {
        listOfEvent = new ArrayList<>();
    }

    public void addEvent(Event event) {
        this.listOfEvent.add(event);
    }

    public boolean deleteEvent(Event event) {
        Iterator<Event> iteratorEvent = listOfEvent.iterator();
        while (iteratorEvent.hasNext()) {
            Event nextEvent = iteratorEvent.next();
            if (event.equals(nextEvent)) {
                iteratorEvent.remove();
                return true;
            }
        }
        System.out.println("Event non exist");
        return false;
    }


    public boolean EventDate(String dayFormat) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate parsedDate = LocalDate.parse(dayFormat, formatter);

            String forReturn = "";
            for (Event myEvent : listOfEvent) {
                LocalDate myEventDayStart = myEvent.getStartDateTime().toLocalDate();
                LocalDate myEventDayEnd = myEvent.getEndDateTime().toLocalDate();
                if ((parsedDate.isAfter(myEventDayStart) || parsedDate.isEqual(myEventDayStart)) && (parsedDate.isBefore(myEventDayEnd) || parsedDate.isEqual(myEventDayEnd))) {
                    forReturn = forReturn + myEvent.toString() + "\n";
                }
            }
            if (forReturn.equals("")) {
                System.out.println("there are no events on this date");
                return false;
            }
            System.out.println(forReturn);
            return true;
        } catch (DateTimeParseException exception) {
            System.out.println("Invalid format entered");
            return false;
        }

    }

    public boolean intersectionEvents() {
        System.out.println("the following event matches were found: ");
        Collections.sort(listOfEvent, Comparator.comparing(Event::getStartDateTime));

        for(int i =0;i< listOfEvent.size()-1;i++)
        {
            Event vorEvent = listOfEvent.get(i);
            Event nextEvent = listOfEvent.get(i+1);
            if
            (vorEvent.getEndDateTime().isAfter((nextEvent.getStartDateTime()))){
                System.out.println(vorEvent.toString()+ " and "+nextEvent.toString());
                return true;
            }
        }
        System.out.println("don´t intersection");
        return false;

        /* Решение не сработало -->

        String forReturn = "";
        boolean intersection = false;
        for (Event event1 : listOfEvent) {
            for (Event event2 : listOfEvent) {

                boolean firststartedEarlier = (event1.getStartDateTime().isBefore(event2.getStartDateTime()));
                boolean secondStartedEarlier = (event1.getStartDateTime().isAfter(event2.getStartDateTime()));
                boolean eventsStartedSameTime = (event1.getStartDateTime().isEqual(event2.getStartDateTime()));


                boolean eventIndex = (!(listOfEvent.indexOf(event1) == listOfEvent.indexOf(event2)));

                cycle:
                 if (firststartedEarlier && event1.getEndDateTime().isAfter(event2.getStartDateTime())) {
                    intersection = true;
                    break cycle;
                } else if (secondStartedEarlier && event2.getEndDateTime().isAfter(event1.getStartDateTime())) {
                    intersection = true;
                    break cycle;
                } else if (eventsStartedSameTime) {
                    intersection = true;
                    break cycle;
                } else {
                    intersection = false;
                }

                secondCircle:
                if (intersection && eventIndex) {
                    HashMap<Integer,Integer> furIndex = new HashMap<Integer, Integer>();
                    furIndex.put(listOfEvent.indexOf(event2),listOfEvent.indexOf(event1));

                    if (furIndex.isEmpty()){

                    if (furIndex.get(event1).equals(listOfEvent.indexOf(event2)))
                    {
                    break secondCircle;}}

                    forReturn = forReturn + event1.toString() + event2.toString() + "\n";
                }
            }
        }
        if (forReturn.equals("")) {
            System.out.println("don´t intersection");
            return false;
        } else {
            System.out.println(forReturn);
            return true;
        }

         */
    }


    public boolean intersectionEvents(Event event1, Event event2) {
        Event vorEvent = event1;
        Event nextEvent = event2;
        if (event1.getStartDateTime().isBefore(event2.getStartDateTime())) {
            vorEvent = event2;
            nextEvent = event1;
        }


        if (vorEvent.getEndDateTime().isAfter((nextEvent.getStartDateTime()))) {
            System.out.println("Events don´t intersection");
            return true;
        }

        System.out.println("don´t intersection");
        return false;

    }



        /* Решение не сработало-->


        boolean intersection = false;
        boolean firststartedEarlier = (event1.getStartDateTime().isBefore(event2.getStartDateTime()));
        boolean secondStartedEarlier = (event1.getStartDateTime().isAfter(event2.getStartDateTime()));
        boolean eventsStartedSameTime = (event1.getStartDateTime().isEqual(event2.getStartDateTime()));


        boolean eventIndex = (!(listOfEvent.indexOf(event1) == listOfEvent.indexOf(event2)));

        cycle:
        if (firststartedEarlier && event1.getEndDateTime().isAfter(event2.getStartDateTime())) {
            intersection = true;
            break cycle;
        } else if (secondStartedEarlier && event2.getEndDateTime().isAfter(event1.getStartDateTime())) {
            intersection = true;
            break cycle;
        } else if (eventsStartedSameTime) {
            intersection = true;
            break cycle;
        } else {
            intersection = false;
        }

        if (intersection && eventIndex) {
            System.out.println("Events don´t intersection");
            return true;
        } else {
            System.out.println("Events don´t intersection");
            return false;
        } */
    }





