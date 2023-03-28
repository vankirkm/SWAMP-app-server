package com.swamp.configurationserver.db.domain;

public enum PlantType {

    SUCCULENT("Succulent"),
    CACTUS("Cactus");

    public final String label;

    private PlantType(String label) {
        this.label = label;
    }

}
