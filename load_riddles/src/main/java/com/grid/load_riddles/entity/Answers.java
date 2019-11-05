package com.grid.load_riddles.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Answers {
    @Id
    private Long id;

    private String A;

    private String B;

    private String C;

    private String correctAnswer;
}
