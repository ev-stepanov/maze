package com.grid.maze.factories;

import com.grid.maze.entity.Status;
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
