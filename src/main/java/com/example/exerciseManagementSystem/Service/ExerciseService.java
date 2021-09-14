package com.example.exerciseManagementSystem.Service;

import com.example.exerciseManagementSystem.Entity.Exercise;
import java.util.List;

public interface ExerciseService
{
    public List<Exercise> findAll();

    public Object findById(long id);

    public void saveOrUpdate(Exercise exercise);

    public void deleteById(long id);
}