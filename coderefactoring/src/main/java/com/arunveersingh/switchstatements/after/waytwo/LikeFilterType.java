package com.arunveersingh.switchstatements.after.waytwo;

/**
 * @author arunveersingh9@gmail.com
 */
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
