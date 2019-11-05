package maze.factories;

import com.grid.load_riddles.service.RiddleService;
import maze.entity.evil.EvilGhost;
import maze.entity.evil.EvilRiddle;
import maze.entity.evil.EvilRoom;
import maze.entity.interfaces.Ghost;
import maze.entity.interfaces.Riddle;
import maze.entity.interfaces.Room;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class EvilFactory implements AbstractFactory {
    //service Ghost
    public Ghost getGhost() {
        return new EvilGhost.GhostBuilder()
                .damage(1)
                .name("casper")
                .build();
    }

    public Riddle getRiddle() {
        return new EvilRiddle();
    }

    public Room getRoom() {
        return new EvilRoom();
    }
}
