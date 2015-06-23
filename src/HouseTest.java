import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;


public class HouseTest {

	//Game can present the information of current room.
	@Test
	public void testCurrentRoomInfo() {
		Room r = mock(Room.class);
		//I suppose this method can return "Test" as the information of current room.
		when(r.getDescription()).thenReturn("Test");
		Room[] rooms = new Room[1];
		rooms[0]=r;
		House h = new House(rooms);
		String result = h.getCurrentRoomInfo();
		assertEquals(result,"Test");
	}
	
	@Test
	public void testGeneraterooms() {
		Room r1 = mock(Room.class);
		Room r2 = mock(Room.class);
		Room[] rooms = new Room[2];
		rooms[0]=r1;
		rooms[1]=r2;
		House h = new House(rooms);
		Room[] result = h.generateRooms(1);
		assertEquals(result,"what");
	}

}
  