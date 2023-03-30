package com.swamp.configurationserver.db.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PlantType {

    SUCCULENT("Succulent"),
    CACTUS("Cactus");

    @JsonValue
    public final String label;


    private PlantType(String label) {
        this.label = label;
    }

}
