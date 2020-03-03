package com.arunveersingh.switchstatements.after.waytwo;

/**
 * @author arunveersingh9@gmail.com
 */
public class DecimalRangeFilterType implements FilterType {
    @Override
    public void print(BusinessClass businessClass, Data data) {
        System.out.println("DECIMAL_RANGE");
    }

    @Override
    public void somethingElse(BusinessClass businessClass, Data data) {
        System.out.println("DECIMAL_RANGE - doSomethingElse");
    }
}
