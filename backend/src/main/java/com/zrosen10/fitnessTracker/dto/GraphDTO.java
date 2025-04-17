package com.zrosen10.fitnessTracker.dto;

import java.util.List;

import lombok.Data;

@Data
public class GraphDTO {

    private List<WorkoutDTO> workouts;
    private List<ActivityDTO> activities;

}
