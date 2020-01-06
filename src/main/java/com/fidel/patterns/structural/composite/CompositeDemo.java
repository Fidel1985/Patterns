package com.fidel.patterns.structural.composite;

/**
 * Composite. Intent. Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients
 * treat individual objects and compositions of objects uniformly.
 */
public class CompositeDemo {
    public static void main(String[] args) {
        DocumentComponent document = new DocumentComponent("ComposableDocument");
        HeaderDocumentComponent headerDocumentComponent = new HeaderDocumentComponent();
        DocumentComponent body = new DocumentComponent("Body");
        document.addComponent(headerDocumentComponent);
        document.addComponent(body);

        CustomerDocumentComponent customerDocumentComponent = new CustomerDocumentComponent(41);
        DocumentComponent orders = new DocumentComponent("Orders");
        OrderDocumentComponent order0 = new OrderDocumentComponent(0);
        OrderDocumentComponent order1 = new OrderDocumentComponent(1);
        order0.addOrder("Kindle");
        order0.addOrder("Book1");
        order0.addOrder("Book2");
        order1.addOrder("Phone");
        order1.addOrder("Cable");
        order1.addOrder("Handset");

        orders.addComponent(order0);
        orders.addComponent(order1);
        body.addComponent(customerDocumentComponent);
        body.addComponent(orders);

        String gatheredData = document.gatherData();
        System.out.println(gatheredData);
    }
}
