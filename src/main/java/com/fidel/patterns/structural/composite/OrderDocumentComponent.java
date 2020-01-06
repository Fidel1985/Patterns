package com.fidel.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class OrderDocumentComponent implements IDocumentComponent {
    private int id;
    List<String> orders;

    public OrderDocumentComponent(int id) {
        this.id = id;
        this.orders = new ArrayList<>();
    }

    @Override
    public String gatherData() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<Order>");
        for (String order : orders) {
            buffer.append(order).append(";");
        }
        buffer.append("</Order>");
        return buffer.toString();
    }

    @Override
    public void addComponent(IDocumentComponent documentComponent) {
        System.out.println("Cannot add to leaf...");
    }

    public void addOrder(String order) {
        orders.add(order);
    }
}
