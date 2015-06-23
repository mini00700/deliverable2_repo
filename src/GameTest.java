import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GameTest {

	@Test
	public void testMoveNorth() {
		Player p = mock (Player.class);
		House h = mock (House.class);
		Game g= new Game(p,h);
		
		
		int result = g.doSomething("N");
		
		verify(h,times(1)).moveNorth();;;
		assertEquals(result,0);
	}
	
	@Test
	public void testDrink() {
		Player p = mock (Player.class);
		House h = mock (House.class);
		Game g= new Game(p,h);
		
		
		int result = g.doSomething("D");
		
		verify(p,times(1)).drink();;
		assertEquals(result,-1);
	}
	
	@Test
	public void testMoveSouth() {
		Player p = mock (Player.class);
		House h = mock (House.class);
		Game g= new Game(p,h);
		
		
		int result = g.doSomething("S");
		
		verify(h,times(1)).moveSouth();
		assertEquals(result,0);
	}
	
	@Test
	public void testInventory() {
		Player p = mock (Player.class);
		House h = mock (House.class);
		Game g= new Game(p,h);
		
		
		int result = g.doSomething("I");
		
		verify(p,times(1)).showInventory();;;
		assertEquals(result,0);
	}
	
	@Test
	public void testLook() {
		Player p = mock (Player.class);
		House h = mock (House.class);
		Game g= new Game(p,h);
		
		
		int result = g.doSomething("L");
		
		verify(h,times(1)).look(p, null);
		assertEquals(result,0);
	}
	
	@Test
	public void testHelp() {
		Player p = mock (Player.class);
		House h = mock (House.class);
		Game g= new Game(p,h);
		
		
		int result = g.doSomething("H");
		assertEquals(result,0);
	}

}
