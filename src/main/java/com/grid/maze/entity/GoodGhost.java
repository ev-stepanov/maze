package com.grid.maze.entity;

import com.grid.maze.singletons.Player;

import java.util.Random;

public class GoodGhost implements Ghost {
    Player player = Player.getInstance();

    @Override
    public void sayName() {

    }

    @Override
    public Boolean makeRiddle() {
        Random random = new Random();
        return random.nextBoolean();
    }

    @Override
    public void usedPositiveSkill() {
        player.setLive(player.getLive() + 1);
    }

    @Override
    public void usedNegativeSkill() {
        player.setLive(player.getLive() - 1);
    }

}
