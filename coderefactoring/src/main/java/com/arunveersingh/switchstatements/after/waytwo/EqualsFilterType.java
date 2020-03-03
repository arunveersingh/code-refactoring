package com.arunveersingh.switchstatements.after.waytwo;

/**
 * @author arunveersingh9@gmail.com
 */
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
