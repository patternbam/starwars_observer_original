package pattern.starwars.spaceShip.fighter.type;

import pattern.starwars.message.Message;
import pattern.starwars.spaceShip.fighter.Fighter;

public class Y_Wing extends Fighter {

	@Override
	public void receiveOrder(Message order) {
		System.out.println("Y-Wing. " + order.getMessage() + " roger that.");
	}
}