package com.zrosen10.fitnessTracker.services.goal;

import org.springframework.stereotype.Service;

import com.zrosen10.fitnessTracker.dto.GoalDTO;
import com.zrosen10.fitnessTracker.entity.Goal;
import com.zrosen10.fitnessTracker.repository.GoalRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GoalServiceImpl implements GoalService {

    private final GoalRepository goalRepository;

    @Override
    public GoalDTO postGoal(GoalDTO dto) {

        Goal goal = new Goal();

        goal.setDescription(dto.getDescription());
        goal.setStartDate(dto.getStartDate());
        goal.setEndDate(dto.getEndDate());
        goal.setAchieved(false);

        Goal savedGoal = goalRepository.save(goal);

        return savedGoal.getGoalDTO();

    }

}
