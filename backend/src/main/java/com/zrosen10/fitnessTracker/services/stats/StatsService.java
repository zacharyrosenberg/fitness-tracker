package com.zrosen10.fitnessTracker.services.stats;

import com.zrosen10.fitnessTracker.dto.StatsDTO;

/**
 * Service interface for managing fitness goal statistics.
 * Defines operations for retrieving aggregated statistics related to fitness
 * goals.
 */
public interface StatsService {

    /**
     * Retrieves aggregated statistics about fitness goals.
     * Calculates the count of achieved and not achieved goals.
     * 
     * @return StatsDTO containing the aggregated goal statistics
     */
    StatsDTO getStats();

}
