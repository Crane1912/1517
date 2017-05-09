import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void Captest() {
		Car c1= new Car();
		int c= c1.getEngineCapacity();
		assertEquals(100,c);
	}

}
