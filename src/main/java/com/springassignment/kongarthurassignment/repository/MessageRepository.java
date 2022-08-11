package com.springassignment.kongarthurassignment.repository;

import com.springassignment.kongarthurassignment.entity.Msgmessage;
import com.springassignment.kongarthurassignment.entity.Msgthread;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MessageRepository extends JpaRepository<Msgmessage, Integer> {

    Optional<Msgmessage> deleteAllByMsgthread(Msgthread msgthread);

    void deleteAll();

    @NonNull List<Msgmessage> findAll();

}
