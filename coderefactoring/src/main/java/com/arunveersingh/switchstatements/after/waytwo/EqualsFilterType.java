package com.arunveersingh.switchstatements.after.waytwo;

public class EqualsFilterType implements FilterType {
    @Override
    public void print(BusinessClass businessClass, Data data) {
        System.out.println("EQUALS");
        data.getInstant();
    }

    @Override
    public void somethingElse(BusinessClass businessClass, Data data) {
        System.out.println("EQUALS - doSomethingElse");
    }
}
