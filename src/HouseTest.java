import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

;
public class HouseTest {

	@Test
	public void testCurrentRoomInfo() {
		Room r = mock(Room.class);
		when(r.getDescription()).thenReturn("Test");
		Room[] rooms = new Room[1];
		rooms[0]=r;
		House h = new House(rooms);
		String result = h.getCurrentRoomInfo();
		assertEquals(result,"Test");
	}

}
  