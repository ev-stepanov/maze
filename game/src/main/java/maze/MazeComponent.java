package maze;

import maze.entity.enums.Status;
import maze.entity.interfaces.Room;
import maze.servises.GraphService;
import maze.factories.AbstractFactory;
import maze.factories.Factory;
import maze.singletons.Graph;
import maze.singletons.Player;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Scanner;

@Component
public class MazeComponent {
    private final Factory factory;

    private final GraphService graphService;

    public MazeComponent(GraphService graphService) {
        this.graphService = graphService;
        this.factory = new Factory();
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
}
