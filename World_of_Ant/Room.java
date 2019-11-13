import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Set;
/**
 * Room is the class that represents each accessible room in the game
 * There is two levels : level up and level down.
 * Level up represents the surface (human houses)
 * and the level down represents ants gallery.
 *
 * @author Group 8 (Angélique and Dylan)
 * @version 13/11/2019
 */
public class Room
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Human> human;
    private List<Item> item;
    private List<Door> door;
    private HashMap<String, Room> exits; 
    private String description;
    
    /**
     * Adds a description to the room
     * @param rDescription is a description of the room.
     */
    public Room(String rDescription)
    {
       //exits = new HashMap<>();
       description = rDescription;
    }

    /**
     * displays the possible exits in the room.
     *
     */
    public void getExit()
    {
    }
    
    /**
     * displays the description of the room
     *
     */
    public void getDescr()
    {
        
    }
    
    /**
     * displays the available items in the room.
     *
     */
    public void getItem()
    {
        
    }
    
    /**
     * adds an item
     *
     *@param anItem The item added in the room
     */
    public void addItem(Item anItem)
    {
        
    }
    
    /**
     * remove an item from the room (When it's picked up by an ant).
     *
     * @param anItem the item removed in the room
     */
    public void removeItem(Item anItem)
    {
        
    }
}
