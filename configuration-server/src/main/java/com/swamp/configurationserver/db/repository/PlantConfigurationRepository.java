package com.swamp.configurationserver.db.repository;

import com.swamp.configurationserver.db.domain.PlantConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlantConfigurationRepository extends JpaRepository<PlantConfiguration, Long> {

    List<PlantConfiguration> findAllByUserId(Long userId);

}