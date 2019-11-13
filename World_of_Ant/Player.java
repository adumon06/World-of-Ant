import java.util.ArrayList;
import java.util.List;
/**
 * Décrivez votre classe Ant ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Player extends Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Item> bag;
    private int sizeBag;
    
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
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void moveRoom()
    {
        // Insérez votre code ici
      
    }
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void pickUp()
    {
        // Insérez votre code ici
        
    }
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void drop()
    {
        // Insérez votre code ici
        
    }
}
