package pattern.starwars.spaceShip.fighter;

import pattern.starwars.message.Message;

public class Fighter implements pattern.starwars.spaceShip.Observer {
	
	public void receiveOrder(Message message) {
		
	}

	@Override
	public void update(Message order) {
		receiveOrder(order);
	}
}