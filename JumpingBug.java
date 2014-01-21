import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;

import java.awt.Color;
public class JumpingBug extends Bug {
	public JumpingBug(){
		
	}
	public void act(){
		if(canMove()){
			move();
		}else
			turn();


	}
	public void move()
	{
	    Grid gr = getGrid();
	    if (gr == null)
	        return;
	    Location loc = getLocation();
	    Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
	    if (gr.isValid(next))
	        moveTo(next);
	    else
	        removeSelfFromGrid();
	}
	public boolean canMove()
	{
	    Grid gr = getGrid();
	    if (gr == null)
	        return false;
	    Location loc = getLocation();
	    Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
	    if (!gr.isValid(next))
	        return false;
	    Actor neighbor = (Actor)gr.get(next);
	    return (neighbor == null);
	}
}