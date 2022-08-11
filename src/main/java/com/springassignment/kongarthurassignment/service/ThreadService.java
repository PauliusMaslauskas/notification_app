package com.springassignment.kongarthurassignment.service;

import com.springassignment.kongarthurassignment.entity.Msgthread;
import com.springassignment.kongarthurassignment.repository.ThreadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ThreadService {

    private final ThreadRepository threadRepository;

    private final MessageService messageService;

    public Msgthread findById(int id) {
        return threadRepository
                .findById(id)
                .orElseThrow(RuntimeException::new);
    }

    public List<Msgthread> findAll() {
        return threadRepository.findAll();
    }

    public void deleteId(int id) {
        Msgthread msgthread = findById(id);
        messageService.deleteByThread(msgthread);
        threadRepository.deleteById(id);
    }

    public List<Msgthread> deleteAllThreads() {
        List<Msgthread> msgthread = findAll();
        messageService.deleteAllMessages();
        threadRepository.deleteAll();
        return msgthread;
    }

    public List<Msgthread> setSeen() {
        List<Msgthread> allThreads = findAll();
        allThreads.forEach(thr -> {
            thr.setSeen(1);
        });
        threadRepository.saveAll(allThreads);
        return allThreads;
    }

}






