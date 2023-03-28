package com.swamp.configurationserver.endpoints;

import com.swamp.configurationserver.contracts.PlantConfigurationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.swamp.configurationserver.service.PlantConfigurationService;

@RestController
@RequestMapping("configs")
public class PlantConfigurationController {

    @Autowired
    private PlantConfigurationService configService;

    @PostMapping()
    public void createNewConfig(@RequestBody @Validated PlantConfigurationDTO config) throws Exception {

        System.out.println("Received request to create a new config");

        this.configService.createNewConfiguration(config);

    }

    @PutMapping()
    public void updateConfig(@RequestBody @Validated PlantConfigurationDTO config) throws Exception {

        System.out.println("Received request to update a config");

        this.configService.createNewConfiguration(config);

    }
}
