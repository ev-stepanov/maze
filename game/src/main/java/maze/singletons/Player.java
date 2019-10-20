package maze.singletons;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class Player {
    private static volatile Player player = null;

    private LinkedList<Long> historyRooms;
    private Long currentRoom;
    private String name;
    private Integer live;
    private Integer level;
    private Integer exp;

    private Player() {
        this.historyRooms = new LinkedList<>();
        this.name = "Champion";
        this.currentRoom = 0L;
        this.level = 0;
        this.live = 3;
        this.exp = 0;
    }

    public static Player getInstance() {
        if (player == null) {
            synchronized (Player.class) {
                if (player == null) {
                    player = new Player();
                }
            }
        }
        return player;
    }

    public void moveToNextRoom(Long nextRoom) {
        List<Long> neighbors = Graph.getNeighbors(currentRoom);
        if (!neighbors.contains(nextRoom)) {
            System.out.println("No exist room");
        } else {
            currentRoom = nextRoom;
            historyRooms.add(currentRoom);
        }
    }

    public void showMyLive() {
        System.out.println("Live: " + live);
    }
}
