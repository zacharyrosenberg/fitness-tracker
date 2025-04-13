package com.zrosen10.fitnessTracker.services.workout;

import org.springframework.stereotype.Service;

import com.zrosen10.fitnessTracker.dto.WorkoutDTO;
import com.zrosen10.fitnessTracker.entity.Workout;
import com.zrosen10.fitnessTracker.repository.WorkoutRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementation of the WorkoutService interface.
 * 
 * This service class handles the business logic for workout operations,
 * acting as an intermediary between controllers and the data access layer.
 * It transforms DTOs to entities for persistence and vice versa for responses.
 */
@Service // Marks this class as a Spring service component for dependency injection
@RequiredArgsConstructor // Lombok: generates a constructor for all final fields
public class WorkoutServiceImpl implements WorkoutService {

    /**
     * Repository for database operations on Workout entities.
     * Final keyword ensures this dependency cannot be changed after initialization.
     * RequiredArgsConstructor will generate a constructor that injects this
     * dependency.
     */
    private final WorkoutRepository workoutRepository;

    /**
     * Creates a new workout record in the database.
     * 
     * This method implements the workflow to:
     * 1. Convert the DTO to an entity
     * 2. Persist the entity to the database
     * 3. Convert the saved entity back to a DTO for the response
     * 
     * @param dto The DTO containing the workout data from the
     *            client/controller
     * @return The DTO representation of the saved workout with generated ID
     */
    @Override
    public WorkoutDTO postWorkout(WorkoutDTO dto) {
        // Create a new Workout entity instance
        Workout workout = new Workout();

        // Map the DTO fields to the entity (DTO → Entity conversion)
        workout.setDate(dto.getDate());
        workout.setType(dto.getType());
        workout.setDuration(dto.getDuration());
        workout.setCaloriesBurned(dto.getCaloriesBurned());

        // Persist the entity to the database and get the saved instance (with generated
        // ID)
        Workout savedWorkout = workoutRepository.save(workout);

        // Convert the saved entity back to DTO and return (Entity → DTO conversion)
        return savedWorkout.getWorkoutDTO();
    }

    public List<WorkoutDTO> getWorkouts() {
        List<Workout> workouts = workoutRepository.findAll();
        return workouts.stream()
                .map(Workout::getWorkoutDTO)
                .collect(Collectors.toList());
    }
}
