package com.grid.maze.entity;

public interface Room {

    void getNeighboringRooms();
    void setIdRoom(Long id);
    void useGhost();
}
