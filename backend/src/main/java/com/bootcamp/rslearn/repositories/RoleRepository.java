package com.bootcamp.rslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.rslearn.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
