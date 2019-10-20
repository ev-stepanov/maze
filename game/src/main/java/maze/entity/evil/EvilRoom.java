package maze.entity.evil;

import maze.factories.Factory;
import maze.singletons.Graph;
import maze.entity.interfaces.Ghost;
import maze.entity.interfaces.Room;
import maze.entity.enums.Status;

import java.util.Random;

public class EvilRoom implements Room {
    private Ghost ghost;
    private Long id;

    public EvilRoom() {
        Random r = new Random();
        if (!r.nextBoolean()) {
            this.ghost = new Factory().getFactory(Status.EVIL).getGhost();
        } else {
            this.ghost = new Factory().getFactory(Status.GOOD).getGhost();
        }
    }

    @Override
    public void getNeighboringRooms() {
        System.out.println(Graph.getNeighbors(id));
    }

    @Override
    public void setIdRoom(Long id) {
        this.id = id;
    }

    @Override
    public void useGhost() {
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
