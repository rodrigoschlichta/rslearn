package com.bootcamp.rslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.rslearn.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
