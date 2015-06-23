
import static org.junit.Assert.*;

import org.junit.Test;


public class CoffeeMakerTest {

	//This tests coffee maker can officially run.
	@Test
	public void testRunArgs() {
		CoffeeMaker cm = new CoffeeMaker();
		int result = cm.runArgs("foo");
		assertEquals(result,0);
	}

}
