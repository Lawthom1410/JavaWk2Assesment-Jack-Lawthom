package qa.JavaWk2Assesment_JackLawthom;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class AppTest {
	List<String> moves = Arrays.asList("w", "North", "south", "E", "n", "n");
	Player testPlayer = new Player(moves);
	Game testGame = new Game(testPlayer);
	Item testItem = new Item(testPlayer.getCoordinates());
	
	@Test
	public void testItemDistance() {		
		assertNotNull(testPlayer.getDistance(testItem));				
	}
	
	@Test
	public void testMoves() {
		testGame.play();
		List<Integer> expectedCoordinates = Arrays.asList(0,2);
		List<Integer> actualCoordinates = testPlayer.getCoordinates();
		System.out.println(expectedCoordinates);
		System.out.println(actualCoordinates);
		assertThat(expectedCoordinates, is(actualCoordinates));
	}
	
	
	
}