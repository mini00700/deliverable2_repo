import static org.junit.Assert.*;

import org.junit.Test;


public class RoomTest {

	@Test
	public void testHasItem() {
		Room r = new Room(true, true, true,true,true);
		boolean result1 = r.hasItem();
		assertEquals(result1,true);
	}
	
	@Test
	public void testGetdescription() {
		Room r = new Room(true, false, true,true,true);
		String result2 = r.getDescription();
		assertEquals(result2,"what");
	}

}
