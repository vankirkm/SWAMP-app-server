package com.swamp.configurationserver.endpoints;

import com.swamp.configurationserver.contracts.PlantConfigurationDTO;
import com.swamp.configurationserver.db.domain.PlantConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.swamp.configurationserver.service.PlantConfigurationService;

import java.util.List;

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
    public PlantConfigurationDTO updateConfig(@RequestBody @Validated PlantConfigurationDTO config) throws Exception {

        System.out.println("Received request to update a config");

        return this.configService.updateConfiguration(config);

    }

    @GetMapping("/config/{id}")
    public PlantConfigurationDTO getConfig(@PathVariable Long id) throws Exception {

        System.out.println("Received request to get config id: " + id);

        return this.configService.getConfig(id);

    }

    @GetMapping("/{userId}")
    public List<PlantConfiguration> getConfigsForUser(@PathVariable Long userId) throws Exception {

        System.out.println("Received request to get configs for user: " + userId);

        return this.configService.getConfigsForUser(userId);

    }

    @PutMapping("active-config")
    public void assignActiveConfig(@RequestBody @Validated PlantConfigurationDTO config) throws Exception {

        System.out.println("Received request to update a config");

        this.configService.assignActiveConfig(config);

    }
}
