package com.arunveersingh.switchstatements.after.waytwo;

import java.time.Instant;

/**
 * Data object.
 * @author arunveersingh9@gmail.com
 */
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
