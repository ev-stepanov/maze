package maze.entity.kind;

import maze.entity.interfaces.Riddle;
import org.springframework.stereotype.Component;

@Component
public class GoodRiddle implements Riddle {
    @Override
    public void makeRiddle() {
        //create request to database
    }
}
