package com.springassignment.kongarthurassignment.service;

import com.springassignment.kongarthurassignment.entity.Msgmessage;
import com.springassignment.kongarthurassignment.entity.Msgthread;
import com.springassignment.kongarthurassignment.repository.MessageRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageService {
    @NonNull
    private final MessageRepository messageRepository;

    public Msgmessage findById(int id) {
        return messageRepository
                .findById(id)
                .orElseThrow(RuntimeException::new);
    }

    public void deleteByThread(Msgthread msgthread) {
        messageRepository.deleteAllByMsgthread(msgthread);
    }

    public void deleteAllMessages() {
        messageRepository.deleteAll();
    }

}
