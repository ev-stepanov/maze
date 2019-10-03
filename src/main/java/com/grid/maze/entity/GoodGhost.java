package com.grid.maze.entity;

import com.grid.maze.entity.Ghost;

public class GoodGhost implements Ghost {
    @Override
    public void say() {
        System.out.println("good ghost");
    }
}
