package com.zrosen10.fitnessTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zrosen10.fitnessTracker.entity.Activity;

/**
 * Repository interface for Activity entities.
 * 
 * This interface provides database operations for Activity entities without
 * requiring
 * explicit implementations. Spring Data JPA automatically generates the
 * implementation
 * at runtime based on the method names and annotations.
 * 
 * By extending JpaRepository<Activity, Long>:
 * - The first type parameter (Activity) specifies the entity type to manage
 * - The second type parameter (Long) specifies the type of the entity's ID
 * field
 * 
 * This repository automatically provides methods like:
 * - save(Activity)
 * - findById(Long)
 * - findAll()
 * - delete(Activity)
 * - count()
 * and many more without requiring custom implementations.
 */
@Repository // Marks this interface as a Spring Data repository component
public interface ActivityRepository extends JpaRepository<Activity, Long> {

    /**
     * Retrieves the sum of steps across all activities.
     * Used for calculating total steps for fitness statistics.
     * 
     * @return The total number of steps as an Integer, or null if no activities
     *         exist
     */
    @Query("SELECT SUM(a.steps) FROM Activity a")
    Integer getTotalSteps();

    /**
     * Retrieves the sum of distance across all activities.
     * Used for calculating total distance covered for fitness statistics.
     * 
     * @return The total distance as a Double, or null if no activities exist
     */
    @Query("SELECT SUM(a.distance) FROM Activity a")
    Double getTotalDistance();

    /**
     * Retrieves the sum of calories burned across all activities.
     * Used for calculating total calories burned for fitness statistics.
     * 
     * @return The total calories burned as an Integer, or null if no activities
     *         exist
     */
    @Query("SELECT SUM(a.caloriesBurned) FROM Activity a")
    Integer getTotalActivityCalories();

}
