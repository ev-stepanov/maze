package com.grid.load_riddles.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Riddle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer level;

    private String riddle;

    @OneToOne
    @JoinColumn(name = "answer")
    private Answers answers;

    @Override
    public String toString() {
        return  "riddle='" + riddle + '\'' +
                ", answers= " +
                "a) " + answers.getA() +
                "b) " + answers.getB() +
                "c) " + answers.getC() +
                '}';
    }
}
