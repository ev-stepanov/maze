package maze.factories;

import maze.entity.interfaces.Ghost;
import maze.entity.interfaces.Riddle;
import maze.entity.interfaces.Room;

public interface AbstractFactory {
    Ghost getGhost();
    Riddle getRiddle();
    Room getRoom();
}
