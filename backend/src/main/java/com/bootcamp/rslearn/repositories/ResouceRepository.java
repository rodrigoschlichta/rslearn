package com.bootcamp.rslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.rslearn.entities.Resource;

public interface ResouceRepository extends JpaRepository<Resource, Long> {

}
