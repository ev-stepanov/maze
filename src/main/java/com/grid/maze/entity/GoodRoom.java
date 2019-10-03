package com.grid.maze.entity;

import com.grid.maze.entity.Room;

public class GoodRoom implements Room {
    @Override
    public void getRoom() {
        System.out.println("good room");
    }
}
