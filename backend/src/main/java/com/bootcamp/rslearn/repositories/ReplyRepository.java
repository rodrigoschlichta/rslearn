package com.bootcamp.rslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.rslearn.entities.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

}
