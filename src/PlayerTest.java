import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class PlayerTest {

	@Test
	public void testDrink() {
		Player p = new Player(true,true,true);
		
		boolean result=p.drink();
		assertEquals(result,true);
	}
	
	@Test
	public void testHasallitem() {
		Player p = new Player(true,false,true);
		
		boolean result=p.hasAllItems();
		assertEquals(result,false);
	}

}
