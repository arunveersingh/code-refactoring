package com.arunveersingh.switchstatements.before;

import java.time.Instant;

/**
 * Class using an enum to switch, multiple times.
 * Problem with switch statements:
 * 1. Duplication of switch code scattered across application on same keys. If a new key is introduced, all the
 * places where switch are used need to be taken care of. This will touch the code at multiple places so needs a
 * more rigorous testing.
 * 2. Open and close principle violation
 * 3. Larger chunks of code around switches to cover many scenarios makes the methods longer, generally.
 * 4. Testing a method with multiple conditions is tough to test and often need mocking and other mechanisms to
 * test the under consideration piece of code.
 * 5. Sometimes switch cases indicates need of polymorphism.
 *
 * @author arunveersingh9@gmail.com
 */
public class BusinessClass {

    public enum FilterType {
        EQUALS,
        ENUM,
        LIKE,
        DATE_RANGE,
        DECIMAL_RANGE,
        NUMERIC_RANGE,
        IN
    }

    public Instant getNow(){
        return Instant.now();
    }

    public void printFilterName(Data data){

        switch (data.getFilterType()){
            case EQUALS:
                System.out.println("EQUALS");
                data.getInstant();
                break;
            case ENUM:
                System.out.println("ENUM");
                break;
            case LIKE:
                System.out.println("LIKE");
                getNow();
                break;
            case DATE_RANGE:
                System.out.println("DATE_RANGE");
                break;
            case DECIMAL_RANGE:
                System.out.println("DECIMAL_RANGE");
                break;
            case NUMERIC_RANGE:
                System.out.println("NUMERIC_RANGE");
                break;
            case IN:
                System.out.println("IN");
                break;
        }

    }

    public void doSomethingElse(Data data){

        switch (data.getFilterType()){
            case EQUALS:
                System.out.println("EQUALS - doSomethingElse");
                data.getInstant();
                break;
            case ENUM:
                System.out.println("ENUM - doSomethingElse");
                break;
            case LIKE:
                System.out.println("LIKE - doSomethingElse");
                getNow();
                break;
            case DATE_RANGE:
                System.out.println("DATE_RANGE - doSomethingElse");
                break;
            case DECIMAL_RANGE:
                System.out.println("DECIMAL_RANGE - doSomethingElse");
                break;
            case NUMERIC_RANGE:
                System.out.println("NUMERIC_RANGE - doSomethingElse");
                break;
            case IN:
                System.out.println("IN - doSomethingElse");
                break;
        }
    }
}
