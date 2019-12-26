package com.fidel.patterns.creational.prototype.event;

import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

import com.google.common.base.MoreObjects;

/**
 * This is actual Prototype object
 */
public class CalendarEvent extends CalendarPrototype {
    private Attendee[] attendees;
    private Priority priority;
    private Date startDateAndTime;

    @Override
    public CalendarPrototype myClone() {
        CalendarEvent copy = null;
        try {
            copy = (CalendarEvent) super.clone();
            Attendee[] copiedAttendees = this.attendees.clone();
            copy.setAttendees(copiedAttendees);
            Priority copiedPriority = this.priority;
            copy.setPriority(copiedPriority);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }

    public Attendee[] getAttendees() {
        return attendees;
    }

    public void setAttendees(Attendee[] attendees) {
        this.attendees = attendees;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Date getStartDateAndTime() {
        return startDateAndTime;
    }

    public void setStartDateAndTime(Date startDateAndTime) {
        this.startDateAndTime = startDateAndTime;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("attendees", Arrays.stream(attendees).map(Attendee::toString).collect(Collectors.joining()))
                .add("priority", priority)
                .add("startDateAndTime", startDateAndTime)
                .toString();
    }
}
