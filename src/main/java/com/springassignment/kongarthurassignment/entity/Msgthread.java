package com.springassignment.kongarthurassignment.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@ToString

public class Msgthread {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String timecreated;
    private String summary;
    private Integer seen;

    @JsonManagedReference
    @OneToMany(mappedBy = "msgthread", fetch = FetchType.EAGER)
    private List<Msgmessage> msgmessages = new ArrayList<>();

}
