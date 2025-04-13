package com.zrosen10.fitnessTracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

import com.zrosen10.fitnessTracker.dto.ActivityDTO;

/**
 * Entity class representing a fitness activity.
 * 
 * This class is mapped to the database table "activity" (default naming)
 * and stores information about each fitness tracking record like steps,
 * distance, and calories burned.
 */
@Entity // JPA annotation to mark this class as a persistent entity
@Data // Lombok annotation that automatically generates getters, setters, toString,
      // equals, and hashCode methods
public class Activity {

    /**
     * Unique identifier for each activity record.
     * The @Id annotation marks this as the primary key.
     * The @GeneratedValue annotation configures auto-increment for this field.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Uses database auto-increment
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
     * Distance covered in this activity, typically in miles or kilometers.
     */
    private double distance;

    /**
     * Number of calories burned during this activity.
     */
    private int caloriesBurned;

    /**
     * Converts this entity to a Data Transfer Object (DTO).
     * 
     * This method encapsulates the entity-to-DTO conversion logic within the entity
     * itself,
     * following the pattern where the source object knows how to convert itself to
     * different representations.
     * 
     * @return An ActivityDTO containing the same data as this entity
     */
    public ActivityDTO getActivityDTO() {
        // Create a new DTO instance
        ActivityDTO activityDTO = new ActivityDTO();

        // Copy all properties from entity to DTO
        activityDTO.setId(id);
        activityDTO.setDate(date);
        activityDTO.setSteps(steps);
        activityDTO.setDistance(distance);
        activityDTO.setCaloriesBurned(caloriesBurned);

        return activityDTO;
    }
}
