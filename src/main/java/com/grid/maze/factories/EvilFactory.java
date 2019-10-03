package com.grid.maze.factories;

import com.grid.maze.entity.EvilGhost;
import com.grid.maze.entity.EvilRiddle;
import com.grid.maze.entity.EvilRoom;
import com.grid.maze.entity.Ghost;
import com.grid.maze.entity.Riddle;
import com.grid.maze.entity.Room;

public class EvilFactory implements AbstractFactory {
    public Ghost getGhost() {
        return new EvilGhost();
    }

    public Riddle getRiddle() {
        return new EvilRiddle();
    }

    public Room getRoom() {
        return new EvilRoom();
    }
}
