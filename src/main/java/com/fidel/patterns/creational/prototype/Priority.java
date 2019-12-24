package com.fidel.patterns.creational.prototype;

import com.google.common.base.MoreObjects;

public class Priority implements Cloneable {
    private int priorityValue;

    public int getPriorityValue() {
        return priorityValue;
    }

    public void setPriorityValue(int priorityValue) {
        this.priorityValue = priorityValue;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("priorityValue", priorityValue)
                .toString();
    }
}
