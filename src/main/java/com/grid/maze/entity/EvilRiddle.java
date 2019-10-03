package com.grid.maze.entity;

import com.grid.maze.entity.Riddle;

public class EvilRiddle implements Riddle {
    @Override
    public void makeRiddle() {
        System.out.println("evil riddle");
    }
}
