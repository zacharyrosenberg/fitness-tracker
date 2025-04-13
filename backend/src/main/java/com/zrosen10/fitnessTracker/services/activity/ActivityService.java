package com.zrosen10.fitnessTracker.services.activity;

import java.util.List;

import com.zrosen10.fitnessTracker.dto.ActivityDTO;

public interface ActivityService {

    ActivityDTO postActivity(ActivityDTO dto);

    List<ActivityDTO> getActivities();

}
