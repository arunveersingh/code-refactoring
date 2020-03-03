package com.arunveersingh.switchstatements.after.waytwo;

/**
 * @author arunveersingh9@gmail.com
 */
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
