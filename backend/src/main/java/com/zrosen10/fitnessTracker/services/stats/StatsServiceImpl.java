package com.zrosen10.fitnessTracker.services.stats;

import org.springframework.stereotype.Service;

import com.zrosen10.fitnessTracker.dto.StatsDTO;
import com.zrosen10.fitnessTracker.repository.ActivityRepository;
import com.zrosen10.fitnessTracker.repository.GoalRepository;
import com.zrosen10.fitnessTracker.repository.WorkoutRepository;
import lombok.RequiredArgsConstructor;

/**
 * Implementation of the StatsService interface.
 * Provides concrete implementation for retrieving statistics about fitness
 * goals and activities.
 * Uses GoalRepository to access goal data, ActivityRepository to access
 * activity data, and WorkoutRepository to access workout data for statistics
 * calculations.
 */
@Service
@RequiredArgsConstructor
public class StatsServiceImpl implements StatsService {

    /**
     * Repository for accessing goal data.
     */
    private final GoalRepository goalRepository;

    /**
     * Repository for accessing activity data.
     */
    private final ActivityRepository activityRepository;

    /**
     * Repository for accessing workout data.
     */
    private final WorkoutRepository workoutRepository;

    /**
     * Retrieves aggregated statistics about fitness goals and activities.
     * Calculates:
     * - Count of achieved and not achieved goals
     * - Total steps across all activities
     * - Total distance covered across all activities
     * - Total calories burned across all activities and workouts
     * - Total duration of all workouts
     * 
     * Returns default values (0 or 0.0) if null values are returned from the
     * repositories.
     * 
     * @return StatsDTO containing all aggregated statistics
     */
    @Override
    public StatsDTO getStats() {

        // Query the repository for goal counts by achievement status
        Long achievedGoals = goalRepository.countAchievedGoals();
        Long notAchievedGoals = goalRepository.countNotAchievedGoals();

        // Query the repository for activity metrics across all activities
        Integer totalSteps = activityRepository.getTotalSteps();
        Double totalDistance = activityRepository.getTotalDistance();
        Integer totalActivityCaloriesBurned = activityRepository.getTotalActivityCalories();

        // Query the repository for workout metrics across all workouts
        Integer totalWorkoutDuration = workoutRepository.getTotalDuration();
        Integer totalWorkoutCaloriesBurned = workoutRepository.getTotalCaloriesBurned();

        int totalCaloriesBurned = (totalActivityCaloriesBurned != null ? totalActivityCaloriesBurned : 0)
                + (totalWorkoutCaloriesBurned != null ? totalWorkoutCaloriesBurned : 0);

        // Create and populate the DTO with collected statistics (defaulting to 0 if
        // null)
        StatsDTO dto = new StatsDTO();
        dto.setAchievedGoals(achievedGoals != null ? achievedGoals : 0);
        dto.setNotAchievedGoals(notAchievedGoals != null ? notAchievedGoals : 0);

        dto.setSteps(totalSteps != null ? totalSteps : 0);
        dto.setDistance(totalDistance != null ? totalDistance : 0.0);
        dto.setTotalCaloriesBurned(totalCaloriesBurned);
        dto.setDuration(totalWorkoutDuration != null ? totalWorkoutDuration : 0);

        return dto;
    }

}
