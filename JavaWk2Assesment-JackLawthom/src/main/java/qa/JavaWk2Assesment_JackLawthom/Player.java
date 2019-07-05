package qa.JavaWk2Assesment_JackLawthom;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Player {
	public Player() {
		super();
	}
	public Player(List<String> userInput) {
		this.userInput = userInput;		
	}
	
	private int coordinateX;
	private int coordinateY;
	private int boxes;
	private List<String> userInput;
	private static int userInCount = 0;
	private static int health = 10;
	
	public int getHealth() {
		return health;
	}
	public void decreaseHealth(int damage) {
		health -= damage;
	}
	public int getBoxes() {
		return boxes;
	}

	public void addBox() {
		this.boxes++;
	}	
	
	public List<String> getUserInput() {
		return userInput;
	}
	public void setUserInput(List<String> userInput) {
		this.userInput = userInput;
	}
	
	public List<Integer> getCoordinates() {
		List<Integer> coordinates = new ArrayList<>();
		coordinates.add(coordinateX);
		coordinates.add(coordinateY);
		return coordinates;
	}
	
	public double getDistance(Item item) {		
		
		int disX = coordinateX - item.getCoordinates().get(0);
		int disY = coordinateY - item.getCoordinates().get(1);
		
		return Math.hypot(disX, disY);			
	}
	
	public String getUserInput(List<String> userInput) {
		String direction = "";
		String dir = "";
		
		if (userInput == null) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter direction to move:");
			dir = scan.nextLine();
			System.out.println("");				
		} else {
			dir = userInput.get(userInCount);
			userInCount++;
		}
		
		direction = convertInput(dir);
		
		return direction;		
	}

	public void move() {		
		String direction = getUserInput(this.userInput);		
		
		if (direction.equals("N")) {
			coordinateY++;
		}
		else if (direction.equals("E")) {
			coordinateX++;
		}
		else if (direction.equals("S")) {
			coordinateY--;
		}
		else if (direction.equals("W")) {
			coordinateX--;
		} else {
			System.out.println("Invalid Direction, try again.");
		}
		
			
	}
	
	public String convertInput(String userIn) {
		List<List<String>> convertor = new ArrayList<>();
		
		List<String> north = Arrays.asList("N", "North", "north", "n");
		List<String> south = Arrays.asList("S", "South", "south", "s");
		List<String> east = Arrays.asList("E", "East", "east", "e");
		List<String> west = Arrays.asList("W", "West", "west", "w");
		
		convertor.add(north);
		convertor.add(south);
		convertor.add(east);
		convertor.add(west);
		
		for (List<String> i : convertor) {
			if (i.contains(userIn)) {
				return i.get(0); 
			}
		}
		return userIn;
	}
	
	

}
