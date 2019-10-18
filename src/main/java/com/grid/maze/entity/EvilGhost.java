package com.grid.maze.entity;

import com.grid.maze.singletons.Player;
import lombok.Data;

import java.util.Random;

@Data
public class EvilGhost implements Ghost {
    Player player;
    private String name;
    private Integer damage;

    private EvilGhost(GhostBuilder ghostBuilder) {
        this.name = ghostBuilder.name;
        this.damage = ghostBuilder.damage;
        this.player = Player.getInstance();
    }

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

    public static class GhostBuilder {
        private String name;
        private Integer damage;

        public GhostBuilder name(String name) {
            this.name = name;
            return this;
        }

        public GhostBuilder damage(Integer damage) {
            this.damage = damage;
            return this;
        }

        public EvilGhost build() {
            return new EvilGhost(this);
        }
    }
}
