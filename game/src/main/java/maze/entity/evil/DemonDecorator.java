package maze.entity.evil;

import maze.entity.interfaces.Ghost;

public abstract class DemonDecorator implements Ghost {
    protected Ghost ghost;

    DemonDecorator(Ghost ghost) {
        this.ghost = ghost;
    }

    @Override
    public Boolean makeRiddle() {
        return true;
    }

    @Override
    public void sayName() {
        ghost.sayName();
    }

}
