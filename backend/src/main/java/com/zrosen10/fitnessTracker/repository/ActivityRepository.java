package com.zrosen10.fitnessTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
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
    // No custom methods defined yet
    // Custom query methods can be added here following Spring Data naming
    // conventions
    // Examples:
    // List<Activity> findByDateBetween(Date startDate, Date endDate);
    // List<Activity> findByStepsGreaterThan(int steps);
}
