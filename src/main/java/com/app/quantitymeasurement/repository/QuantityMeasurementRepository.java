package com.app.quantitymeasurement.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.quantitymeasurement.model.QuantityMeasurementEntity;

import java.util.List;

public interface QuantityMeasurementRepository extends JpaRepository<QuantityMeasurementEntity, Long> {

    List<QuantityMeasurementEntity> findByOperation(String operation);

	List<QuantityMeasurementEntity> findByThisMeasurementType(String type);

	long countByOperationAndErrorFalse(String operation);
	
	List<QuantityMeasurementEntity> findByErrorTrue();
}