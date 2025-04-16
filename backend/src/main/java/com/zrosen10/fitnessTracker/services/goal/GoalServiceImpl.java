package com.zrosen10.fitnessTracker.services.goal;

import org.springframework.stereotype.Service;

import com.zrosen10.fitnessTracker.dto.GoalDTO;
import com.zrosen10.fitnessTracker.entity.Goal;
import com.zrosen10.fitnessTracker.repository.GoalRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

/**
 * Implementation of the GoalService interface.
 * Provides concrete implementations for goal-related operations.
 */
@Service
@RequiredArgsConstructor
public class GoalServiceImpl implements GoalService {

    private final GoalRepository goalRepository;

    /**
     * Creates a new fitness goal in the system.
     * Maps the DTO to an entity, saves it, and returns the updated DTO.
     * New goals are initialized as not achieved.
     * 
     * @param dto The GoalDTO containing goal information
     * @return The saved GoalDTO with updated information
     */
    @Override
    public GoalDTO postGoal(GoalDTO dto) {

        Goal goal = new Goal();

        // Map DTO fields to entity
        goal.setDescription(dto.getDescription());
        goal.setStartDate(dto.getStartDate());
        goal.setEndDate(dto.getEndDate());
        goal.setAchieved(false); // Initialize as not achieved

        // Save and return the result
        Goal savedGoal = goalRepository.save(goal);

        return savedGoal.getGoalDTO();

    }

    /**
     * Retrieves all fitness goals from the database.
     * Converts all goal entities to DTOs before returning.
     * 
     * @return List of all available GoalDTOs
     */
    @Override
    public List<GoalDTO> getGoals() {
        List<Goal> goals = goalRepository.findAll();
        return goals.stream().map(Goal::getGoalDTO).collect(Collectors.toList());
    }

    public GoalDTO updateStatus(Long id) {

        Optional<Goal> optionalGoal = goalRepository.findById(id);

        if (optionalGoal.isPresent()) {
            Goal exisitingGoal = optionalGoal.get();

            exisitingGoal.setAchieved(true);
            Goal updatedGoal = goalRepository.save(exisitingGoal);
            return updatedGoal.getGoalDTO();
        }
        throw new EntityNotFoundException("Goal not found");

    }

}
