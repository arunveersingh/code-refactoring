package com.arunveersingh.switchstatements.after.waytwo;

public class DateRangeFilterType implements FilterType {
    @Override
    public void print(BusinessClass businessClass, Data data) {
        System.out.println("DATE_RANGE");
    }

    @Override
    public void somethingElse(BusinessClass businessClass, Data data) {
        System.out.println("DATE_RANGE - doSomethingElse");
    }
}
