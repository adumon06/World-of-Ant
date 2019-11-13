import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Set;
/**
 * Décrivez votre classe Room ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
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
     * Constructeur d'objets de classe Room
     */
    public Room(String rDescription)
    {
       exits = new HashMap<>(); 
       description = rDescription;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public Room getExit(String direction)
    {
        // Insérez votre code ici
        return exits.get(direction);
    }
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void getDescr()
    {
        
    }
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void getItem(String direction)
    {
        
    }
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void addItem(Item anItem)
    {
        
    }
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void removeItem(Item anItem)
    {
        
    }
}
