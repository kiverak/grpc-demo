package com.example.datastoregrpcmicroservice.repository;

import com.example.datastoregrpcmicroservice.model.Data;
import com.example.datastoregrpcmicroservice.model.MeasurementType;
import com.example.datastoregrpcmicroservice.model.Summary;
import com.example.datastoregrpcmicroservice.model.SummaryType;

import java.util.Optional;
import java.util.Set;

public interface SummaryRepository {

    Optional<Summary> findBySensorId(
            long sensorId,
            Set<MeasurementType> measurementTypes,
            Set<SummaryType> summaryTypes
    );

    void handle(
            Data data
    );

}
