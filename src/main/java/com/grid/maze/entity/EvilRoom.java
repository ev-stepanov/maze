package com.grid.maze.entity;

import com.grid.maze.entity.Room;

public class EvilRoom implements Room {
    @Override
    public void getRoom() {
        System.out.println("evil room");
    }
}
