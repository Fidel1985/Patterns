package com.fidel.patterns.structural.facade.skiholidays;

public class FacadeDemo {

    public static void main(String[] args) {
        SkiResortFacade snowHolidays = new SkiResortFacade();
        snowHolidays.haveGoodRest(170, 70, 43, 5, 5);
    }
}
