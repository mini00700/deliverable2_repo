import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GameTest {

	//Player can move to the north room.
	@Test
	public void testMoveNorth() {
		Player p = mock (Player.class);
		House h = mock (House.class);
		Game g= new Game(p,h);
		
		int result = g.doSomething("N");
		
		verify(h,times(1)).moveNorth();
		assertEquals(result,0);
	}

	//Player can treat "n" the same as "N" and move to the north room.
	@Test
	public void testMoveNorthIgnoreCase(){
		Player p = mock (Player.class);
		House h = mock (House.class);
		Game g = new Game(p, h);
		
		int result = g.doSomething("n");
		
		verify(h,times(1)).moveNorth();
		assertEquals(result, 0);
	}
	
	//When player collect all the inventories, he/she will win the game
	@Test
	public void testDrink1() {
		Player p = mock (Player.class);
		House h = mock (House.class);
		Game g= new Game(p,h);
		when(p.drink()).thenReturn(true);
		
		int result = g.doSomething("D");
		
		assertEquals(result,1);
	}
	
	//When player cannot collect all the inventories, he/she will lose the game
	@Test
	public void testDrink2() {
		Player p = mock (Player.class);
		House h = mock (House.class);
		Game g= new Game(p,h);
		when(p.drink()).thenReturn(false);
		
		int result = g.doSomething("D");
		
		assertEquals(result,-1);
	}
	
	//Player can move to the south room.
	@Test
	public void testMoveSouth() {
		Player p = mock (Player.class);
		House h = mock (House.class);
		Game g= new Game(p,h);
		
		int result = g.doSomething("S");
		
		verify(h,times(1)).moveSouth();
		assertEquals(result,0);
	}

	//Player can treat "s" the same as "S" and move to the south room.
	@Test
	public void testMoveSouthIgnoreCase(){
		Player p = mock (Player.class);
		House h = mock (House.class);
		Game g = new Game(p, h);
		
		int result = g.doSomething("s");
		
		verify(h,times(1)).moveSouth();
		assertEquals(result, 0);
	}
	
	//Player can see the list of inventory.
	@Test
	public void testInventory() {
		Player p = mock (Player.class);
		House h = mock (House.class);
		Game g= new Game(p,h);
		
		
		int result = g.doSomething("I");
		
		verify(p,times(1)).showInventory();
		assertEquals(result,0);
	}
	
	//Player can look the content in the particular room.
	@Test
	public void testLook() {
		Player p = mock (Player.class);
		House h = mock (House.class);
		Game g= new Game(p,h);
		
		int result = g.doSomething("L");
		
		verify(h,times(1)).look(p, null);
		assertEquals(result,0);
	}
	
	//Player can get the help through the game.
	@Test
	public void testHelp() {
		Player p = mock (Player.class);
		House h = mock (House.class);
		Game g= new Game(p,h);
		
		int result = g.doSomething("H");
		assertEquals(result,0);
	}

}
