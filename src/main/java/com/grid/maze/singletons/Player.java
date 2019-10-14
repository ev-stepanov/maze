package com.grid.maze.singletons;

import lombok.Data;

@Data
public class Player {
    private static volatile Player player = null;

    private String name;
    private Integer live;
    private Integer level;
    private Integer exp;

    private Player() {}

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
}
