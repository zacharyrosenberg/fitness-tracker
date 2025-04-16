package com.zrosen10.fitnessTracker.services.stats;

import org.springframework.stereotype.Service;

import com.zrosen10.fitnessTracker.dto.StatsDTO;
import com.zrosen10.fitnessTracker.repository.GoalRepository;

import lombok.RequiredArgsConstructor;

/**
 * Implementation of the StatsService interface.
 * Provides concrete implementation for retrieving statistics about fitness
 * goals.
 * Uses GoalRepository to access goal data for statistics calculations.
 */
@Service
@RequiredArgsConstructor
public class StatsServiceImpl implements StatsService {

    private final GoalRepository goalRepository;

    /**
     * Retrieves aggregated statistics about fitness goals.
     * Calculates the count of achieved and not achieved goals using repository
     * methods.
     * Returns default values of 0 if null values are returned from the repository.
     * 
     * @return StatsDTO containing counts of achieved and not achieved goals
     */
    @Override
    public StatsDTO getStats() {

        // Query the repository for goal counts by achievement status
        Long achievedGoals = goalRepository.countAchievedGoals();
        Long notAchievedGoals = goalRepository.countNotAchievedGoals();

        // Create and populate the DTO with counts (defaulting to 0 if null)
        StatsDTO dto = new StatsDTO();
        dto.setAchievedGoals(achievedGoals != null ? achievedGoals : 0);
        dto.setNotAchievedGoals(notAchievedGoals != null ? notAchievedGoals : 0);

        return dto;
    }

}
