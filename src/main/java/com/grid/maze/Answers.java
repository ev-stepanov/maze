package com.grid.maze;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Answers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String A;

    private String B;

    private String C;

    private String correctAnswer;
}
