package com.example.exerciseManagementSystem.DAO;

import org.springframework.data.domain.Example;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.query.Query;
import org.hibernate.Session;
import com.example.exerciseManagementSystem.Entity.Exercise;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class ExerciseRepositoryImpl implements ExerciseRepository
{
    private final EntityManager entityManager;

    @Autowired
    public ExerciseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public List<Exercise> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Exercise> myQuery = currentSession.createQuery("from Exercise");
        return myQuery.getResultList();
    }

    @Transactional
    @Override
    public Object findById(long id) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Exercise.class, id);
    }

    @Transactional
    @Override
    public void saveOrUpdate(Exercise exercise) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(exercise);
    }

    @Transactional
    @Override
    public void deleteById(long id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Exercise exercise = currentSession.get(Exercise.class, id);
        currentSession.delete(exercise);
    }

    @Override
    public List<Exercise> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Exercise> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Exercise> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Exercise exercise) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends Exercise> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Exercise> S save(S s) {
        return null;
    }

    @Override
    public <S extends Exercise> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Exercise> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Exercise> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public <S extends Exercise> List<S> saveAllAndFlush(Iterable<S> iterable) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Exercise> iterable) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Exercise getOne(Long aLong) {
        return null;
    }

    @Override
    public Exercise getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Exercise> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Exercise> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Exercise> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Exercise> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Exercise> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Exercise> boolean exists(Example<S> example) {
        return false;
    }
}