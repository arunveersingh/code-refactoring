package com.arunveersingh.switchstatements.before;

import java.time.Instant;

/**
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
