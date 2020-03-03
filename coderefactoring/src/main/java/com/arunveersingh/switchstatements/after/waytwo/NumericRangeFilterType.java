package com.arunveersingh.switchstatements.after.waytwo;

public class NumericRangeFilterType implements FilterType {
    @Override
    public void print(BusinessClass businessClass, Data data) {
        System.out.println("NUMERIC_RANGE");
    }

    @Override
    public void somethingElse(BusinessClass businessClass, Data data) {
        System.out.println("NUMERIC_RANGE - doSomethingElse");
    }
}
