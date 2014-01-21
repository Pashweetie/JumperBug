import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;


import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class JumperRunner{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        JumpingBug alice = new JumpingBug();
        FlowerPower flower = new FlowerPower();
        FlowerPower flowerOther = new FlowerPower();
        alice.setColor(Color.ORANGE);
        world.add(new Location(6, 6), alice);
        world.add(new Location(4, 6), flower);
        world.add(new Location(5, 7), flowerOther);
        world.show();
    }
}