package com.grid.maze;

import com.grid.maze.adapters.GraphService;
import com.grid.maze.entity.*;
import com.grid.maze.factories.AbstractFactory;
import com.grid.maze.factories.Factory;
import com.grid.maze.singletons.Graph;
import com.grid.maze.singletons.Player;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Scanner;
@Component
public class MazeComponent {
    private final Factory factory;

    private final GraphService graphService;

    public MazeComponent(GraphService graphService, Factory factory) {
        this.graphService = graphService;
        this.factory = factory;
    }

    //enter point
    @PostConstruct
    private void postConstruct() throws IOException {
        Player player = Player.getInstance();
        graphService.readGraph();

        Integer finishRoom = Graph.getFinishRoom();

        AbstractFactory factory = this.factory.getFactory(Status.GOOD);

        long l = 0;
        Scanner scanner = new Scanner(System.in);
        while (player.getCurrentRoom() != finishRoom.intValue()) {
            Room room = factory.getRoom();
            room.setIdRoom(l);
            room.useGhost();
            room.getNeighboringRooms();

            System.out.println("Enter next room: ");
            l = scanner.nextLong();
            player.moveToNextRoom(l);

            player.showMyLive();
        }

        System.out.println("You are win!");
    }

    private void chooseNextRoom(AbstractFactory factory) {
        Player player = Player.getInstance();
        Ghost ghost = factory.getGhost();
        Demon demon = new Demon(ghost);
        player.showMyLive();
        player.showMyLive();
        player.showMyLive();
        Riddle riddle = factory.getRiddle();
        Room room = factory.getRoom();

        EvilGhost casper = new EvilGhost.GhostBuilder().damage(1).name("casper").build();
        casper.sayName();

        riddle.makeRiddle();
    }
}
