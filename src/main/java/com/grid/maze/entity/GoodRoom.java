package com.grid.maze.entity;

import com.grid.maze.factories.AbstractFactory;
import com.grid.maze.factories.Factory;
import com.grid.maze.singletons.Graph;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class GoodRoom implements Room {
    private Random r = new Random();
    private List<Long> neighboringRooms;
    private Ghost ghost;
    private Long id;

    public GoodRoom() {
        addGhostInRoom();
    }

    @Override
    public void getNeighboringRooms() {
        this.neighboringRooms = Graph.getNeighbors(id);
        System.out.println(neighboringRooms);
    }

    @Override
    public void setIdRoom(Long id) {
        this.id = id;
    }

    @Override
    public void useGhost() {
        if (ghost == null) {
            System.out.println("You are lucky!");
        } else {
            ghost.sayName();
            if (ghost.makeRiddle()) {
                System.out.println("You are the best!");
                ghost.usedPositiveSkill();
            } else {
                System.out.println("You are loser!");
                ghost.usedNegativeSkill();
            }
        }
    }

    private void addGhostInRoom() {
        AbstractFactory factory = new Factory().getFactory(Status.EVIL);
        if (!r.nextBoolean()) {
            this.ghost = factory.getGhost();
        } else {
            this.ghost = factory.getGhost();
        }
    }
}
