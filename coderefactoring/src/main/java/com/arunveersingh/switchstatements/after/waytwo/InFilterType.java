package com.arunveersingh.switchstatements.after.waytwo;

public class InFilterType implements FilterType {
    @Override
    public void print(BusinessClass businessClass, Data data) {
        System.out.println("IN");
    }

    @Override
    public void somethingElse(BusinessClass businessClass, Data data) {
        System.out.println("IN - doSomethingElse");
    }
}
