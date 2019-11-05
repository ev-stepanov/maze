package maze.entity.kind;

import maze.singletons.Player;
import maze.entity.interfaces.Ghost;
import org.springframework.stereotype.Component;

@Component
public class GoodGhost implements Ghost {
    private Player player;
    private Integer damage;
    private String name;

    public GoodGhost() {
        this.player = Player.getInstance();
        this.name = "Casper II";
        this.damage = 1;
    }

    @Override
    public void sayName() {
        System.out.println("My name is " + name + "!");
    }

    @Override
    public Boolean makeRiddle() {
        //db
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
}
