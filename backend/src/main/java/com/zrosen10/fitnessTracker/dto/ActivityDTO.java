package com.zrosen10.fitnessTracker.dto;

import java.util.Date;

import lombok.Data;

/**
 * Data Transfer Object (DTO) for Activity data.
 * 
 * This class is used to transfer fitness activity data between different layers
 * of the application,
 * particularly between the controller and service layers, and for API
 * requests/responses.
 * It separates the data representation used in the API from the internal entity
 * model.
 */
@Data // Lombok annotation that automatically generates getters, setters, toString,
      // equals, and hashCode methods
public class ActivityDTO {

    /**
     * Unique identifier for the activity.
     * This will be null for new activities and populated for existing ones.
     */
    private Long id;

    /**
     * The date when the activity was performed.
     */
    private Date date;

    /**
     * Number of steps recorded for this activity.
     */
    private int steps;

    /**
     * Distance covered during this activity.
     */
    private double distance;

    /**
     * Number of calories burned during this activity.
     */
    private int caloriesBurned;

}
