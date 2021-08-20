package com.bootcamp.rslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.rslearn.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long>{

}
