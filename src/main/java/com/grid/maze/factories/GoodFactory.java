package com.grid.maze.factories;

import com.grid.maze.entity.GoodGhost;
import com.grid.maze.entity.GoodRiddle;
import com.grid.maze.entity.GoodRoom;
import com.grid.maze.entity.Ghost;
import com.grid.maze.entity.Riddle;
import com.grid.maze.entity.Room;

public class GoodFactory implements AbstractFactory {
    public Ghost getGhost() {
        return new GoodGhost();
    }

    public Riddle getRiddle() {
        return new GoodRiddle();
    }

    public Room getRoom() {
        return new GoodRoom();
    }
}
