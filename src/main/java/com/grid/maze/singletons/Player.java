package com.grid.maze.singletons;

public class Player {
    private static volatile Player player = null;

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
