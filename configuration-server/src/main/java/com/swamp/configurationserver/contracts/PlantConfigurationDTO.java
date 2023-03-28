package com.swamp.configurationserver.contracts;

import com.swamp.configurationserver.db.domain.PlantType;
import lombok.Data;

@Data
public class PlantConfigurationDTO {

    private Long configId;

    private String configName;

    private double desiredMoistureLevel;

    private double desiredLightLevel;

    private PlantType plantType;
}
