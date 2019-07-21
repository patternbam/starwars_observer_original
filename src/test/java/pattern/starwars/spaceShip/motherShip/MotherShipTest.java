package pattern.starwars.spaceShip.motherShip;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import pattern.starwars.message.Message;
import pattern.starwars.spaceShip.fighter.type.X_Wing;
import pattern.starwars.spaceShip.fighter.type.Y_Wing;

@RunWith(MockitoJUnitRunner.class)
public class MotherShipTest {

	@Spy
	private X_Wing xWing= new X_Wing();
	
	@Spy
	private Y_Wing yWing= new Y_Wing();
	
	@InjectMocks
	private MotherShip motherShip = new MotherShip();
	//private X_Wing xWing = new X_Wing();
	//private Y_Wing yWing = new Y_Wing();

	@Test
	public void motherShip_생성자() {
		assertNotNull(motherShip);
	}

	@Test
	public void motherShip_출격명령() {

		// arrange
		Message message = new Message("Sortie to 306 disctict.");
		motherShip.registerObserver(xWing);
		motherShip.registerObserver(yWing);
		motherShip.order(message);

		// act
		motherShip.notifyObserver(xWing);
		
		// assert
		verify(xWing, times(1)).receiveOrder(message);
	}
}