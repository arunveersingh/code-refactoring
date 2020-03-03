package com.arunveersingh.switchstatements.after.waytwo;

public class EnumFilterType implements FilterType {
    @Override
    public void print(BusinessClass businessClass, Data data) {
        System.out.println("ENUM");
    }

    @Override
    public void somethingElse(BusinessClass businessClass, Data data) {
        System.out.println("ENUM - doSomethingElse");
    }
}
