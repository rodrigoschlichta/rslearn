package com.bootcamp.rslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.rslearn.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
