package com.fidel.patterns.structural.composite;

interface IDocumentComponent {
    String gatherData();
    void addComponent(IDocumentComponent documentComponent);
}
