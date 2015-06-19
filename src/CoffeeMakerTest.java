
import static org.junit.Assert.*;

import org.junit.Test;


public class CoffeeMakerTest {

	@Test
	public void test() {
		CoffeeMaker cm = new CoffeeMaker();
		int result = cm.runArgs("foo");
		assertEquals(result,0);
	}

}
