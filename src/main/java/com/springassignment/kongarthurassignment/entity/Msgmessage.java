package com.springassignment.kongarthurassignment.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Msgmessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "msgthread_id")
    private Msgthread msgthread;


}
