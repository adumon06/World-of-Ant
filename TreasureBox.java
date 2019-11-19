import java.util.ArrayList;
import java.util.List;
/**
 * This is a box which can contain keys and special item. It can also be locked.
 *
 * @author Group 8 - Marion Guernoté, Dylan Mielot, Fanny Barbe, Alix Nagot, Ambre Dumontet, Angélique Gombert, Thibault Crouzet
 * @version 19/11/2019
 */
public class TreasureBox extends Item
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Key> keys;
    private List<Special> special;
    private Lock lock;

    /**
     * Create a treasure box without lock 
     */
    public TreasureBox(String tName, List<Key> key, List<Special> specials )
    {
        super(tName);
        keys = key;
        special = specials;
    }
    
    /**
     * Create a treasure box with lock 
     */
    public TreasureBox(String tName, List<Key> key, List<Special> specials, Lock aLock )
    {
        super(tName);
        keys = key;
        special = specials;
        lock = aLock;
    }
    
    public List<Key> getKey ()
    {
        return keys;
    }
    
     public List<Special> getSpecial ()
    {
        return special;
    }
}
