import info.gridworld.actor.Flower;

import java.awt.Color;
public class FlowerPower extends Flower{
    private int counter = 0;
    public void act(){
        if (counter % 2 == 0) {
            setColor(new Color(0,0,0));
        }else if(counter % 2 != 0){
            setColor(Color.PINK);
        }
        counter++;
    }
}