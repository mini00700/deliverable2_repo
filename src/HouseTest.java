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
		House h = new House(1);
		Room[] rooms = h.generateRooms(3);
		assertNotNull(rooms);
	}

}
  


  