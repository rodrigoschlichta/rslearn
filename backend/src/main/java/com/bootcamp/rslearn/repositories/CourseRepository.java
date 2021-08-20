package com.bootcamp.rslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.rslearn.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
	
}