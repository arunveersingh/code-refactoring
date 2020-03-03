package com.arunveersingh.switchstatements.after.waytwo;

/**
 * @author arunveersingh9@gmail.com
 */
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
