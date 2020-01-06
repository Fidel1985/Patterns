package com.fidel.patterns.structural.composite;

import java.text.MessageFormat;
import java.util.Date;

public class HeaderDocumentComponent implements IDocumentComponent {
    private Date date;

    public HeaderDocumentComponent() {
        this.date = new Date();
    }

    @Override
    public String gatherData() {
        String pattern = "<Header>\n<MessageTime>{0}</MessageTime>\n</Header>";
        return MessageFormat.format(pattern, date.toString());
    }

    @Override
    public void addComponent(IDocumentComponent documentComponent) {
        System.out.println("Cannot add to leaf...");
    }
}
