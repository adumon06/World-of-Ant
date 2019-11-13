import java.util.ArrayList;
import java.util.List;
/**
 * Treasure box of the game that are in the gallery.
 *
 * @Ad
 * @13/11/2019
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
