package com.example.exerciseManagementSystem.Service;

import com.example.exerciseManagementSystem.Entity.Exercise;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.exerciseManagementSystem.DAO.ExerciseRepository;
import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    private final ExerciseRepository exerciseRepository;

    @Autowired
    public ExerciseServiceImpl(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public List<Exercise> findAll() {
        return exerciseRepository.findAll();
    }

    @Override
    public Object findById(long id) {
        return exerciseRepository.findById(id);
    }

    @Override
    public void saveOrUpdate( Exercise exercise) {
        exerciseRepository.saveOrUpdate(exercise);
    }

    @Override
    public void deleteById(long id) {
        exerciseRepository.deleteById(id);
    }

}