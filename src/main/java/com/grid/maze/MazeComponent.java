package com.grid.maze;

import com.grid.maze.adapters.GraphService;
import com.grid.maze.entity.*;
import com.grid.maze.factories.AbstractFactory;
import com.grid.maze.factories.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MazeComponent {
    @Autowired
    private Factory factory;

    @Autowired
    private GraphService graphService;

    private final Map<Long, List<Long>> GRAPH = new HashMap<>();

    @PostConstruct
    private void postConstruct() throws IOException {
        AbstractFactory factory = this.factory.getFactory(Status.EVIL);

        chooseNextRoom(factory);

        graphService.readGraph();
        //enter point
    }

    public void chooseNextRoom(AbstractFactory factory) {
        Ghost ghost = factory.getGhost();
        Riddle riddle = factory.getRiddle();
        Room room = factory.getRoom();

        EvilGhost casper = new EvilGhost.GhostBuilder().damage(1).name("casper").build();
        casper.sayName();

        riddle.makeRiddle();
        room.getRoom();
    }
}
