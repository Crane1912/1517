import static org.junit.Assert.*;

import org.junit.Test;

public class NameTest {

	@Test
	public void Nametest() {
		Car c2=new Car(200);
		String s1=c2.CarName("BMW");
		assertEquals("BMW",s1);
	}

}
