package com.springassignment.kongarthurassignment.repository;

import com.springassignment.kongarthurassignment.entity.Msgthread;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ThreadRepository extends JpaRepository<Msgthread, Integer> {

    Optional<Msgthread> deleteAllById(int id);


}
