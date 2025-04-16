package com.zrosen10.fitnessTracker.dto;

import lombok.Data;

/**
 * Data Transfer Object for statistics related to fitness goals.
 * Contains aggregated counts of goals categorized by their achievement status.
 * Used to transfer statistics data from the backend to the frontend.
 */
@Data
public class StatsDTO {

    /**
     * Count of goals that have been marked as achieved.
     */
    private long achievedGoals;

    /**
     * Count of goals that have not yet been achieved.
     */
    private long notAchievedGoals;

}
