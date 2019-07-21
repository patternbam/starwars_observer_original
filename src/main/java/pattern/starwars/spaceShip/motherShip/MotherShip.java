package pattern.starwars.spaceShip.motherShip;

import java.util.ArrayList;

import pattern.starwars.message.Message;
import pattern.starwars.spaceShip.Observer;
import pattern.starwars.spaceShip.Subject;

public class MotherShip implements Subject {

	private ArrayList observers;
	private Message order;

	public MotherShip() {
		observers = new ArrayList();
	}

	public void order(Message order) {
		this.order= order;
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);

		if (index > 0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObserver(Observer o) {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(order);
		}
	}
}