package com.fidel.patterns.structural.facade.skiholidays;

/**
 Facade. Intent. Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level
 interface that makes the subsystem easier to use.
 */
public class FacadeDemo {

    public static void main(String[] args) {
        SkiResortFacade snowHolidays = new SkiResortFacade();
        snowHolidays.haveGoodRest(170, 70, 43, 5, 5);
    }
}
