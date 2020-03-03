package com.arunveersingh.switchstatements.after.waytwo;

import java.time.Instant;

/**
 * @author arunveersingh9@gmail.com
 */
public class BusinessClass {

    public Instant getNow(){
        return Instant.now();
    }

    public void printFilterName(Data data){
        data.getFilterType().print(this, data);
    }

    public void doSomethingElse(Data data){
        data.getFilterType().somethingElse(this, data);
    }
}
