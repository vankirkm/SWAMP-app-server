package com.swamp.configurationserver.contracts;

import com.swamp.configurationserver.db.domain.PlantType;
import com.swamp.configurationserver.db.domain.PotSize;
import lombok.Data;

@Data
public class PlantConfigurationDTO {

    private Long id;

    private String configName;

    private Long userId;

    private double desiredMoistureLevel;

    private double desiredLightLevel;

    private PlantType plantType;

    private PotSize potSize;

    private boolean isActive;
}
