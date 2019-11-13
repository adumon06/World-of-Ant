import java.util.ArrayList;
import java.util.List;
/**
 * Décrivez votre classe Treasure_box ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TreasureBox extends Item
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private List<Key> key;
    private List<Special> special;

    /**
     * Constructeur d'objets de classe Treasure_box
     */
    public TreasureBox(String tName)
    {
        super(tName);
    }
}
