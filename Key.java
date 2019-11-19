
/**
 * Key is used by a door to open to open it if the door is closed, and if the key belongs at the door
 *
 * @author Group 8 - Marion Guernoté, Dylan Mielot, Fanny Barbe, Alix Nagot, Ambre Dumontet, Angélique Gombert, Thibault Crouzet
 * @version 19/11/2019
 */

public class Key extends Item
{

    private Door door; 
    /**
     * Constructeur d'objets de classe Key
     */
    public Key(String kName, Door d)
    {
        super(kName);
        door = d;
    }

    public Door getDoor()
    {
        return door;
    }
}
