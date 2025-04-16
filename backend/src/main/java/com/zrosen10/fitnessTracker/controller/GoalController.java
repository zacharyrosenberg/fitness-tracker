package com.zrosen10.fitnessTracker.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.zrosen10.fitnessTracker.dto.GoalDTO;
import com.zrosen10.fitnessTracker.services.goal.GoalService;

import lombok.RequiredArgsConstructor;

/**
 * REST Controller for handling Goal-related HTTP requests.
 * Provides endpoints for creating and retrieving fitness goals.
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class GoalController {

    private final GoalService goalService;

    /**
     * Creates a new fitness goal in the system.
     * 
     * @param dto The GoalDTO containing goal information
     * @return ResponseEntity with the created goal data or error message
     */
    @PostMapping("/goal")
    public ResponseEntity<?> postGoal(@RequestBody GoalDTO dto) {

        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(goalService.postGoal(dto));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }

    }

    /**
     * Retrieves all fitness goals from the system.
     * 
     * @return ResponseEntity with the list of goals or error message
     */
    @GetMapping("/goals")
    public ResponseEntity<?> getGoals() {
        try {
            return ResponseEntity.ok(goalService.getGoals());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    /**
     * Updates the status of a goal to achieved.
     * 
     * @param id The ID of the goal to update
     * @return ResponseEntity with the updated goal data or error message
     */
    @GetMapping("/goal/status/{id}")
    public ResponseEntity<?> updateStatus(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(goalService.updateStatus(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

}
