package com.example.exerciseManagementSystem.Controller;

import com.example.exerciseManagementSystem.Service.ExerciseService;
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
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController {
    private final ExerciseService exerciseService;

    @Autowired
    public ExerciseController(@Qualifier("exerciseServiceImpl") ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping( "/AllExercises" )
    public List<Exercise> findAll() {
        return exerciseService.findAll();
    }

    @PostMapping( "/addExercise" )
    public Exercise addExercise(@RequestBody Exercise exercise) {
        // I need to figure this out come back to this at a later date.
//        exercise.setId(0L);
        exerciseService.saveOrUpdate(exercise);
        return exercise;
    }

    @GetMapping( "retrieveExercise/{id}" )
    public Object getExerciseById(@PathVariable long id) {
        exerciseService.findById(id);
        return "Retrieved part id : " + id;
    }

    @PutMapping({ "/updateExercise" })
    public Exercise UpdateExercise(@RequestBody Exercise exercise) {
        exerciseService.saveOrUpdate(exercise);
        return exercise;
    }

    @DeleteMapping({ "/deleteExercise/{id}" })
    public String deleteExercise(@PathVariable int id) {
        exerciseService.deleteById(id);
        return "Deleted part id : " + id;
    }
}