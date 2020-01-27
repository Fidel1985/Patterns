package com.fidel.patterns.structural.decorator.dataprocessor;

public interface DataSource {

    void writeData(String data);
    String readData();
}
