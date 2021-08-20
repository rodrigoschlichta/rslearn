package com.bootcamp.rslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.rslearn.entities.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {

}
