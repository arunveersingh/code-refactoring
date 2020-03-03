package com.arunveersingh.switchstatements.after.wayone;

import java.time.Instant;

public class BusinessClass {

    public enum FilterType {
        EQUALS{
            @Override
            public void print(BusinessClass businessClass, Data data) {
                System.out.println("EQUALS");
                data.getInstant();
            }

            @Override
            public void somethingElse(BusinessClass businessClass, Data data) {
                System.out.println("EQUALS - doSomethingElse");
            }
        },
        ENUM {
            @Override
            public void print(BusinessClass businessClass, Data data) {
                System.out.println("ENUM");
            }

            @Override
            public void somethingElse(BusinessClass businessClass, Data data) {
                System.out.println("ENUM - doSomethingElse");
            }
        },
        LIKE {
            @Override
            public void print(BusinessClass businessClass, Data data) {
                System.out.println("LIKE");
                businessClass.getNow();
            }

            @Override
            public void somethingElse(BusinessClass businessClass, Data data) {
                System.out.println("LIKE - doSomethingElse");
            }
        },
        DATE_RANGE {
            @Override
            public void print(BusinessClass businessClass, Data data) {
                System.out.println("DATE_RANGE");
            }

            @Override
            public void somethingElse(BusinessClass businessClass, Data data) {
                System.out.println("DATE_RANGE - doSomethingElse");
            }
        },
        DECIMAL_RANGE {
            @Override
            public void print(BusinessClass businessClass, Data data) {
                System.out.println("DECIMAL_RANGE");
            }

            @Override
            public void somethingElse(BusinessClass businessClass, Data data) {
                System.out.println("DECIMAL_RANGE - doSomethingElse");
            }
        },
        NUMERIC_RANGE {
            @Override
            public void print(BusinessClass businessClass, Data data) {
                System.out.println("NUMERIC_RANGE");
            }

            @Override
            public void somethingElse(BusinessClass businessClass, Data data) {
                System.out.println("NUMERIC_RANGE - doSomethingElse");
            }
        },
        IN {
            @Override
            public void print(BusinessClass businessClass, Data data) {
                System.out.println("IN");
            }

            @Override
            public void somethingElse(BusinessClass businessClass, Data data) {
                System.out.println("IN - doSomethingElse");
            }
        };

        public abstract void print(BusinessClass businessClass, Data data);
        public abstract void somethingElse(BusinessClass businessClass, Data data);
    }

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
