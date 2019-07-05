package qa.JavaWk2Assesment_JackLawthom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Item {
	public Item(List<Integer> playerCoord) {
		super();
		Random r = new Random();
		while (coordinateX == 0 && coordinateY == 0) {
			coordinateX = r.nextInt(playerCoord.get(0)+10);
			coordinateY = r.nextInt(playerCoord.get(1)+10);
			dirX = r.nextInt(2);
			dirY = r.nextInt(2);
		}
		
		if (dirX == 1) {
			coordinateX *= -1;
		}
		if (dirY == 1) {
			coordinateY *= -1;
		}
	}
	
	private int coordinateX;
	private int coordinateY;
	private int dirX;
	private int dirY;
	
	
	public List<Integer> getCoordinates() {
		List<Integer> coordinates = new ArrayList<>();
		coordinates.add(coordinateX);
		coordinates.add(coordinateY);
		return coordinates;
	}

}
