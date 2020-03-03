package com.arunveersingh.switchstatements.after.waytwo;

import java.time.Instant;

public class Data {

    private Instant instant = Instant.now();
    private FilterType filterType;

    public Data(FilterType filterType){
        this.filterType = filterType;
    }

    public FilterType getFilterType() {
        return filterType;
    }

    public Instant getInstant() {
        return instant;
    }
}
