package qa.JavaWk2Assesment_JackLawthom;

import java.util.Random;

public class Game {
	public Game(Player player) {
		super();
		this.player = player;
	}
	
	private Player player;
	private int winBox = 2;
	private String winText = "", boxText = "";
	
	public void play() {		
		
		System.out.println("Grey foggy clouds float oppressively close to you, \r\n" +
				"reflected in the murky grey water which reaches up your shins.\r\n" +
				"Some black plants barely poke out of the shallow water.\r\n" + 
				"Try \"north\",\"south\",\"east\",or \"west\"\r\n" + 
				"You notice a small watch-like device in your left hand.  \r\n" + 
				"It has hands like a watch, but the hands don't seem to tell time. " +
				"\r\n");
		
		while (player.getBoxes() < winBox) {
			Item item = createNewItem(player);
		
			while(player.getDistance(item) > 0) {
				Random r = new Random();
				if (r.nextInt(100) < 50) {
					System.out.println("You've been attacked by a zombie!");
					Zombie zomb = new Zombie();
					zomb.setDamage(2);
					zomb.attack(player);
				}
				
				System.out.println("Your health is: " + player.getHealth());
				System.out.println("The dial reads: " + player.getDistance(item));
				
				player.move();
				
			}
			player.addBox();
			
			
			
			if (player.getBoxes() == 1) {
				boxText = "You now have 1 box! ";
			} else {
				boxText = "You now have " + player.getBoxes() + " boxes! ";
			}
			
			if (player.getBoxes() < winBox) {
				winText = "Find the next box!\r\n";
			} else {
				winText = "You win! The end.";
			}
			System.out.println("You see a box sitting on the plain.   Its filled with treasure!	  " + boxText + winText);		
		}
		
	}
	
	public Item createNewItem(Player player) {
		return new Item(player.getCoordinates());
	}

	public Player getPlayer() {
		return player;
	}
	
	

}
