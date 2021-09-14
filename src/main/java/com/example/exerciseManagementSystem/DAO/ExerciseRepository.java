package com.example.exerciseManagementSystem.DAO;

import java.util.List;
import com.example.exerciseManagementSystem.Entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long>
{
    List<Exercise> findAll();

    Object findById(long id);

    void saveOrUpdate(Exercise exercise);

    void deleteById(long id);
}