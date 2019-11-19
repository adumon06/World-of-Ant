import java.util.ArrayList;
import java.util.List;
/**
 * Décrivez votre classe Ant ici.
 *
 * @author G8
 * @version (un numéro de version ou une date)
 */
public class Player extends Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Item> bag; //simulate the inventory of the ant
    private int sizeBag; // the maximum size of the bag
    
    /**
     * Constructeur d'objets de classe Ant
     */
    public Player(String pName)
    {
        super(pName);
        bag = new ArrayList<Item>();
        sizeBag = 20; 
    }
    /**
     * return the inventory of the player
     * @return bag who is a list of Item
     */
    public List<Item> getBag()
    {
        return bag;
    }
    /**
     * return the maximum size of the inventory
     * return sizeBag whho is a integer representing the maximum size of the inventory
     */
    public int getSizeBag()
    {
        return sizeBag;
    }
    
    /**
     * Allow the ant to move between the room
     */
    public void moveRoom()
    {
        // Insérez votre code ici
      
    }
    
    /**
     * Take an item in the Room and put it the bag
     * @parameter loot who is an item in the room who is a item class
     * 
     */
    public void pickUp(Item loot)
    {
        // Insérez votre code ici
        
    }
    
    /**
     * Drop an item in the room
     * @parameter  thedropName reprensent the name of the item that will be droped is the room
     * @return thedrop is the item that is droped in the room
     */
    public Item drop(String thedropName)
    {
        // Insérez votre code ici
        Item drop;
        drop = new Item("");
        return drop;
    }
}
