package com.swamp.configurationserver.db.repository;

import com.swamp.configurationserver.db.domain.PlantConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantConfigurationRepository extends JpaRepository<PlantConfiguration, Long> {

    public PlantConfiguration getByConfigId(Long configId);

}