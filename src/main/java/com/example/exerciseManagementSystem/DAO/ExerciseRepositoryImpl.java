package com.example.exerciseManagementSystem.DAO;

import org.springframework.data.domain.Example;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import java.io.Serializable;
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
    public ExerciseRepositoryImpl(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public List<Exercise> findAll() {
        final Session currentSession = (Session)this.entityManager.unwrap((Class)Session.class);
        final Query<Exercise> myQuery = (Query<Exercise>)currentSession.createQuery("from Exercise");
        return (List<Exercise>)myQuery.getResultList();
    }

    @Transactional
    @Override
    public Object findById(final long id) {
        final Session currentSession = (Session)this.entityManager.unwrap((Class)Session.class);
        return currentSession.get((Class)Exercise.class, (Serializable)id);
    }

    @Transactional
    @Override
    public void saveOrUpdate(final Exercise exercise) {
        final Session currentSession = (Session)this.entityManager.unwrap((Class)Session.class);
        currentSession.saveOrUpdate((Object)exercise);
    }

    @Transactional
    @Override
    public void deleteById(final long id) {
        final Session currentSession = (Session)this.entityManager.unwrap((Class)Session.class);
        final Exercise exercise = (Exercise)currentSession.get((Class)Exercise.class, (Serializable)id);
        currentSession.delete((Object)exercise);
    }

    public List<Exercise> findAll(final Sort sort) {
        return null;
    }

    public Page<Exercise> findAll(final Pageable pageable) {
        return null;
    }

    public List<Exercise> findAllById(final Iterable<Long> iterable) {
        return null;
    }

    public long count() {
        return 0L;
    }

    public void deleteById(final Long aLong) {
    }

    public void delete(final Exercise exercise) {
    }

    public void deleteAllById(final Iterable<? extends Long> iterable) {
    }

    public void deleteAll(final Iterable<? extends Exercise> iterable) {
    }

    public void deleteAll() {
    }

    public <S extends Exercise> S save(final S s) {
        return null;
    }

    public <S extends Exercise> List<S> saveAll(final Iterable<S> iterable) {
        return null;
    }

    public Optional<Exercise> findById(final Long aLong) {
        return Optional.empty();
    }

    public boolean existsById(final Long aLong) {
        return false;
    }

    public void flush() {
    }

    public <S extends Exercise> S saveAndFlush(final S s) {
        return null;
    }

    public <S extends Exercise> List<S> saveAllAndFlush(final Iterable<S> iterable) {
        return null;
    }

    public void deleteAllInBatch(final Iterable<Exercise> iterable) {
    }

    public void deleteAllByIdInBatch(final Iterable<Long> iterable) {
    }

    public void deleteAllInBatch() {
    }

    public Exercise getOne(final Long aLong) {
        return null;
    }

    public Exercise getById(final Long aLong) {
        return null;
    }

    public <S extends Exercise> Optional<S> findOne(final Example<S> example) {
        return Optional.empty();
    }

    public <S extends Exercise> List<S> findAll(final Example<S> example) {
        return null;
    }

    public <S extends Exercise> List<S> findAll(final Example<S> example, final Sort sort) {
        return null;
    }

    public <S extends Exercise> Page<S> findAll(final Example<S> example, final Pageable pageable) {
        return null;
    }

    public <S extends Exercise> long count(final Example<S> example) {
        return 0L;
    }

    public <S extends Exercise> boolean exists(final Example<S> example) {
        return false;
    }
}