package maze.entity.kind;

import maze.factories.AbstractFactory;
import maze.factories.Factory;
import maze.singletons.Graph;
import maze.entity.interfaces.Room;
import maze.entity.interfaces.Ghost;
import maze.entity.enums.Status;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class GoodRoom implements Room {
    private Ghost ghost;
    private Long id;

    public GoodRoom() {
        AbstractFactory factory = new Factory().getFactory(Status.GOOD);
        Random r = new Random();
        if (!r.nextBoolean()) {
            this.ghost = factory.getGhost();
        } else {
            this.ghost = null;
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
}
