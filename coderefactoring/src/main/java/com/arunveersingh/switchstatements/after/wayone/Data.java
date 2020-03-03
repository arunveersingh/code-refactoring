package com.arunveersingh.switchstatements.after.wayone;

import java.time.Instant;

public class Data {

    private Instant instant = Instant.now();
    private BusinessClass.FilterType filterType;

    public Data(BusinessClass.FilterType filterType){
        this.filterType = filterType;
    }

    public BusinessClass.FilterType getFilterType() {
        return filterType;
    }

    public Instant getInstant() {
        return instant;
    }
}
