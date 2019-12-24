package com.fidel.patterns.creational.builder.laptop;

class GamingLaptopBuilder extends LaptopBuilder {

    @Override
    public void setMonitorResolution() {
        laptop.setMonitorResolution("1900X1200");
    }

    @Override
    public void setProcessor(){
        laptop.setProcessor("Core 2 Duo, 3.2 GHz");
    }

    @Override
    public void setMemory() {
        laptop.setMemory("6144 Mb");
    }

    @Override
    public void setHDD() {
        laptop.setHdd("500 Gb");
    }

    @Override
    public void setBattery() {
        laptop.setBattery("6 lbs");
    }
}
