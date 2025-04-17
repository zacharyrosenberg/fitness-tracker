package com.zrosen10.fitnessTracker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zrosen10.fitnessTracker.dto.GraphDTO;
import com.zrosen10.fitnessTracker.services.stats.StatsService;

import lombok.RequiredArgsConstructor;

/**
 * REST Controller for handling statistics-related HTTP requests.
 * Provides endpoints for retrieving aggregated statistics about fitness goals.
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class StatsController {

    private final StatsService statsService;

    /**
     * Retrieves aggregated statistics about fitness goals.
     * Returns counts of achieved and not achieved goals.
     * 
     * @return ResponseEntity with StatsDTO containing the aggregated statistics
     */
    @GetMapping("/stats")
    public ResponseEntity<?> getStats() {
        return ResponseEntity.ok(statsService.getStats());
    }

    /**
     * Retrieves the last 7 workouts and activities for the dashboard graph.
     * 
     * @return ResponseEntity with GraphDTO containing the last 7 workouts and
     *         activities
     */
    @GetMapping("/graphs")
    public ResponseEntity<?> getGraphStats() {
        GraphDTO graphDTO = statsService.getGraphStats();

        if (graphDTO != null) {
            return ResponseEntity.ok(graphDTO);
        } else {
            return ResponseEntity.status(404).body(null);
        }
    }

}
