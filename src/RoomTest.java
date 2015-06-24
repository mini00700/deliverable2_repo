import static org.junit.Assert.*;

import org.junit.Test;

public class RoomTest {

	//Player can know whether the room has items.
	@Test
	public void testHasItem() {
		Room r = new Room(true, true, true,true,true);
		boolean result1 = r.hasItem();
		assertEquals(result1,true);
	}
	
	
	//Player can get room information.
	@Test
	public void testGetdescription() {
		Room r = new Room(true, false, true,true,true);
		String result2 = r.getDescription();
		assertNotNull(result2);
	}
	
	//Player can know whether the room has exist.
	@Test
	public void testHasExist() {
		Room r = new Room(true, false, true,false,true);
		boolean result1 = r.northExit();
		boolean result2 = r.southExit();
		assertEquals(result1,false);
		assertEquals(result2,true);
	}
	
	//Player can know whether the room has sugar.
	@Test
	public void testHasSugar() {
		Room r = new Room(true, true, true,true,true);
		boolean result3 = r.hasSugar();
		assertEquals(result3,true);
	}
	
	//Player can know whether the room has cream.
	@Test
	public void testHasCream() {
		Room r = new Room(true, true, true,true,true);
		boolean result4 = r.hasCream();
		assertEquals(result4,true);
	}
	
	//Player can know whether the room has coffee.
	@Test
	public void testHasCoffee() {
		Room r = new Room(true, true, true,true,true);
		boolean result5 = r.hasCoffee();
		assertEquals(result5,true);
	}

}

