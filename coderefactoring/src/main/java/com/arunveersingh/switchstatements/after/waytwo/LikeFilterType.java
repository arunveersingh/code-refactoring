package com.arunveersingh.switchstatements.after.waytwo;

public class LikeFilterType implements FilterType {
    @Override
    public void print(BusinessClass businessClass, Data data) {
        System.out.println("LIKE");
        businessClass.getNow();
    }

    @Override
    public void somethingElse(BusinessClass businessClass, Data data) {
        System.out.println("LIKE - doSomethingElse");
    }
}
