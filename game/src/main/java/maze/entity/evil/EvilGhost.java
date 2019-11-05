package maze.entity.evil;

import lombok.Data;
import maze.entity.enums.Status;
import maze.entity.interfaces.Ghost;
import maze.entity.interfaces.Riddle;
import maze.factories.Factory;
import maze.singletons.Player;
import org.springframework.stereotype.Component;

@Data
@Component
public class EvilGhost implements Ghost {
    private Player player;
    private String name;
    private Integer damage;
    private Riddle riddle;

    private EvilGhost(GhostBuilder ghostBuilder) {
        this.name = ghostBuilder.name;
        this.damage = ghostBuilder.damage;
        this.player = Player.getInstance();
        this.riddle = new Factory().getFactory(Status.EVIL).getRiddle();
    }

    @Override
    public void sayName() {
        System.out.println("My name is " + name + "!");
    }

    @Override
    public Boolean makeRiddle() {
        riddle.makeRiddle();
        return true;
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
