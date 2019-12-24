package com.fidel.patterns.structural.composite;

/**
 * Composite. Intent. Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients
 * treat individual objects and compositions of objects uniformly.
 */
public class CompositeDemo {
    public static void main(String[] args) {
        DocumentComponent document = new DocumentComponent("ComposableDocument");
        DocumentComponent body = new DocumentComponent("Body");
        document.addComponent(body);

        CustomerDocumentComponent customerDocumentComponent = new CustomerDocumentComponent(41);
        DocumentComponent orders = new DocumentComponent("Orders");
        body.addComponent(customerDocumentComponent);
        String gatheredData = document.gatherData();
        System.out.println(gatheredData);
    }
}
