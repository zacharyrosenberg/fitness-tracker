package com.zrosen10.fitnessTracker.services.goal;

import java.util.List;

import com.zrosen10.fitnessTracker.dto.GoalDTO;

/**
 * Service interface for managing fitness goals.
 * Defines operations for creating and retrieving goals.
 */
public interface GoalService {

    /**
     * Creates a new fitness goal in the system.
     * 
     * @param dto The GoalDTO containing the goal information
     * @return The created GoalDTO with populated data
     */
    GoalDTO postGoal(GoalDTO dto);

    /**
     * Retrieves all fitness goals from the system.
     * 
     * @return List of all GoalDTOs
     */
    List<GoalDTO> getGoals();

}