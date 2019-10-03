package com.grid.maze.factories;

import com.grid.maze.entity.Ghost;
import com.grid.maze.entity.Riddle;
import com.grid.maze.entity.Room;

public interface AbstractFactory {
    Ghost getGhost();
    Riddle getRiddle();
    Room getRoom();
}
