package com.zrosen10.fitnessTracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.Date;
import com.zrosen10.fitnessTracker.dto.WorkoutDTO;

/**
 * Entity class representing a workout in the fitness tracking system.
 * 
 * This class is mapped to a database table named "workout" (default naming
 * convention)
 * and contains information about each workout session including type, date,
 * duration,
 * and calories burned.
 */
@Entity // JPA annotation marking this class as a database entity
@Data // Lombok annotation that automatically generates getters, setters, equals,
      // hashCode, and toString methods
public class Workout {
    /**
     * Unique identifier for each workout.
     * The @Id annotation marks this as the primary key in the database table.
     * GenerationType.IDENTITY configures it to use auto-increment in the database.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The type of workout performed (e.g., "Running", "Swimming", "Cycling").
     */
    private String type;

    /**
     * The date when the workout was performed.
     */
    private Date date;

    /**
     * Duration of the workout in minutes.
     */
    private int duration;

    /**
     * Number of calories burned during this workout.
     */
    private int caloriesBurned;

    /**
     * Converts this entity to a Data Transfer Object (DTO).
     * 
     * This method encapsulates the entity-to-DTO conversion logic within the entity
     * itself,
     * following the pattern where the source object knows how to convert itself to
     * different
     * representations. It's used to transfer data between layers without exposing
     * the entity directly.
     * 
     * @return A WorkoutDTO containing the same data as this entity
     */
    public WorkoutDTO getWorkoutDTO() {
        // Create a new DTO instance
        WorkoutDTO workoutDTO = new WorkoutDTO();

        // Copy all properties from entity to DTO
        workoutDTO.setId(id);
        workoutDTO.setType(type);
        workoutDTO.setDate(date);
        workoutDTO.setDuration(duration);
        workoutDTO.setCaloriesBurned(caloriesBurned);

        return workoutDTO;
    }
}
