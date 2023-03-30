package com.swamp.configurationserver.service;

import com.swamp.configurationserver.contracts.PlantConfigurationDTO;
import com.swamp.configurationserver.db.domain.PlantConfiguration;
import com.swamp.configurationserver.db.repository.PlantConfigurationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public PlantConfigurationDTO updateConfiguration(PlantConfigurationDTO configRequest) {

        Optional<PlantConfiguration> toSave = this.configRepository.findById(configRequest.getId());

        BeanUtils.copyProperties(mapper.map(configRequest, PlantConfiguration.class), toSave.get());

        PlantConfiguration saved = this.configRepository.save(toSave.get());

        return mapper.map(saved, PlantConfigurationDTO.class);
    }

    public List<PlantConfiguration> getConfigsForUser(Long userId) {
        return this.configRepository.findAllByUserId(userId);
    }

    public PlantConfigurationDTO getConfig(Long id) {
        return mapper.map(this.configRepository.findById(id).get(), PlantConfigurationDTO.class);
    }

    public PlantConfigurationDTO assignActiveConfig(PlantConfigurationDTO configRequest) {

        List<PlantConfiguration> toUnassign = this.configRepository.findAllByUserId(configRequest.getUserId());
        toUnassign.forEach(config -> {
            config.setActive(false);
        });

        this.configRepository.saveAll(toUnassign);

        PlantConfiguration saved = this.configRepository.save(mapper.map(configRequest, PlantConfiguration.class));

        return mapper.map(saved, PlantConfigurationDTO.class);
    }




}
