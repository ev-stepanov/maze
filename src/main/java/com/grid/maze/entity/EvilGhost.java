package com.grid.maze.entity;

import lombok.Data;

@Data
public class EvilGhost implements Ghost {
    private String name;
    private Integer damage;

    private EvilGhost(GhostBuilder ghostBuilder) {
        this.name = ghostBuilder.name;
        this.damage = ghostBuilder.damage;
    }

    @Override
    public void sayName() {

    }

    @Override
    public void makeRiddle() {

    }

    @Override
    public void usedSkill() {

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
