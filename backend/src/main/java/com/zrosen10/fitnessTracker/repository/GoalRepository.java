package com.zrosen10.fitnessTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zrosen10.fitnessTracker.entity.Goal;

/**
 * Repository interface for accessing and manipulating Goal entities in the
 * database.
 * 
 * This interface extends JpaRepository which provides standard CRUD operations:
 * - save: Create or update a goal
 * - findById: Find a goal by its ID
 * - findAll: Retrieve all goals
 * - delete: Remove a goal
 * - count: Get the total number of goals
 * 
 * No additional methods are currently defined, but custom queries could be
 * added
 * here as needed (e.g., findByAchieved, findByEndDateBefore, etc.)
 * 
 * The @Repository annotation marks this as a Spring Data repository component
 * and enables exception translation.
 */
@Repository
public interface GoalRepository extends JpaRepository<Goal, Long> {
    // Spring Data JPA automatically implements basic CRUD operations
    // Custom query methods can be added here as needed
}
