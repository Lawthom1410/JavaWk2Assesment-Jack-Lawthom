package qa.JavaWk2Assesment_JackLawthom;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Player player1 = new Player();
    	Game game1 = new Game(player1);
    	
    	game1.play();
    	
    	
    }
}
