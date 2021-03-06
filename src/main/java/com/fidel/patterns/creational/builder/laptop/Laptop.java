package com.fidel.patterns.creational.builder.laptop;

public class Laptop {
    private String monitorResolution;
    private String processor;
    private String memory;
    private String hdd;
    private String battery;

    public String getMonitorResolution() {
        return monitorResolution;
    }

    public void setMonitorResolution(String monitorResolution) {
        this.monitorResolution = monitorResolution;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this)
                .add("monitorResolution", monitorResolution)
                .add("processor", processor)
                .add("memory", memory)
                .add("hdd", hdd)
                .add("battery", battery)
                .toString();
    }
}
