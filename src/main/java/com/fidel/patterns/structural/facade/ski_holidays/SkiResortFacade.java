package com.fidel.patterns.structural.facade.ski_holidays;

public class SkiResortFacade {
    private SkiRent skiRent = new SkiRent();
    private SkiResortTicketSystem skiResortTicketSystem = new SkiResortTicketSystem();
    private HotelBookingSystem hotelBookingSystem = new HotelBookingSystem();

    public int haveGoodRest(int height, int weight, int feetSize, int skierLevel, int roomQuality)
    {
        int skiPrice = skiRent.rentSki(weight, skierLevel);
        int skiBootsPrice = skiRent.rentBoots(feetSize, skierLevel);
        int polePrice = skiRent.rentPole(height);
        int oneDayTicketPr = skiResortTicketSystem.buyOneDayTicket();
        int hotelPrice = hotelBookingSystem.bookRoom(roomQuality);
        return skiPrice + skiBootsPrice + polePrice + oneDayTicketPr + hotelPrice;
    }

    public int haveRestWithOwnSkis()
    {
        return skiResortTicketSystem.buyOneDayTicket();
    }

}
