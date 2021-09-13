package com.example.exerciseManagementSystem.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.exerciseManagementSystem.Entity.Exercise;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.example.exerciseManagementSystem.Service.ExerciseService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController
{
    private final ExerciseService exerciseService;

    @Autowired
    public ExerciseController(@Qualifier("exerciseServiceImpl") final ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping({ "/AllExercises" })
    public List<Exercise> findAll() {
        return this.exerciseService.findAll();
    }

    @PostMapping({ "/addExercise" })
    public Exercise addEmployee(@RequestBody final Exercise exercise) {
        exercise.setId(0L);
        this.exerciseService.saveOrUpdate(exercise);
        return exercise;
    }

    @GetMapping({ "retrieveExercise/{id}" })
    public Object getExerciseById(@PathVariable final int id) {
        this.exerciseService.findById(id);
        return "Retrieved part id : " + id;
    }

    @PutMapping({ "/updateExercise" })
    public Exercise UpdateExercise(@RequestBody final Exercise exercise) {
        this.exerciseService.saveOrUpdate(exercise);
        return exercise;
    }

    @DeleteMapping({ "/deleteExercise/{id}" })
    public String deleteExercise(@PathVariable final int id) {
        this.exerciseService.deleteById(id);
        return "Deleted part id : " + id;
    }
}