package com.fidel.patterns.creational.prototype;

public class CalendarPrototype implements Cloneable {
    CalendarPrototype myClone() {
        try {
            return (CalendarPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
