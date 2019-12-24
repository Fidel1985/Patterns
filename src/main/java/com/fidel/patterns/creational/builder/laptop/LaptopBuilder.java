package com.fidel.patterns.creational.builder.laptop;

abstract class LaptopBuilder {
    Laptop laptop;
    void createNewLaptop() {
        laptop = new Laptop();
    }
    // The method, which returns ready laptop outside
    Laptop getLaptop() {
        return laptop;
    }
    // The steps required to create a laptop
    public abstract void setMonitorResolution();
    public abstract void setProcessor();
    public abstract void setMemory();
    public abstract void setHDD();
    public abstract void setBattery();
}
