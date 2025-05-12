package com.example.datastoregrpcmicroservice.web.controller;

import com.example.datastoregrpcmicroservice.model.MeasurementType;
import com.example.datastoregrpcmicroservice.model.Summary;
import com.example.datastoregrpcmicroservice.model.SummaryType;
import com.example.datastoregrpcmicroservice.service.SummaryService;
import com.example.datastoregrpcmicroservice.web.dto.SummaryDto;
import com.example.datastoregrpcmicroservice.web.mapper.SummaryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/analytics")
@RequiredArgsConstructor
public class AnalyticsController {

    private final SummaryService summaryService;
    private final SummaryMapper summaryMapper;

    @GetMapping("/summary/{sensorId}")
    public SummaryDto getSummary(
            @PathVariable long sensorId,
            @RequestParam(value = "mt", required = false) Set<MeasurementType> measurementTypes,
            @RequestParam(value = "st", required = false) Set<SummaryType> summaryTypes
    ) {
        Summary summary = summaryService.get(
                sensorId,
                measurementTypes,
                summaryTypes
        );
        return summaryMapper.toDto(summary);
    }

}
