import java.util.ArrayList;
import java.util.List;
/**
 * Class Game 
 * Contains the main that allows to the user to start a game
 *
 * @author Group8
 * @version 13/11/2019
 */
public class Game
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Room> room;
    private List<Character> character;
    private int timer;
    private int count;

    /**
     * Constructor of the Game
     */
    public Game()
    {
        
    }
    
    /**
     * Method to choose the player : deliveroo or stolen ant
     * 
     * @return type : "deliver" for deliveroo ant 
     *                "stolen" for stolen ant    
     */
    public String choosePlayer()
    {
      return "";
    }
    
    /**
     * Method that give if the player win or loose
     * It will check on the bag of the player : 
     * if the deliveroo ant have more than 5 deliveries on the bag 
     * or if the stolent ant have less than 5 deliveries on the bag 
     * the player is a looser !!
     *
     * @param  ant type of player (deliveroo or stolen)
     */
    public void result(Player ant)
    {
        
    }
}
