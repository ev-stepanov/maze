package com.grid.maze.entity;

import com.grid.maze.entity.Ghost;

public class EvilGhost implements Ghost {
    @Override
    public void say() {
        System.out.println("evil ghost");
    }
}
