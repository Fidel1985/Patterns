package com.fidel.patterns.creational.prototype;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Prototype. Intent. Specify the kinds of objects to create using a prototypical instance, and create new objects by copying
 * this prototype.
 */
public class PrototypeDemo {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) throws ParseException {
        CalendarEvent beerParty = getExistingEvent();
        CalendarEvent nextFridayEvent = (CalendarEvent) beerParty.myClone();
        nextFridayEvent.setStartDateAndTime(dateFormat.parse("14/10/2016 20:00:00"));
        nextFridayEvent.getAttendees()[0].setEmail("andriybuday@liamg.com");
        nextFridayEvent.setPriority(Priority.MEDIUM);
        System.out.println("beerParty: " + beerParty);
        System.out.println("nextFridayEvent: " + nextFridayEvent);
        if(beerParty.getAttendees() != nextFridayEvent.getAttendees()) {
            System.out.println("GOOD: Each event has own list of attendees.");
        }
        if(beerParty.getAttendees()[0].getEmail().equals(nextFridayEvent.getAttendees()[0].getEmail())) {
            System.out.println("GOOD: Update to my e-mail address will be reflected in all events.");
        }
        if(beerParty.getPriority() != nextFridayEvent.getPriority()) {
            System.out.println("GOOD: Each event should have own priority object, fully-copied.");
        }
    }

    private static CalendarEvent getExistingEvent() throws ParseException {
        CalendarEvent beerParty = new CalendarEvent();
        Attendee[] friends = new Attendee[1];
        Attendee andriy = new Attendee("Andriy", "Buday");
        friends[0] = andriy;

        beerParty.setAttendees(friends);
        beerParty.setStartDateAndTime(dateFormat.parse("07/10/2016 19:00:00"));
        beerParty.setPriority(Priority.HIGH);

        return beerParty;
    }
}
