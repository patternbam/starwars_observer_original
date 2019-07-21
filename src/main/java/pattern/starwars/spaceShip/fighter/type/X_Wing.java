package pattern.starwars.spaceShip.fighter.type;

import pattern.starwars.message.Message;
import pattern.starwars.spaceShip.fighter.Fighter;

public class X_Wing extends Fighter {

	@Override
	public void receiveOrder(Message order) {
		System.out.println("X-Wing. " + order.getMessage() + " copy that.");
	}
}