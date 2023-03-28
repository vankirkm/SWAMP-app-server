package com.swamp.configurationserver.db.domain;

public enum PotSize {

    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");


    public final String label;

    private PotSize(String label) {
        this.label = label;
    }
}
