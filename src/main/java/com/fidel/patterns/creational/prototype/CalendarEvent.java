package com.fidel.patterns.creational.prototype;

import java.util.Date;

import com.google.common.base.MoreObjects;

public class CalendarEvent extends CalendarPrototype {
    private Attendee[] attendees;
    private Priority priority;
    private Date startDateAndTime;

    @Override
    public CalendarPrototype myClone() {
        CalendarEvent copy = null;
        try {
            copy = (CalendarEvent)super.clone();
            Attendee[] copiedAttendees = attendees.clone();
            copy.setAttendees(copiedAttendees);
            Priority copiedPriority = (Priority)priority.clone();
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
                .add("attendees", attendees[0])
                .add("priority", priority)
                .add("startDateAndTime", startDateAndTime)
                .toString();
    }
}
