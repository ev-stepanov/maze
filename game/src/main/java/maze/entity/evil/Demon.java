package maze.entity.evil;

import maze.entity.interfaces.Ghost;

public class Demon extends DemonDecorator {

    public Demon(Ghost ghost) {
        super(ghost);
    }

    @Override
    public void sayName() {
        System.out.println("I AM DEMON!");
    }

    @Override
    public void usedPositiveSkill() {

    }

    @Override
    public void usedNegativeSkill() {

    }
}