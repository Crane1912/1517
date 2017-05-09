import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void Captest() {
		Car c1= new Car(200);
		int c= c1.getEngineCapacity();
		assertEquals(200,c);
	}

}
