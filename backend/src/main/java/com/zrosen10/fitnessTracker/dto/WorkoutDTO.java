package com.zrosen10.fitnessTracker.dto;

import java.util.Date;

import lombok.Data;

/**
 * Data Transfer Object (DTO) for Workout data.
 * 
 * This class is used to transfer workout data between different layers of the
 * application,
 * particularly between the service layer and controller layer, and for API
 * requests/responses. It separates the data representation used in the API from
 * the internal entity model.
 * 
 * Using DTOs provides several benefits:
 * - Decouples API contracts from database schema
 * - Allows selective exposure of entity data (security/privacy)
 * - Enables customized data shapes for specific view requirements
 */
@Data // Lombok annotation that automatically generates getters, setters, toString,
      // equals, and hashCode methods
public class WorkoutDTO {

    /**
     * Unique identifier for the workout.
     * This will be null for new workouts and populated for existing ones.
     */
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

}
