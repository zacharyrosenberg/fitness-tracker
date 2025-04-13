package com.zrosen10.fitnessTracker.dto;

import java.util.Date;

import lombok.Data;

/**
 * Data Transfer Object (DTO) for Goal information.
 * 
 * This class is used to transfer goal data between the service layer and client
 * applications,
 * separating the internal entity representation from the external API.
 * It mirrors the Goal entity but can be modified independently to meet API
 * requirements.
 * 
 * The @Data annotation from Lombok automatically generates getters, setters,
 * equals, hashCode, and toString methods.
 */
@Data
public class GoalDTO {

    /**
     * Unique identifier for the goal.
     */
    private Long id;

    /**
     * Textual description of the goal (e.g., "Run 5 miles", "Lose 10 pounds").
     */
    private String description;

    /**
     * Date when the goal was set or should begin.
     */
    private Date startDate;

    /**
     * Target date by which the goal should be accomplished.
     */
    private Date endDate;

    /**
     * Flag indicating whether the goal has been achieved.
     */
    private boolean achieved;
}
