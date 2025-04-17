package com.zrosen10.fitnessTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zrosen10.fitnessTracker.entity.Workout;

/**
 * Repository interface for Workout entities.
 * 
 * This interface provides database operations for Workout entities without
 * requiring
 * explicit implementations. Spring Data JPA automatically generates the
 * implementation
 * at runtime based on the method names and annotations.
 * 
 * By extending JpaRepository<Workout, Long>:
 * - The first type parameter (Workout) specifies the entity type to manage
 * - The second type parameter (Long) specifies the type of the entity's ID
 * field
 * 
 * This repository automatically provides methods like:
 * - save(Workout)
 * - findById(Long)
 * - findAll()
 * - delete(Workout)
 * - count()
 * and many more without requiring custom implementations.
 * 
 * Custom query methods can be added by following Spring Data naming
 * conventions.
 * For example:
 * - List<Workout> findByType(String type)
 * - List<Workout> findByDateBetween(Date startDate, Date endDate)
 * - List<Workout> findByCaloriesBurnedGreaterThan(int calories)
 */
@Repository // Marks this interface as a Spring Data repository component
public interface WorkoutRepository extends JpaRepository<Workout, Long> {

    /**
     * Retrieves the sum of duration minutes across all workouts.
     * Used for calculating total workout time for fitness statistics.
     * 
     * @return The total workout duration in minutes as an Integer, or null if no
     *         workouts exist
     */
    @Query("SELECT SUM(w.duration) FROM Workout w")
    Integer getTotalDuration();

    /**
     * Retrieves the sum of calories burned across all workouts.
     * Used for calculating total calories burned for fitness statistics.
     * This is combined with activity calories to determine total calories burned.
     * 
     * @return The total calories burned during workouts as an Integer, or null if
     *         no workouts exist
     */
    @Query("SELECT SUM(w.caloriesBurned) FROM Workout w")
    Integer getTotalCaloriesBurned();

}
