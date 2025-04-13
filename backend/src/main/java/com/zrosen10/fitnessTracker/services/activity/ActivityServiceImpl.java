package com.zrosen10.fitnessTracker.services.activity;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.zrosen10.fitnessTracker.dto.ActivityDTO;
import com.zrosen10.fitnessTracker.entity.Activity;
import com.zrosen10.fitnessTracker.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;

/**
 * Implementation of the ActivityService interface.
 * This service handles the business logic for fitness activities.
 */
@Service // Marks this class as a Spring service component for dependency injection
@RequiredArgsConstructor // Lombok: generates a constructor for all final fields
public class ActivityServiceImpl implements ActivityService {

    /**
     * Repository for database operations on Activity entities.
     * Final keyword ensures this dependency cannot be changed after initialization.
     */
    private final ActivityRepository activityRepository;

    /**
     * Creates a new activity record in the database.
     * 
     * @param dto The ActivityDTO containing the data from the client/controller
     * @return The DTO representation of the saved activity with generated ID
     */
    public ActivityDTO postActivity(ActivityDTO dto) {

        // Create a new Activity entity instance
        Activity activity = new Activity();

        // Map the DTO fields to the entity (DTO → Entity conversion)
        activity.setDate(dto.getDate());
        activity.setSteps(dto.getSteps());
        activity.setDistance(dto.getDistance());
        activity.setCaloriesBurned(dto.getCaloriesBurned());

        // Persist the entity to the database and get the saved instance (with generated
        // ID)
        Activity savedActivity = activityRepository.save(activity);

        // Convert the saved entity back to DTO and return (Entity → DTO conversion)
        return savedActivity.getActivityDTO();
    }

    /**
     * Retrieves all activities from the database.
     * 
     * This method implements the GET operation of the REST API by:
     * 1. Fetching all Activity entities from the database
     * 2. Converting each entity to its DTO representation
     * 3. Returning the list of DTOs to the controller
     * 
     * @return List of ActivityDTO objects representing all stored activities
     */
    public List<ActivityDTO> getActivities() {
        // Retrieve all activity entities from the database
        List<Activity> activities = activityRepository.findAll();

        // Convert the list of entities to a list of DTOs using Java Stream API
        return activities.stream()
                .map(Activity::getActivityDTO) // Method reference to convert each entity to DTO
                .collect(Collectors.toList()); // Collect results into a List
    }
}
