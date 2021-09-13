package com.example.exerciseManagementSystem.Service;

import com.example.exerciseManagementSystem.Entity.Exercise;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.exerciseManagementSystem.DAO.ExerciseRepository;
import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl implements ExerciseService
{
    private final ExerciseRepository exerciseRepository;

    @Autowired
    public ExerciseServiceImpl(final ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public List<Exercise> findAll() {
        return this.exerciseRepository.findAll();
    }

    @Override
    public Object findById(final long id) {
        return this.exerciseRepository.findById(id);
    }

    @Override
    public Exercise saveOrUpdate(final Exercise exercise) {
        this.exerciseRepository.saveOrUpdate(exercise);
        return exercise;
    }

    @Override
    public void deleteById(final long id) {
        this.exerciseRepository.deleteById(id);
    }
}