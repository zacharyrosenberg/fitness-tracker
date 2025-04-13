package com.zrosen10.fitnessTracker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

import com.zrosen10.fitnessTracker.dto.ActivityDTO;
import com.zrosen10.fitnessTracker.services.activity.ActivityService;

/**
 * REST Controller for handling activity-related HTTP requests
 */
@RestController // Marks this class as a controller where every method returns a domain object
                // instead of a view
@RequestMapping("/api") // Maps all HTTP requests with /api in the URL to this controller
@RequiredArgsConstructor // Lombok: automatically generates a constructor for all final fields
@CrossOrigin("*") // Allows requests from any origin (for development; should be restricted in
                  // production)
public class ActivityController {

    // Spring automatically injects the ActivityService implementation
    private final ActivityService activityService;

    /**
     * Handles POST requests to create a new activity
     * 
     * @param dto The activity data sent in the request body
     * @return ResponseEntity with the created activity or error message
     */
    @PostMapping("/activity") // Maps HTTP POST requests to /api/activity to this method
    public ResponseEntity<?> postActivity(@RequestBody ActivityDTO dto) {
        // Call the service layer to persist the activity
        ActivityDTO createActivity = activityService.postActivity(dto);

        // Return appropriate HTTP response based on result
        if (createActivity != null) {
            // Return 201 Created status with the created activity in the response body
            return ResponseEntity.status(HttpStatus.CREATED).body(createActivity);
        } else {
            // Return 500 Internal Server Error if activity creation failed
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create activity");
        }
    }

    /**
     * Handles GET requests to retrieve all activities.
     * 
     * This endpoint implements the READ operation of REST's CRUD functionality.
     * It retrieves all fitness activities stored in the database and returns them
     * as a collection.
     * 
     * @return ResponseEntity with:
     *         - 200 OK status and list of activities if successful
     *         - 500 Internal Server Error with error message if retrieval fails
     */
    @GetMapping("/activities") // Maps HTTP GET requests to /api/activities to this method
    public ResponseEntity<?> getActivities() {
        try {
            // Call the service layer to retrieve all activities
            return ResponseEntity.ok(activityService.getActivities()); // Returns 200 OK with the list of activities
        } catch (Exception e) {
            // Handle any exceptions that might occur during retrieval
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to retrieve activities: " + e.getMessage());
        }
    }
}
