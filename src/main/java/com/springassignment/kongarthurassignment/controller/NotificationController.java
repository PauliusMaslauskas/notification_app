package com.springassignment.kongarthurassignment.controller;

import com.springassignment.kongarthurassignment.entity.Msgthread;
import com.springassignment.kongarthurassignment.service.ThreadService;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/notifications")
public class NotificationController {

    private final ThreadService threadService;

    @GetMapping
    public List<Msgthread> getthread() {
        return threadService.findAll();
    }

    @GetMapping(path = "/hasSeen")
    public List<Msgthread> getHasSeen() {
        List<Msgthread> msgthread = threadService.findAll();
        msgthread.forEach(seen -> {
            seen.getSeen();
        });
        return msgthread;
    }

    @PostMapping(path = "/seen")
    public List<Msgthread> setSeenController() {
        return threadService.setSeen();
    }


    @PostMapping(path = "/deleteall")
    public List<Msgthread> deleteAll() {
        return threadService.deleteAllThreads();
    }

    @Transactional
    @PostMapping(path = "/delete/{id}")
    public List<Msgthread> deleteMessage(@PathVariable("id") Integer id) {
        threadService.deleteId(id);
        return threadService.findAll();
    }
}

