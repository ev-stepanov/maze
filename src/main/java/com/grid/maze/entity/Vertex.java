package com.grid.maze.entity;

import lombok.Data;

import java.util.List;

@Data
public class Vertex {
    private Long id;
    private Room room;
    private List<Riddle> riddles;
    private List<Ghost> ghosts;

    public Vertex(Long id) {
        this.id = id;
    }
}
