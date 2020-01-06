package com.fidel.patterns.structural.composite;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

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
        buffer.append(MessageFormat.format("<{0}>\n", name));
        for (IDocumentComponent documentComponent : documentComponents) {
            buffer.append(documentComponent.gatherData()).append("\n");
        }
        buffer.append(MessageFormat.format("</{0}>", name));
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
