package maze.factories;

import maze.entity.interfaces.Ghost;
import maze.entity.kind.GoodGhost;
import maze.entity.kind.GoodRiddle;
import maze.entity.kind.GoodRoom;
import maze.entity.interfaces.Riddle;
import maze.entity.interfaces.Room;

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
