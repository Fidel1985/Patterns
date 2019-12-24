package com.fidel.patterns.creational.prototype;

import java.util.Date;

/**
 * Prototype. Intent. Specify the kinds of objects to create using a prototypical instance, and create new objects by copying
 * this prototype.
 */
public class PrototypeDemo {

    public static void main(String[] args) {
        CalendarEvent beerParty = getExistingEvent();
        CalendarEvent nextFridayEvent = (CalendarEvent)beerParty.myClone();
        nextFridayEvent.setStartDateAndTime(new Date(2016, 10, 17, 19, 0, 0));
        nextFridayEvent.getAttendees()[0].setEmail("andriybuday@liamg.com");
        nextFridayEvent.getPriority().setPriorityValue(0);
        if(beerParty.getAttendees() != nextFridayEvent.getAttendees()) {
            System.out.println("GOOD: Each event has own list of attendees.");
        }
        if(beerParty.getAttendees()[0].getEmail() == nextFridayEvent.getAttendees()[0].getEmail()) {
            System.out.println("GOOD: Update to my e-mail address will be reflected in all events.");
        }
        if(beerParty.getPriority().getPriorityValue() != nextFridayEvent.getPriority().getPriorityValue()) {
            System.out.println("GOOD: Each event should have own priority object, fully-copied.");
        }
    }

    private static CalendarEvent getExistingEvent() {
        CalendarEvent beerParty = new CalendarEvent();
        Attendee[] friends = new Attendee[1];
        Attendee andriy = new Attendee("Andriy", "Buday");
        friends[0] = andriy;

        beerParty.setAttendees(friends);
        beerParty.setStartDateAndTime(new Date(2016, 10, 12, 19, 0, 0));
        Priority priority = new Priority();
        priority.setPriorityValue(2);
        beerParty.setPriority(priority);

        return beerParty;
    }
}
