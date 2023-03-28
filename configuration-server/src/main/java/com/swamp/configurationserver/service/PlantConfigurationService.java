package com.swamp.configurationserver.service;

import com.swamp.configurationserver.contracts.PlantConfigurationDTO;
import com.swamp.configurationserver.db.domain.PlantConfiguration;
import com.swamp.configurationserver.db.repository.PlantConfigurationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantConfigurationService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private PlantConfigurationRepository configRepository;


    public PlantConfigurationDTO createNewConfiguration(PlantConfigurationDTO configRequest) {

        PlantConfiguration saved = this.configRepository.save(mapper.map(configRequest, PlantConfiguration.class));

        return mapper.map(saved, PlantConfigurationDTO.class);
    }



}
