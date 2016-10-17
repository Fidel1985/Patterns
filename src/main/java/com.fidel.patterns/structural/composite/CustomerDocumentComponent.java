package com.fidel.patterns.structural.composite;

import java.text.MessageFormat;

public class CustomerDocumentComponent implements IDocumentComponent {
    private int customerIdToGatherData;
    public CustomerDocumentComponent(int customerIdToGatherData) {
        this.customerIdToGatherData = customerIdToGatherData;
    }

    @Override
    public String gatherData() {
        String customerData;
        switch (customerIdToGatherData) {
            case 41: customerData = "Andriy Buday";
                break;
            default: customerData = "Someone else";
                break;
        }
        MessageFormat format = new MessageFormat("<Customer>{0}</Customer>");
        return String.format(customerData, format);
    }

    @Override
    public void addComponent(IDocumentComponent documentComponent) {
        System.out.println("Cannot add to leaf...");
    }
}
