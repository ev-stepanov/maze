package maze.factories;

import maze.entity.enums.Status;
import org.springframework.stereotype.Component;

@Component
public class Factory {
    public AbstractFactory getFactory(Status status) {
        switch (status) {
            case EVIL:{
                return new EvilFactory();
            }
            case GOOD:{
                return new GoodFactory();
            }
            default:{
                return null;
            }
        }
    }
}
