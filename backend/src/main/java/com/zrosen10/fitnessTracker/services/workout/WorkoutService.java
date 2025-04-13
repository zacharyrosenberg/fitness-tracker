package com.zrosen10.fitnessTracker.services.workout;

import com.zrosen10.fitnessTracker.dto.WorkoutDTO;
import java.util.List;

/**
 * Service interface for workout-related business operations.
 * 
 * This interface defines the contract for workout operations in the
 * application.
 * It acts as an abstraction layer between controllers and repositories,
 * encapsulating business logic related to workouts.
 * 
 * The interface follows the principle of programming to an interface
 * rather than an implementation, allowing for different implementations
 * (like a real implementation and a mock for testing) to be swapped
 * without affecting dependent components.
 */
public interface WorkoutService {

    /**
     * Creates a new workout record in the system.
     * 
     * This method handles the business logic for creating a new workout:
     * - Validates the workout data
     * - Converts between DTOs and entities
     * - Persists the workout to the database
     * - Returns the created workout with generated ID
     *
     * @param workoutDTO The DTO containing the workout data to be created
     * @return The created workout as a DTO, including the generated ID
     */
    WorkoutDTO postWorkout(WorkoutDTO workoutDTO);

    List<WorkoutDTO> getWorkouts();
}
