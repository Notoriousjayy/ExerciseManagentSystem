package com.example.exerciseManagementSystem.DAO;

import java.util.List;
import com.example.exerciseManagementSystem.Entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long>
{
    List<Exercise> findAll();

    Object findById(final long id);

    void saveOrUpdate(final Exercise exercise);

    void deleteById(final long id);
}