package com.fidel.patterns.structural.composite;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DocumentComponent implements IDocumentComponent {
    private String name;
    private List<IDocumentComponent> documentComponents;
    public DocumentComponent(String name) {
        this.name = name;
        this.documentComponents = new ArrayList<>();
    }

    @Override
    public String gatherData() {
        StringBuilder buffer = new StringBuilder();
        MessageFormat format = new MessageFormat("<{0}>{1}<{2}>");
        for (IDocumentComponent documentComponent : documentComponents) {
            buffer.append(String.format(name, documentComponent.gatherData(), name, format));
        }
        return buffer.toString();
    }

    @Override
    public void addComponent(IDocumentComponent documentComponent) {
        documentComponents.add(documentComponent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IDocumentComponent> getDocumentComponents() {
        return documentComponents;
    }

    public void setDocumentComponents(List<IDocumentComponent> documentComponents) {
        this.documentComponents = documentComponents;
    }
}
