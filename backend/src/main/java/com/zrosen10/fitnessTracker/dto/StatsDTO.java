package com.zrosen10.fitnessTracker.dto;

import lombok.Data;

/**
 * Data Transfer Object for statistics related to fitness goals and activities.
 * Contains aggregated counts of goals categorized by their achievement status,
 * as well as activity metrics such as steps, distance, calories burned, and
 * workout duration.
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

    /**
     * Total number of steps recorded across all activities.
     */
    private int steps;

    /**
     * Total distance covered across all activities, measured in kilometers or
     * miles.
     */
    private double distance;

    /**
     * Total calories burned across all activities.
     */
    private int totalCaloriesBurned;

    /**
     * Duration of the workout in minutes.
     */
    private int duration;

}
