package com.swamp.configurationserver.db.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PotSize {

    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");


    @JsonValue
    public final String label;

    private PotSize(String label) {
        this.label = label;
    }
}
