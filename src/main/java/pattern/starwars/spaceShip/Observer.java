package pattern.starwars.spaceShip;

import pattern.starwars.message.Message;

public interface Observer {
	public void update(Message order);
}
