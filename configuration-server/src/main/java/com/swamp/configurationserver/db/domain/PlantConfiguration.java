package com.swamp.configurationserver.db.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlantConfiguration {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long configId;

    private String configName;

    private double desiredMoistureLevel;

    private double desiredLightLevel;

    @Enumerated(EnumType.STRING)
    private PlantType plantType;

    @Enumerated(EnumType.STRING)
    private PotSize potSize;
}
