package com.zrosen10.fitnessTracker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.zrosen10.fitnessTracker.dto.WorkoutDTO;
import com.zrosen10.fitnessTracker.services.workout.WorkoutService;

import lombok.RequiredArgsConstructor;

/**
 * REST Controller for handling workout-related HTTP requests.
 * 
 * This controller provides endpoints for creating, retrieving, updating,
 * and deleting workout records in the fitness tracking application.
 * It acts as the entry point for workout-related API calls from clients.
 */
@RestController // Marks this class as a controller where every method returns a domain object
                // instead of a view
@RequestMapping("/api") // Maps all HTTP requests with /api in the URL to this controller
@RequiredArgsConstructor // Lombok: automatically generates a constructor for all final fields
@CrossOrigin("*") // Allows requests from any origin (for development; should be restricted in
                  // production)
public class WorkoutController {

    /**
     * Service that handles workout business logic.
     * Final keyword ensures this dependency cannot be changed after initialization.
     * RequiredArgsConstructor will generate a constructor that injects this
     * dependency.
     */
    private final WorkoutService workoutService;

    /**
     * Handles POST requests to create a new workout.
     * 
     * This endpoint implements the CREATE operation of REST's CRUD functionality.
     * It receives workout data from the client, processes it through the service
     * layer,
     * and returns the created workout with its generated ID.
     * 
     * @param workoutDTO The workout data sent in the request body
     * @return ResponseEntity with:
     *         - 200 OK status and created workout if successful
     *         - 500 Internal Server Error with error message if creation fails
     */
    @PostMapping("/workout") // Maps HTTP POST requests to /api/workout to this method
    public ResponseEntity<?> postWorkout(@RequestBody WorkoutDTO workoutDTO) {

        try {
            return ResponseEntity.ok(workoutService.postWorkout(workoutDTO));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error posting workout");
        }
    }

    @GetMapping("/workouts")
    public ResponseEntity<?> getWorkouts() {
        try {
            return ResponseEntity.ok(workoutService.getWorkouts());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error getting workouts");
        }
    }
}
