import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class PlayerTest {

	@Test
	public void drinktest() {
		Player p = mock(Player.class);
		
		boolean result=p.drink();
		System.out.println(result);
		assertEquals(result,true);
	}

}
