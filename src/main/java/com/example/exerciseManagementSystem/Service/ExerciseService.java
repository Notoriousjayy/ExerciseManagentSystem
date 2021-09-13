package com.example.exerciseManagementSystem.Service;

import com.example.exerciseManagementSystem.Entity.Exercise;
import java.util.List;

public interface ExerciseService
{
    List<Exercise> findAll();

    Object findById(final long id);

    Exercise saveOrUpdate(final Exercise exercise);

    void deleteById(final long id);
}