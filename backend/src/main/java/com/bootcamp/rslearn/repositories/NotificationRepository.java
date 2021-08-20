package com.bootcamp.rslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.rslearn.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long > {

}
